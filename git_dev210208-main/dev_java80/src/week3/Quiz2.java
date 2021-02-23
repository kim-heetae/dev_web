package week3;
/*
 * 1부터 N까지의 정수의 합계를 구하시오// 변수가 2개 필요할것이다.
 * 
 */

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
       //  1부터 end까지 숫자를 세는 변 수임 -->start
         int end = 0;
        int hap = 0; // 0 으로하는 이유는 합을 구할때 결과값에 영향을 줄 수 있으니까 0으로 초기화하렴
         
		 int  start = 0;
		 System.out.println("정수 들어오세요");   
		 end = sc.nextInt();
		
		 
		for(start =1; start <= end ;start++) {
			
			hap = hap + start;			
			//System.out.println(start);
			
			
			
		}
		System.out.println(hap);
		
	}

}
