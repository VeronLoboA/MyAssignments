package week4.day1;

public class OverridingSubclass extends MethodOverriding {
	public void reportStep() {
		System.out.println("Overiding steps not reported");
		
	}
	public static void main(String[] args) {
		OverridingSubclass subclass = new OverridingSubclass();
		subclass.reportStep();
		subclass.takeSnap();
		
	}

}
