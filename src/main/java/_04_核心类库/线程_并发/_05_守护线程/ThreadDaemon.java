package _04_�������.�߳�_����._05_�ػ��߳�;

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
