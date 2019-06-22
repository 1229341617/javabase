package _07_java多线程编程核心技术._01_java多线程技能._01_usemultithread;

public class _03_UnShareVariable extends Thread{
	
	private int count = 3;
	
	
	
	public _03_UnShareVariable(String name) {
		this.setName(name);
	}

	@Override
	public void run() {
		while(count > 0){
			count--;
			System.out.println(Thread.currentThread().getName() + " = " + count);
		}
	}
	
	public static void main(String[] args) {
		_03_UnShareVariable t1 = new _03_UnShareVariable("A");
		_03_UnShareVariable t2 = new _03_UnShareVariable("B");
		_03_UnShareVariable t3 = new _03_UnShareVariable("C");
		t1.start();
		t2.start();
		t3.start();
	}
	
}
