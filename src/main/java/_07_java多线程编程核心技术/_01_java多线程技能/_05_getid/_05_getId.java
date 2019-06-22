package _07_java多线程编程核心技术._01_java多线程技能._05_getid;

public class _05_getId extends Thread{
	
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println(t.getName() + " " + t.getId());
		_05_getId tt = new _05_getId();
		System.out.println(tt.getName() + " " + tt.getId());
	}
}
