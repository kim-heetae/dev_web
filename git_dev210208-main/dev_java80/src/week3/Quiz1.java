package week3;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    // 지구몸무게 * 0.17 = 달 몸무게 달에서 너의 몸무게를 구하시오
	     double wEarth = 0;
	     double wMoon = 0.17;
	     double result = 0;
	     Scanner sc = new Scanner(System.in);
	     //시스템(내가 사용하고 있는 컴퓨터)에서 in(입력 장치로부터)
	     System.out.println("지구에서 너의 몸무게는 얼마나 나가니?");
	     
	     wEarth = sc.nextDouble();
	     System.out.println("지구에서 너의 몸무게는 "+wEarth+"kg이나 나가는구나!");
	     
	     wEarth = wEarth * wMoon;
	     System.out.println("너는 달에서 "+wEarth+"kg나가는구나!");
	     
		
		
		
	}

}
