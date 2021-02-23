package week3;

/**
 * 에러에는 두가지가 있다.
 * 하나는 컴파일 타임 에러이고 - 문법 에러이고...
 * 두번째는 런타임 에러이다. - 실행 오류이다.(논리의 오류이다.)
 * 
 */



import java.util.Scanner;


class Common{
	public double moonWeight(double wEarth) {
		//달에서의 몸무게
		double wMoon =0.0;
		wMoon=(wEarth*17)/100.0;//(double*int)/int=double
		
		return wMoon;
}
	}


public class Quiz1_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    // 지구몸무게 * 0.17 = 달 몸무게 달에서 너의 몸무게를 구하시오
	     double wEarth = 0;
	     
	     Scanner sc = new Scanner(System.in);
	     //시스템(내가 사용하고 있는 컴퓨터)에서 in(입력 장치로부터)
	     System.out.println("지구에서 너의 몸무게는 얼마나 나가니?");
	     try {
	    	 wEarth = sc.nextDouble();
	     }
	     catch(Exception e) {
	    	 System.out.println("EX" +e.toString());
	    	 
	     }
	     
	     
	     
	    if(sc.hasNextDouble()) {	    	//너 입력한 값이 더블이니? 네
	    	double wMoon = 0.0;
	    	Quiz1_5 q5 = new Quiz1_5();
	    	Common cm = new Common();
	    	wMoon = cm.moonWeight(wEarth);
	    	System.out.println("지구에서 너의 몸무게는 "+wEarth+"kg이나 나가는구나!");
	    	System.out.println("너는 달에서 "+wEarth+"kg나가는구나!");
	    
	    }
	    else {
	    	System.out.println("실수를 입력해라 ㅡㅡ");
	    	return; //main 메소드 탈출한다. 22번 아래는 진행할 필요가 없어요.없으면 안빠져나간다.
	    }
	    
	    
System.out.println("요기요기..");	     
		
		
		
	}

}
