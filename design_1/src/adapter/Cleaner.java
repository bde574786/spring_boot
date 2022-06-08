package adapter;

public class Cleaner implements IElectronic110v {

	@Override
	public void connect() {
		System.out.println("청소기 연결 100v On");
	}
	
}
