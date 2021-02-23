package week3;
/*
 * ++i는 i = i + 1; 과 같다.
 * --i는 i = i - 1; 과 같다. 
 * i++ 후위 연산자 이므로 먼저 비교하고 나중에 1을 증가시킴
 * ++i는 전위 연산자이다.
 * 
 * 
 */




public class VariableWeek3 {

	public static void main(String[] args) {
		
		
		int i = 1;
		int j = 2;
		
		if((++i>j--)&(i>j)) {//x
			// 실행되는가?
			System.out.println("T");
			
		}
		else {//o
			// 실행되나?
			System.out.println("F");
		}
		
		
		// 변수 초기화가 있을 때 와 없을때 차이가 있습니까? 네
		
		i = 1;
		j=2;
		if((++i>j--)&&(++i>j)) { //x
			
			System.out.println("두번쨰 if 문 실행");
		}
		else { //o
			System.out.println("else로 빠져나갔다");
			
		}
	}}
	
	