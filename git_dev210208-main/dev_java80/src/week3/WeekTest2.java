package week3;

import java.util.Scanner;

//등비수열은 각 항의 앞에 일정한 수를 곱해서 이루어지는 수열을 달합니다.
//첫번째 부터 7번째까지의
//수열을 출력하시오.
public class WeekTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int i, j = 0;
      int k = 0;
      int result = 0;
      Scanner sc = new Scanner(System.in);
      
      System.out.println("첫번째로 시작할 수를 입력하세요");
       i = sc.nextInt();
      System.out.println("원하는 비를 입력하세요");
        j = sc.nextInt();
      
      for(k = 1; k < 8; k++) {
    	  
    	  
    	  result = i * j;
    	 System.out.println(result); 
    	    	  i = result;
      }
		
		
		
		
		
	}

}
