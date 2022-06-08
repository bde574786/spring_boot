package adapter;

public class HairDryer implements IElectronic110v {

	@Override
	public void connect() {
		System.out.println("헤어 드라이기 연결 110v On");
	}
	
}
