package Interface;

public class MusicPlayer {

	public void MusicPlayer(Music player, String play) {
		System.out.println("===" + play + "Player ===");
		player.play();
		player.stop();
	}

	public static void main(String[] args) {

		// 일일히 값을 보내는 방법
//		Music cd = new CdPlayer();
//		Music mp3 = new Mp3Player();
//
//		System.out.println("===CD Player===");
//		cd.play();
//		cd.stop();
//		System.out.println("===MP3 Player===");
//		mp3.play();
//		mp3.stop();

		// 다형성
		// MusicPlayer클래스는 어떤 플레이어가 재생되고 정지되는지 굳이 알 필요없으니, 공통적으로 작용되는건 클래스로 만들어놓고 ,
		// Music이라는 interface를 instance해서 하면 값을
		// 직접 주지 않으니 여러개의 값을 추가하기 편함
		MusicPlayer music = new MusicPlayer();
		Music cd = new CdPlayer();
		Music mp3 = new Mp3Player();
		music.MusicPlayer(mp3, "MP3");
		music.MusicPlayer(cd, "cd");

	}

}

/*
 * Music 인터페이스를 구현하는 어떤 객체든 (CdPlayer, Mp3Player 등) MusicPlayer의 MusicPlayer
 * 메서드에 전달될 수 있다는 것을 의미. 이 방식을 사용함으로써, MusicPlayer 클래스는 특정한 Music 구현체가 아니라 Music
 * 인터페이스의 메서드(play, stop)만을 호출. 따라서 새로운 Music 구현체가 추가되더라도 MusicPlayer 클래스를 변경할
 * 필요가 없으며, 이는 코드의 유지 보수성을 향상
 */
