package _04_�������.�߳�_����._01_�̴߳���;

public class ThreadReloadRun{
	public static void main(String[] args) {
		new Thread(){
			public void run() {
				System.out.println("ThreadReloadRun.main()");
			};
		}.start();
	}
}
