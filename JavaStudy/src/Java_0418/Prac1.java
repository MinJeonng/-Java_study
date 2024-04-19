package Java_0418;

public class Prac1 {
    public double calc(int radius) {
        return radius * Math.PI * radius;
    }
    
    public int calc(int vertical, int horizontal) {
        return vertical * horizontal;
    }
    
   
    public double calc(double height, double base) {
        return height * base / 2;
    }
    
    public static void main(String[] args) {
        Prac1 operator = new Prac1();
        
        System.out.printf("반지름이 %d인 원의 넓이 : %f\n", 5, operator.calc(5));
        System.out.printf("가로 %d, 세로 %d인 직사각형의 넓이 : %d\n", 4, 7, operator.calc(4, 7));
  
        System.out.printf("밑변 %f, 높이 %f인 삼각형의 넓이 : %f\n", 6.0, 3.0, operator.calc(6.0, 3.0));
    }
}


