package _04_�������.�߳�_����._03_�߳�˯��;

public class ThreadSleep {
	public static void main(String[] args) {
		new Thread(){
			public void run() {
				for (int i = 0; i < 5; i++) {
					if(Thread.currentThread().isInterrupted()){
						System.out.println("�ж��ˡ�����");
					}
					
					try {
						Thread.currentThread().sleep(2000);
						System.out.println("a");
						throw new InterruptedException("error");
					} catch (InterruptedException e) {
						e.printStackTrace();
						Thread.currentThread().interrupt();//�����ж��쳣�������catch�в������ж�λ�Ļ����߳̽���ⲻ���ж���Ϣ
					}
				}
			};
		}.start();
	}
}
