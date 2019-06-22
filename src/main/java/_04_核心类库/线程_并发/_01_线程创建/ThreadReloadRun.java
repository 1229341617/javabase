package _04_核心类库.线程_并发._01_线程创建;

public class ThreadReloadRun{
	public static void main(String[] args) {
		new Thread(){
			public void run() {
				System.out.println("ThreadReloadRun.main()");
			};
		}.start();
	}
}
