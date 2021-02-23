package week3;

import java.util.Scanner;

/*
class Common{
	public double moonWeight(double wEarth) {
		//달에서의 몸무게
		double wMoon =0.0;
		wMoon=(wEarth*17)/100.0;//(double*int)/int=double
		
		return wMoon;
}
}

 */

public class Quiz1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    // 지구몸무게 * 0.17 = 달 몸무게 달에서 너의 몸무게를 구하시오
	     double wEarth = 0;
	     
	     Scanner sc = new Scanner(System.in);
	     //시스템(내가 사용하고 있는 컴퓨터)에서 in(입력 장치로부터)
	     System.out.println("지구에서 너의 몸무게는 얼마나 나가니?");
	     
	    
	     double wMoon = 0.0;
	     Quiz1_3 q3 = new Quiz1_3();
	     Common cm = new Common();
	     wMoon = cm.moonWeight(wEarth);
	     System.out.println("지구에서 너의 몸무게는 "+wEarth+"kg이나 나가는구나!");
	     System.out.println("너는 달에서 "+wEarth+"kg나가는구나!");
	     
		
		
		
	}

}
