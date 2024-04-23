package Interface;

public class Mp3Player implements Music {

	@Override
	public void play() {
		System.out.println("MP3플레이어에서 '릴러말즈'의 한개도 몰라를 재생합니다.");

	}

	@Override
	public void stop() {
		System.out.println("MP3플레이어에서 '릴러말즈'의 한개도 몰라를 정지합니다.");

	}

}
