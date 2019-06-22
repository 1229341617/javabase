package _04_�������.�߳�_����._07_�߳�ͬ��;

public class StaticMethod implements Runnable{
	private static int count;
	
	@Override
	public void run() {
		for (int i = 0; i < 10000000; i++) {
			increase();
		}
	}

	synchronized private static void increase() {
		count++;
	}
	
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new StaticMethod());
		Thread t2 = new Thread(new StaticMethod());
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(count);
	}
}
