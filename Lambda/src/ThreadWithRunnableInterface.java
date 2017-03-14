public class ThreadWithRunnableInterface {
	
	String message = "Eine Nachricht";

	public static void main(String[] args){

		new ThreadWithRunnableInterface().showMessage();
		
	}
	
	public void showMessage(){
		
		Thread thread = new Thread( new Runnable() {
			
			public void run() {
				while(true) {
					System.out.println(message);
					
					try {
						Thread.sleep(1000);
					}catch( InterruptedException e) {}
			}
		}});
		
		thread.start();
		
	}
}
