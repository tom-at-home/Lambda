interface LambdaInterface{
	public void print();
}

interface LambdaInterface2{
	public void print(String s);
}


public class LambdaExample {
	
	String s = "Hallo Welt";

	
	public void start(){

		// Ausgeschriebene Variante mit Functional Interface aber ohne Lambda
		LambdaInterface li = new LambdaInterface() {
			
			@Override
			public void print() {
				System.out.println("Hallo");
	
			}
		};
		
		// Kurzform mit Lambda ohne Parameter
		LambdaInterface li2 = () -> {System.out.println("Nochmal Hallo");};
		
		// Kurzform mit Lambda mit Parameter inkl. Datentyp
		LambdaInterface2 li3 = (String s) -> {System.out.println(s);};
		
		// Kurzform mit Lambda mit Parameter OHNE Angabe des Datentyps (String)
		LambdaInterface2 li4 = (s) -> {System.out.println(s);};
		
		li.print();
		li2.print();
		li3.print(s);
		li4.print(s + " mit Zusatz");
		
	}
	
	public static void main(String[] args){
		new LambdaExample().start();
	}
	
	
}
