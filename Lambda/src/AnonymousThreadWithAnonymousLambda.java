
public class AnonymousThreadWithAnonymousLambda {

	String message = "Eine Nachricht von Lambda";

	public static void main(String[] args){

		AnonymousThreadWithAnonymousLambda t = new AnonymousThreadWithAnonymousLambda();
		t.showMessage();
		
	}
	
	public void showMessage(){
		
		new Thread ( () -> {

				while(true) {
					System.out.println(message + ": \n" + Thread.currentThread().getName() + " lauft gerade.");
					
					try {
						Thread.sleep(1000);
					}catch( InterruptedException e) {}
			}
		}).start();
		
//		Thread t = new Thread(r);
//		t.start();

		
	}
	
}
