package _07_java���̱߳�̺��ļ���._01_java���̼߳���._02_currentthread;

public class _02_CurrentThread_dic extends Thread{
	
	public _02_CurrentThread_dic(String name){
		this.setName(name);
		System.out.println("���췽����ӡ-CurrentThread.getName()��" + Thread.currentThread().getName());
		System.out.println("���췽����ӡ-this.getName()��" + this.getName());
	}

	@Override
	public void run() {
		System.out.println("run������ӡ-CurrentThread.getName()��" + Thread.currentThread().getName());
		System.out.println("run������ӡ-this.getName()��" + this.getName());//t�������run��������Ȼ��t��������A
	}
	
	public static void main(String[] args) {
		_02_CurrentThread_dic t = new _02_CurrentThread_dic("A");
		Thread tt = new Thread(t, "B");
		tt.start();
	}

}
