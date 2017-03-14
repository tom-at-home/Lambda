public class ThreadWithLambda {
	
	String message = "Eine Nachricht von Lambda";

	public static void main(String[] args){

		ThreadWithLambda t = new ThreadWithLambda();
		t.showMessage();
		
	}
	
	public void showMessage(){
		
		Runnable r = () -> {

				while(true) {
					System.out.println(message + ": \n" + Thread.currentThread().getName() + " lauft gerade.");
					
					try {
						Thread.sleep(1000);
					}catch( InterruptedException e) {}
			}
		};
		
//		Thread t = new Thread(r);
//		t.start();
		new Thread(r).start();
		
	}
}
