package kh.java.thread;

public class Gamble implements Runnable {

	private int dad;
	private long millis;

	public Gamble(int dad, long millis) {
		this.dad = dad;
		this.millis = millis;
	}

	@Override
	public void run() {
		String threadName = Thread.currentThread().getName();
		int i = 1;
		while (true) {
			int prod = i++ * dad;
			if(prod < 100)
				System.out.println("["+threadName + " - " + prod+"]");
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
