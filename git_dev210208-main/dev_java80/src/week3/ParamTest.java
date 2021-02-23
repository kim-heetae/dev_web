package week3;
class Param{
	int ival; // 전변은 초기화 생략 가능 그래도 0임.
}
public class ParamTest {
	void effectParam( Param p) {
		//p=new Param();// insert here일때는 얼마가 출력되는 것일까요?
		 p.ival = 500;
		System.out.println(p.ival); // 이게 얼마냐? 질문1
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
	ParamTest p = new ParamTest();
	Param pt = new Param(); //있을때 없을때 구분해보기 차이를 내가알아야함
		pt.ival = 100; 
		
		p.effectParam(pt);
		System.out.println("main ival =" + pt.ival);
		
	}

	
	
	
}
