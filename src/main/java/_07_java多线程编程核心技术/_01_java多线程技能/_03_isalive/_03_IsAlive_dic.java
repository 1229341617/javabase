package _07_java多线程编程核心技术._01_java多线程技能._03_isalive;

public class _03_IsAlive_dic extends Thread{
	
    public _03_IsAlive_dic() {
    	System.out.println("cons-start...");
    	System.out.println("current.getName():" + Thread.currentThread().getName());
    	System.out.println("current.isAlive():" + Thread.currentThread().isAlive());
    	System.out.println("this.getName():" + this.getName());
    	System.out.println("this.isAlive():" + this.isAlive());
    	System.out.println("cons-end...");
    	System.out.println();
	}
	
	@Override
	public void run() {
		System.out.println();
		System.out.println("run-start...");
		System.out.println("run.getName():" + Thread.currentThread().getName());
		System.out.println("run.isAlive():" + Thread.currentThread().isAlive());
		System.out.println("this.getName():" + this.getName());
		System.out.println("this.isAlive():" + this.isAlive());
		System.out.println("run-end...");
		System.out.println();
	}
	
	/**
	 * 
	 * 
	 * --start
	 * main
	 * true
	 * Thread-0
	 * false
	 * --end
	 * 
	 * main:false
	 * main:true
	 * 
	 * --start
	 * A
	 * true
	 * Thread-0
	 * false
	 * --start
	 * 
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		_03_IsAlive_dic t = new _03_IsAlive_dic();
		Thread tt = new Thread(t);
		System.out.println("main-start:" + tt.isAlive());
		tt.setName("A");
		tt.start();
		System.out.println("main-end:" + tt.isAlive());
	}
}
