package thread.demo10.waitAndNotify;

/**
 * �̵߳ĵȴ����Ѱ���
 * 		����һ���˿ͣ������ߣ��̣߳���֪�ϰ壨�����ߣ�Ҫ�Ĳ�Ʒ�������������Ȼ�����wait()����������cpu��ִ�У����뵽waiting״̬�����޵ȴ�״̬��
 * 		����һ���ϰ壨�����ߣ��̣߳�����5������Ʒ������֮�󣬵���notify()���������ѹ˿��߳�
 * 
 * 	ע�⣺
 * 		1.�˿ͺ��ϰ��̱߳����ʹ��ͬ������������������֤�ȴ��ͻ���ֻ����һ����ִ�� 
 * 		2.ͬ��ʹ�õ���������뱣֤Ψһ
 * 		3.ֻ����������ܵ���wait()��notify()����
 * 
 * 	Object���еķ�����
 * 		void wait()
 * 			�������̵߳��ô˶����notify()��notifyAll()����ǰ�����µ�ǰ�̵߳ȴ�
 * 		void notify()
 * 			�����ڴ˶���������ϵȴ��ĵ����߳�
 * 			�����ִ��wait()֮��Ĵ���
 * 		
 * @author yuanhai
 *
 */
public class Demo10WaitAndNotify {
	
	public static void main(String[] args) {
		// ���������󣬱�֤Ψһ
		Object obj = new Object();
		
		// ����һ���˿��̣߳������ߣ�
		new Thread() {
			@Override
			public void run() {
				// ʹ����ѭ����һֱ�������Ʒ
				while(true) {
					// ��֤�ȴ��ͻ���ֻ����һ����ִ��,��Ҫʹ��ͬ������
					synchronized(obj) {
						System.out.println("��֪�ϰ壨�����ߣ�Ҫ�Ĳ�Ʒ�����������");
						// Ȼ�����wait()����������cpu��ִ�У����뵽waiting״̬�����޵ȴ�״̬��
						try {
							obj.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						// �������̱߳�����֮��ִ�еĴ���
						System.out.println("��Ʒ�����ˣ�������ȡ�ò�Ʒ");
						System.out.println("*_*_*_*_*_*_*_*__*_*_*_*_*_*_*_*");
					}
				}
			}
		}.start();
		
		// ����һ���ϰ壨�����ߣ��߳�
		new Thread() {
			@Override
			public void run() {
				// ʹ����ѭ����һֱ����Ʒ
				while(true) {
					// ����5������Ʒ
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}				
					// ��֤�ȴ��ͻ���ֻ����һ����ִ��,��Ҫʹ��ͬ������
					synchronized(obj) {
						System.out.println("������������֮�������˲�Ʒ����֪�����߿���ʹ�ò�Ʒ");
						// ����֮�󣬵���notify()���������ѹ˿��߳�
						obj.notify();
					}
				}
				
			}
		}.start();
		
		
	}
	
	
	 
	
	
	
	
	
	
	

}
