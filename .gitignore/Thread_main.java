class Thread_main {

	public static void main(String args[]) {

		new Create_A_Thread(); 

		try {

			for(int i = 5; i > 0; i--) {

				System.out.println("Main Thread: " + i);

				Thread.sleep(1000);

			}

		} catch (InterruptedException e) {
	
			System.out.println("Main thread interrupted.");
	
		}
	
		System.out.println("Main thread exiting.");
  
	}

}