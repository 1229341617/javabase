package _04_核心类库.线程_并发._03_线程睡眠;

public class ThreadSleep {
	public static void main(String[] args) {
		new Thread(){
			public void run() {
				for (int i = 0; i < 5; i++) {
					if(Thread.currentThread().isInterrupted()){
						System.out.println("中断了。。。");
					}
					
					try {
						Thread.currentThread().sleep(2000);
						System.out.println("a");
						throw new InterruptedException("error");
					} catch (InterruptedException e) {
						e.printStackTrace();
						Thread.currentThread().interrupt();//出现中断异常后如果在catch中不设置中断位的话该线程将检测不到中断信息
					}
				}
			};
		}.start();
	}
}
