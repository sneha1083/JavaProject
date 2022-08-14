package Interface_study;

public class TataProduction implements TataCommunication{
	//TataProduction class implements sub interface TataCommunication
	// as TataCommunication is sub interface, that its own property and properties form TATA
	//The implementation part is hidden by the user who uses the interface.
	
	public void Company() {
		System.out.println("Mnc Company");
	}
	
    

	public static void main(String[] args) {
		TataProduction tp = new TataProduction();
		tp.wireless();
		tp.cramerApplication();
		tp.ItTeam();
		tp.network();
		tp.Company();
		tp.msg();
	

	}
	public void wireless(){
		System.out.println("This wireless is from super inteface Tata");
	}
	@Override
	public void cramerApplication() {
	 System.out.println("This  cramer application is from super interface Tata");
		
	}
	@Override
	public void network() {
		System.out.println("This network is from sub interface TataCommunication");		
	}
	@Override
	public void ItTeam() {
		System.out.println("This ItTeam is from sub interface TataCommunication");		
	}
	
	
}
