package Interface;

public class MusicPlayer {

	// 리더님꺼 보고 다형성 이용하는 방법도 다시 확인하기
	public static void main(String[] args) {
		Music cd = new CdPlayer();
		Music mp3 = new Mp3Player();

		System.out.println("===CD Player===");
		cd.play();
		cd.stop();
		System.out.println("===MP3 Player===");
		mp3.play();
		mp3.stop();

		// 배열을 사용해서 다형성
//		Music[] musics = { cd, mp3 };
//		for (Music music : musics) {
//			System.out.println("===CD Player===");
//			cd.play();
//			cd.stop();
//			System.out.println("===MP3 Player===");
//			mp3.play();
//			mp3.stop();
//
//		}

	}

}
