package week3;

import java.util.Scanner;

public class WeekTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		
		int a, b = 0;
           int i, j = 0;
                    int result = 0;
           Scanner sc = new Scanner(System.in);           
           System.out.println("정수 2개를 입력하세요");        
		a = sc.nextInt();
		b = sc.nextInt();		
		System.out.println("========");		
		if(a >= b) {  
			for(i = b;  i<=a; i++) {//3의 배수 구하는 for문 시작				
				if(i % 3 == 0) {
					++result;
					}
					}//3의 배수 구하는 for문 끝
					}//if문 끝
		 if(b > a) { //else if문 시작
			for(j = a; j < b; j++) {
				if(j % 3 == 0) {
					++result;					
				}				
			}
						
		}// else if문끝		
		else {
			System.out.println("잘못입력하셨습니다.");
		}
				
		System.out.println(result);
		

		
		
		
		
	}

}
