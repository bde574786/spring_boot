package proxy1;

public class ProxyMain {

	public static void main(String args[]) {
        Image image1 = new ProxyImage("test1.jpg");
        Image image2 = new ProxyImage("test2.jpg");
        
        image1.displayImage(); 
        image2.displayImage();
        
        // RealImage에 직접 접근하지 않고 ProxyImage 객체를 생성하여 대신 시킴
        
    }
}
