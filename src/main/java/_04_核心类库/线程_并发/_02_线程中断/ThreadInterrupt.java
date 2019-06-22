package _04_核心类库.线程_并发._02_线程中断;

public class ThreadInterrupt {
	public static void main(String[] args) {
		new Thread(){
			public void run() {
				interrupt();
				for (int i = 0; i < 10; i++) {
					System.out.println("before:" + Thread.currentThread().isInterrupted());
					if(i == 5){
						System.out.println(interrupted());
					}
					System.out.println("after:" + Thread.currentThread().isInterrupted());
					System.out.println(i + "-------------------");
				}
			};
		}.start();
	}
	
}
