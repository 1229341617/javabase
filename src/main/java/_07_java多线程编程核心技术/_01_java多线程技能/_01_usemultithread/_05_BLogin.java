package _07_java多线程编程核心技术._01_java多线程技能._01_usemultithread;

public class _05_BLogin extends Thread{
	
	@Override
	public void run() {
		try {
			_05_LoginServlet.doPost("b", "bb");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
