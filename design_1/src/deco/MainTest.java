package deco;


/**
 * 
 * @author ITPS
 * 데코레이션 패턴은 기본 뼈대(클래스) 유지하되, 이후 필요한 기능을 꾸밀 때 사용한다.
 *
 *
 */

public class MainTest {

	public static void main(String[] args) {
		
		ICar audi = new Audi(1_000);
		audi.showPrice();
		
		ICar a3 = new A3(audi, "A3", 3000);
		a3.showPrice();
	}
	
}
