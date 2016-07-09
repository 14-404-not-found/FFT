import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/**
 * フーリエ変換するクラス
 * 
 * @author admin
 * 
 */
public class FFT {
	byte[] data;
	double syuhasu;// 最終的に求められた周波数
	double onryou;// 最終的に求められた音量

	// サンプリングレート
	// 周波数の2倍でサンプリングすれば元を再現可能なので、44.1kHz(44100回/秒)でデータを取るならば、22kHzまではサンプリングできる。
	int SAMPLING_RATE = 44100;
	// FFTのポイント数
	int FFT_SIZE = 4096;

	// デシベルベースラインの設定
	double dB_baseline = Math.pow(2, 15) * FFT_SIZE * Math.sqrt(2);

	// 分解能の計算
	double resol = ((SAMPLING_RATE / (double) FFT_SIZE));

	int bufSize;
	boolean bIsRecording = false;

	// AudioRecord audioRec = null;

	FFT(byte[] data) {
		this.data = data;
		bufSize = GetSound.byteSize;
	}

	public void start() {
		// エンディアン変換
		ByteBuffer bf = ByteBuffer.wrap(data);
		bf.order(ByteOrder.LITTLE_ENDIAN);
		short[] s = new short[(int) bufSize];
		for (int i = bf.position(); i < bf.capacity() / 2; i++) {
			s[i] = bf.getShort();
		}

		// FFTクラスの作成と値の引き渡し
		FFT4g fft = new FFT4g(FFT_SIZE);
		double[] FFTdata = new double[FFT_SIZE];
		for (int i = 0; i < FFT_SIZE; i++) {
			FFTdata[i] = (double) s[i];
		}
		fft.rdft(1, FFTdata);

		// デシベルの計算
		double[] dbfs = new double[FFT_SIZE / 2];
		double max_db = -120d;
		int max_i = 0;
		for (int i = 0; i < FFT_SIZE; i += 2) {
			dbfs[i / 2] = (int) (20 * Math.log10(Math.sqrt(Math.pow(FFTdata[i],
					2) + Math.pow(FFTdata[i + 1], 2))
					/ dB_baseline));
			if (max_db < dbfs[i / 2]) {
				max_db = dbfs[i / 2];
				max_i = i / 2;
			}
		}

		// 音量が最大の周波数と，その音量を表示
		syuhasu = resol * max_i;
		onryou = max_db;

	}

}
