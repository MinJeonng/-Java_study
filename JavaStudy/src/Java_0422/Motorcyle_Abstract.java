package Java_0422;

public class Motorcyle_Abstract extends Abstract {

	public Motorcyle_Abstract(String name) {
		super(name);
	}

	// 추상메소드 구현
	public void start() {
		System.out.println(super.getName() + "오토바이 부릉 ");
	}

}
