package Java_0419;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPrac {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("문자를 입력해주세요. : ");
			String text = scan.nextLine();
			
			if("exit".equals(text)) {
				break;
			}
			list.add(text);
		}
		for(String result : list) {
			System.out.println(result);
		}
		scan.close();

	}

}
