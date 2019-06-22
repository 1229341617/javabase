package _04_�������.�߳�_����._07_�߳�ͬ��;

public class ObjExtThread extends Thread{
	private static ObjExtThread instance = new ObjExtThread();
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
		Thread t1 = new ObjExtThread();
		Thread t2 = new ObjExtThread();
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(count);
	}
}
