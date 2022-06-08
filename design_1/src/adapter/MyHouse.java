package adapter;

public class MyHouse {

	// 함수와 메서드의 차이점이 뭔가요?
	
	// 집에 전기 콘센트에 연결하는 동작
	public static void homeConnect(IElectronic220v electronic220v) {
		electronic220v.connect();
	}
	
	public static void main(String[] args) {
		
		// 1. 에어컨
		// 2. 헤어드라이기
		// 3. 청소기
		
		// 추상화를 해주세요 !!! (공통적인 동작)
		// connect(); 사용하려면 전기가 필요해서 연결하는 동작을 구현해야 한다.
		
		// 문제 인식
		// 친구가 일본에서 결혼 선물, 청소기, 헤어드라이기 선물
		// 110v 동작하는데 에어컨은 220v로 동작
		
		// 사용해보기
		AirConditioner airConditioner = new AirConditioner();
		// 집에 전기 콘센트에 연결
		homeConnect(airConditioner);
		
		HairDryer hairDryer = new HairDryer();
//		homeConnect(hairDryer);
		
		Cleaner cleaner = new Cleaner();
//		homeConnect(cleaner);
		
		// 어댑터 구매해서 사용하기
		ElectronicAdapter adapter1 = new ElectronicAdapter(hairDryer);
		// 집에 있는 콘센트에 연결하기
		homeConnect(adapter1);
		
		ElectronicAdapter adapter2 = new ElectronicAdapter(cleaner);
		homeConnect(adapter2);
	}

}
