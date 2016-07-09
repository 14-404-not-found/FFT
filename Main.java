/**
 * メインとなるクラス。GetSoundクラスが渡す周波数と音量を受けてパターン別に整数を返す。
 * 
 * @author admin
 * 
 */
public class Main {
	public static void main(String[] args) {
		GetSound gs = new GetSound();
		System.out.println(gs.syuhasu+","+gs.onryou);
	}
}
