package InterviewSampleCode;

public class createDeadLock {

	public static void main(String[] args) {
		final String str1 = "Rajesh Kumar";
		final String str2 = "Rohit Kumar";

		Thread t1 = new Thread() {
			public void run() {
				synchronized (str1) {
					System.out.println("Thread 1: Locking str1");
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						e.printStackTrace();
					}
					synchronized (str2) {
						System.out.println("Thread 1: Locking str2");
					}
				}
			}
		};

		Thread t2 = new Thread() {
			public void run() {
				synchronized (str2) {
					System.out.println("Thread 2: Locking str2");
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						e.printStackTrace();
					}
					synchronized (str1) {
						System.out.println("Thread 2: Locking str1");
					}
				}
			}
		};

		t1.start();
		t2.start();
	}
}