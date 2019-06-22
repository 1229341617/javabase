package _07_java多线程编程核心技术._01_java多线程技能._01_usemultithread;

public class _01_ExtendThread extends Thread{
	@Override
	public void run() {
		System.out.println("ExtendThread");
	}
	
	public static void main(String[] args) {
		_01_ExtendThread et = new _01_ExtendThread();
		et.start();
		System.out.println("main");
	}
}
