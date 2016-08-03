import java.io.*;

import javax.sound.sampled.*;

/**
 * 音声を録音し、FFTクラスを用いて周波数（Hz）を渡すクラス
 * 
 * @author admin
 * 
 */
public class GetSound {

	// リニアPCM 16bit 2000Hz × 1秒間 = 16000byte
	//数値を大きくすると録音時間が増える
	public static final int byteSize = 8000;
	static byte[] voiceData = new byte[byteSize];
	static double syuhasu;
	static double onryou;

	GetSound(){
		try {
			System.out.println("マイク入力開始...");

			// リニアPCM 8000Hz 16bit モノラル 符号付き リトルエンディアン
			AudioFormat linearFormat = new AudioFormat(22000, 16, 1, true, false);

			// ターゲットデータラインを取得する
			DataLine.Info info = new DataLine.Info(TargetDataLine.class,
					linearFormat);
			TargetDataLine targetDataLine = (TargetDataLine) AudioSystem
					.getLine(info);

			// ターゲットデータラインをオープンする
			targetDataLine.open(linearFormat);

			// マイク入力開始
			targetDataLine.start();

			// ターゲットデータラインから入力ストリームを取得する
			AudioInputStream linearStream = new AudioInputStream(targetDataLine);

			// 入力ストリームから音声データをByte配列へ取得する
			linearStream.read(voiceData, 0, voiceData.length);

			FFT fft = new FFT(voiceData);
			fft.start();

			// マイク入力停止
			targetDataLine.stop();

			// ターゲットデータラインをクローズする
			targetDataLine.close();

			System.out.println("マイク入力停止");
			
			syuhasu = fft.syuhasu;
			onryou = fft.onryou;
			System.out.println("周波数：" + syuhasu + " [Hz] 音量：" + onryou
					+ " [dB]");
			/*
			 * // AUファイルへ書き出す File audioFile = new File("guitar.au");
			 * ByteArrayInputStream baiStream = new
			 * ByteArrayInputStream(voiceData); AudioInputStream aiStream = new
			 * AudioInputStream(baiStream, linearFormat, voiceData.length);
			 * AudioSystem.write(aiStream, AudioFileFormat.Type.AU, audioFile);
			 * aiStream.close(); baiStream.close();
			 * 
			 * System.out.println("ファイルへ書き出し終了");
			 */
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
