package Java_0418;
import java.util.Scanner;
import java.math.BigDecimal;


public class Prac2 {
	public static BigDecimal add(BigDecimal a, BigDecimal b) {
        return a.add(b);
    }

    public static BigDecimal subtract(BigDecimal a, BigDecimal b) {
        return a.subtract(b);
    }

    public static BigDecimal multiply(BigDecimal a, BigDecimal b) {
        return a.multiply(b);
    }

    public static BigDecimal divide(BigDecimal a, BigDecimal b) {
        return a.divide(b);
    }

	public static void main(String[] args) {
		System.out.println("숫자를 두개를 입력하세요 ");
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		BigDecimal number1 = new BigDecimal(a);
	    BigDecimal number2 = new BigDecimal(b);
	     
	    System.out.println("더하기: " + add(number1, number2));
	    System.out.println("빼기: " + subtract(number1, number2));
	    System.out.println("곱하기: " + multiply(number1, number2));
	    System.out.println("나누기: " + divide(number1, number2));
		
		
		
		scan.close();
	}

}
