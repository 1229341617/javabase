package _07_java���̱߳�̺��ļ���._01_java���̼߳���._06_stopthread;

public class _01_CanotStopThread extends Thread{
	
	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		_01_CanotStopThread t = new _01_CanotStopThread();
		t.start();
		Thread.sleep(2000);
		t.interrupt();//��������ʹ�߳�ֹͣ
	}
}
