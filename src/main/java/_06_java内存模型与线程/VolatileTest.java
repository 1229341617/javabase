package _06_java内存模型与线程;

public class VolatileTest {
	public static final int THREAD_COUNT = 20;
	
	public static Thread[] threads = new Thread[THREAD_COUNT];
	
	public volatile static int i;
	
	
	
	public static void main(String[] args) throws InterruptedException {
		createThreads();
		startThreads();
		doTest();
	}

	private static void doTest() {
		while(Thread.activeCount() > 1){
			Thread.yield();
		}
		System.out.println(i);
	}

	private static void startThreads() {
		for (int i = 0; i < THREAD_COUNT; i++) {
			threads[i].start();
		}
	}

	private static void createThreads() {
		for (int i = 0; i < THREAD_COUNT; i++) {
			threads[i] = new Thread(){
				public void run() {
					for (int j = 0; j < 1000000; j++) {
						increase();
					}
				}
			};
		}
	}
	
	public static void increase(){
		i++;
	}
	
	
	
}
