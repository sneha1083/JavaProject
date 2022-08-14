package Interface_study;

public class SimCompany implements Airtel_Sim, Jio_Sim{
	//multiple inheritance achieved here, one child class simcompany implements two interface like airtel and jio

	public static void main(String[] args) {
		SimCompany sc = new SimCompany();
		sc.m1();
		sc.m2();
		sc.m3();
		sc.m4();
		System.out.println(a);
		System.out.println(i);
		

	}
	public void m1() {
	}{
		System.out.println("one day pack is RS.25");
	
	}
	public void m2() {
		System.out.println("two day pack is RS60");
	}
	
	public void m3() {
		System.out.println("one day pack for jio is RS.10");
	}
	public void m4() {
		System.out.println("Two day pack for jio is RS.20");
	}

}
