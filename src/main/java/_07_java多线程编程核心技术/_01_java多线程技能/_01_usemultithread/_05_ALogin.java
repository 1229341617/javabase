package _07_java���̱߳�̺��ļ���._01_java���̼߳���._01_usemultithread;

public class _05_ALogin extends Thread{
	
	@Override
	public void run() {
		try {
			_05_LoginServlet.doPost("a", "aa");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
