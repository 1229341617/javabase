package _07_java多线程编程核心技术._01_java多线程技能._02_currentthread;

public class _02_CurrentThread_dic extends Thread{
	
	public _02_CurrentThread_dic(String name){
		this.setName(name);
		System.out.println("构造方法打印-CurrentThread.getName()：" + Thread.currentThread().getName());
		System.out.println("构造方法打印-this.getName()：" + this.getName());
	}

	@Override
	public void run() {
		System.out.println("run方法打印-CurrentThread.getName()：" + Thread.currentThread().getName());
		System.out.println("run方法打印-this.getName()：" + this.getName());//t对象调用run方法，当然是t的名称是A
	}
	
	public static void main(String[] args) {
		_02_CurrentThread_dic t = new _02_CurrentThread_dic("A");
		Thread tt = new Thread(t, "B");
		tt.start();
	}

}
