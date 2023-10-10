public class InterfaceDemo1 {
	public static void main(String[] args) {
		Mobile mobile = new IPhone15(); // polymorphic object
		mobile.camera();
		mobile.memory();
		mobile.fetaures();
	}
}
interface Mobile {
	int x = 10;  			// public static final int x = 10;
	void camera(); 	// public abstract void cameraFeature();
	void memory();
	void fetaures();
}
class IPhone15 implements Mobile {
	public void camera() {
		System.out.println("iPhone15 Camera Details");
	}
	public void memory() {
		System.out.println("iPhone15 Memory Details");
	}
	public void fetaures() {
		System.out.println("iPhone15 Feature Details");
	}
}
