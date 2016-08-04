/**
 * メインとなるクラス。GetSoundクラスが渡す周波数と音量を受けてパターン別に整数を返す。
 * 
 * @author admin
 * 
 */
public class Main {
	static int n = 0;
	static GetSound gs = new GetSound();
	static int count = 5;// 繰り返しの回数

	public static void main(String[] args) {
		// System.out.println(gs.syuhasu+","+gs.onryou);
		gs = new GetSound();
		// TODO 取得音量要調整
		while (true) {
			// -50デシベル以上の音量のみ
			if (gs.onryou >= -50) {
				// 周波数別に整数を割り当て
				getNum();

				if (n == 10) {
					for (int i = 0; i < count; i++) {
						gs = new GetSound();
						getNum();

						// TODO URL送信部分の記述をお願いしますm(__)m
					}
				}
			}
			
			gs = new GetSound();
		}
	}

	static void getNum() {
		if (gs.syuhasu >= 80 && gs.syuhasu <= 84.85) {// E2
			n = 10;
		} else if (gs.syuhasu > 84.85 && gs.syuhasu <= 89.90) {// F2
			n = 11;
		} else if (gs.syuhasu > 89.90 && gs.syuhasu <= 95.2489295) {// F#2
			n = 12;
		} else if (gs.syuhasu > 95.2489295 && gs.syuhasu <= 100.9125167) {// F2
			n = 13;
		} else if (gs.syuhasu > 100.9125167 && gs.syuhasu <= 106.9130872) {// F2
			n = 14;
		} else if (gs.syuhasu > 106.9130872 && gs.syuhasu <= 113.2704702) {// F2
			n = 15;
		} else if (gs.syuhasu > 113.2704702 && gs.syuhasu <= 120.0058828) {// F2
			n = 16;
		} else if (gs.syuhasu > 120.0058828 && gs.syuhasu <= 127.141804) {// F2
			n = 17;
		} else if (gs.syuhasu > 127.141804 && gs.syuhasu <= 134.7020491) {// F2
			n = 18;
		} else if (gs.syuhasu > 134.7020491 && gs.syuhasu <= 142.7118497) {// F2
			n = 19;
		} else if (gs.syuhasu > 142.7118497 && gs.syuhasu <= 151.1979379) {// F2
			n = 20;
		} else if (gs.syuhasu > 151.1979379 && gs.syuhasu <= 160.1886352) {// F2
			n = 21;
		} else if (gs.syuhasu > 160.1886352 && gs.syuhasu <= 169.7139471) {// F2
			n = 22;
		} else if (gs.syuhasu > 169.7139471 && gs.syuhasu <= 179.8056635) {// F2
			n = 23;
		} else if (gs.syuhasu > 179.8056635 && gs.syuhasu <= 190.4974647) {// F2
			n = 24;
		} else if (gs.syuhasu > 190.4974647 && gs.syuhasu <= 201.8250334) {// F2
			n = 25;
		} else if (gs.syuhasu > 201.8250334 && gs.syuhasu <= 213.8261744) {// F2
			n = 26;
		} else if (gs.syuhasu > 213.8261744 && gs.syuhasu <= 226.5409404) {// F2
			n = 27;
		} else if (gs.syuhasu > 226.5409404 && gs.syuhasu <= 240.0117657) {// F2
			n = 28;
		} else if (gs.syuhasu > 240.0117657 && gs.syuhasu <= 254.283608) {// F2
			n = 29;
		} else if (gs.syuhasu > 254.283608 && gs.syuhasu <= 269.4040981) {// F2
			n = 30;
		} else if (gs.syuhasu > 269.4040981 && gs.syuhasu <= 285.4236994) {// F2
			n = 31;
		} else if (gs.syuhasu > 285.4236994 && gs.syuhasu <= 302.3958758) {// F2
			n = 32;
		} else if (gs.syuhasu > 302.3958758 && gs.syuhasu <= 320.3772703) {// F2
			n = 33;
		} else if (gs.syuhasu > 320.3772703 && gs.syuhasu <= 339.4278942) {// F2
			n = 34;
		} else if (gs.syuhasu > 339.4278942 && gs.syuhasu <= 359.6113271) {// F2
			n = 35;
		} else if (gs.syuhasu > 359.6113271 && gs.syuhasu <= 380.9949293) {// F2
			n = 36;
		} else if (gs.syuhasu > 380.9949293 && gs.syuhasu <= 403.6500668) {// F2
			n = 37;
		} else if (gs.syuhasu > 403.6500668 && gs.syuhasu <= 427.6523488) {// F2
			n = 38;
		} else if (gs.syuhasu > 427.6523488 && gs.syuhasu <= 453.0818808) {// F2
			n = 39;
		} else if (gs.syuhasu > 453.0818808 && gs.syuhasu <= 480.0235314) {// F2
			n = 40;
		} else if (gs.syuhasu > 480.0235314 && gs.syuhasu <= 508.5672159) {// F2
			n = 41;
		} else if (gs.syuhasu > 508.5672159 && gs.syuhasu <= 538.8081963) {// F2
			n = 42;
		} else if (gs.syuhasu > 538.8081963 && gs.syuhasu <= 570.8473989) {// F2
			n = 43;
		} else if (gs.syuhasu > 570.8473989 && gs.syuhasu <= 604.7917516) {// F2
			n = 14;
		} else if (gs.syuhasu > 604.7917516 && gs.syuhasu <= 640.7545406) {// F2
			n = 45;
		} else if (gs.syuhasu > 640.7545406 && gs.syuhasu <= 678.8557883) {// F2
			n = 46;
		} else if (gs.syuhasu > 678.8557883 && gs.syuhasu <= 719.2226541) {// F2
			n = 47;
		} else if (gs.syuhasu > 719.2226541 && gs.syuhasu <= 761.9898587) {// F2
			n = 48;
		} else if (gs.syuhasu > 761.9898587 && gs.syuhasu <= 807.3001336) {// F2
			n = 49;
		} else if (gs.syuhasu > 807.3001336 && gs.syuhasu <= 855.3046976) {// F2
			n = 50;
		} else if (gs.syuhasu > 855.3046976 && gs.syuhasu <= 906.1637615) {// F2
			n = 51;
		} else if (gs.syuhasu > 906.1637615 && gs.syuhasu <= 960.0470628) {// F2
			n = 52;
		} else if (gs.syuhasu > 960.0470628 && gs.syuhasu <= 1017.134432) {// F2
			n = 53;
		} else if (gs.syuhasu > 1017.134432 && gs.syuhasu <= 1077.616393) {// F2
			n = 54;
		} else if (gs.syuhasu > 1077.616393 && gs.syuhasu <= 1141.694798) {// F2
			n = 55;
		} else if (gs.syuhasu > 1141.694798 && gs.syuhasu <= 1209.583503) {// F2
			n = 56;
		} else if (gs.syuhasu > 1209.583503 && gs.syuhasu <= 1281.509081) {// F2
			n = 57;
		} else if (gs.syuhasu > 1281.509081 && gs.syuhasu <= 1357.711577) {// F2
			n = 58;
		} else if (gs.syuhasu > 1357.711577 && gs.syuhasu <= 1438.445308) {// F2
			n = 59;
		} else if (gs.syuhasu > 1438.445308 && gs.syuhasu <= 1523.979717) {// F2
			n = 60;
		} else if (gs.syuhasu > 1523.979717 && gs.syuhasu <= 1600) {// F2
			n = 61;
		}
	}
}
