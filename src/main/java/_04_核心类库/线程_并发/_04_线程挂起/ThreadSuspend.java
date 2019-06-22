package _04_核心类库.线程_并发._04_线程挂起;

public class ThreadSuspend {
	private static  ThreadSuspend s = new ThreadSuspend();
	
	private static  SuspendThread t1 = new SuspendThread("t1");
	private static SuspendThread t2 = new SuspendThread("t2");
	
	static class SuspendThread extends Thread{
		public SuspendThread(){
			
		}
		
		public SuspendThread(String threadName) {
			super.setName(threadName);
		}
		
		@Override
		public void run() {
			synchronized (s) {
				System.out.println("ThreadName:" + getName());
				Thread.currentThread().suspend();
			}
		}
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		t1.start();
		t1.sleep(200);
		t1.resume();
		t2.start();
		t2.resume();
		
		
//		t1.start();
//		t1.sleep(200);
//		t1.resume();
//		t2.start();
//		t1.sleep(200);
//		t2.resume();
	}
}
