package _07_java���̱߳�̺��ļ���._01_java���̼߳���._01_usemultithread;

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
