package Interface_study;

public interface TataCommunication extends Tata {
	//one interface can extend another interface by using extend keyword
	public void network();
	public void ItTeam();
	default void msg() {
		//method inside interface are default, public, abstarct
		System.out.println("default method only declare in interface and can body provided");
	}
	

}
//a class extends another class, an interface extends another interface, but a class implements an interface.