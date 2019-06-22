package _04_核心类库.线程_并发._07_线程同步;

public class ObjExtThreadErr extends Thread{
	private ObjExtThreadErr instance = new ObjExtThreadErr();
	private static int count;
	
	
	@Override
	public void run() {
		synchronized (instance) {
			for (int i = 0; i < 10000000; i++) {
				count++;
			}
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new ObjExtThreadErr();
		Thread t2 = new ObjExtThreadErr();
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(count);
	}
}
