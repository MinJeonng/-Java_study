package Generic;

public class Main {
	public static void main(String[] args) {
		Calculator<Integer> calcInt = new Calculator<Integer>(10, 7);
		Calculator<Double> calcDouble = new Calculator<Double>(2.56, 3.45);

		System.out.println("Integer Sum : " + calcInt.add());
		System.out.println("Double Sum : " + calcDouble.add());
	}
}
