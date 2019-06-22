package _04_核心类库.线程_并发._05_守护线程;

public class ThreadDaemon {
	public static void main(String[] args) {
		Thread t = new Thread(){
			@Override
			public void run() {
				System.out.println("a");
			}
		};
		t.setDaemon(true);
		t.start();
	}
}
