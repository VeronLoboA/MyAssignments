package week4.day1;

public class MethodOverloading {
	public void reportStep(String msg,String status) {
		System.out.println("Hello"+msg+"\n"+status+"completed");
		
	}
	public void reportStep(String msg,String status,Boolean snap) {
		System.out.println("Hello"+msg+"\n"+status+"completed"+"\n"+"Snapshot taken"+snap);
	
}

public static void main(String[] args) {
	MethodOverloading overloading = new MethodOverloading();
	overloading.reportStep("Team", "Project status is");
	overloading.reportStep("World", "Status is", true);
}
	

}
