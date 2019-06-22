package _04_核心类库.线程_并发._07_线程同步;

public class MethodExtThreadErr extends Thread{
	private static int count;
	
	@Override
	public void run() {
		for (int i = 0; i < 10000000; i++) {
			increase();
		}
	}

	private synchronized void increase() {
		count++;
	}
	
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new MethodExtThreadErr();
		Thread t2 = new MethodExtThreadErr();
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(count);
	}
}
