package _04_�������.�߳�_����._06_���ȼ�;
public class ThreadPriority {
	
	 static class HighPriority extends Thread{
		private int count;
		public void run() {
			while(true){
				synchronized (ThreadPriority.class) {
					count++;
					if(count > 10000000){
						System.out.println("ThreadPriority.HighPriority.run()");
						break;
					}
				}
			}
		}
	}
	 
	static class LowPriority extends Thread{
		private int count;
		public void run() {
			while(true){
				synchronized (ThreadPriority.class) {
					count++;
					if(count > 10000000){
						System.out.println("ThreadPriority.LowPriority.run()");
						break;
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Thread high = new ThreadPriority.HighPriority();
		Thread low = new ThreadPriority.LowPriority();
		
		high.setPriority(Thread.MAX_PRIORITY);
		low.setPriority(Thread.MIN_PRIORITY);
		
		low.start();
		high.start();
	}
}
