package _07_java���̱߳�̺��ļ���._01_java���̼߳���._01_usemultithread;

public class _05_LoginServlet{
	private static String usernameRef;
	private static String passwordRef;
	
	
	public static void doPost(String username, String password) throws InterruptedException {
		usernameRef = username;
		if("a".equals(username)){
			Thread.sleep(5000);
		}
		passwordRef = password;
		System.out.println("username=" + usernameRef + ",password=" + passwordRef);
	}
	
	
	public static void main(String[] args) {
		_05_ALogin aLogin = new _05_ALogin();
		_05_BLogin bLogin = new _05_BLogin();
		aLogin.start();
		bLogin.start();
	}
}
