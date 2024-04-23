package Interface;

public class CdPlayer implements Music {

	@Override
	public void play() {
		System.out.println("CD 플레이어에서 '유우리'의 베텔기우스를 재생합니다.");

	}

	@Override
	public void stop() {
		System.out.println("CD 플레이어에서 '유우리'의 베텔기우스를 정지합니다.");

	}

}
