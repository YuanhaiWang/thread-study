package thread.demo02.setName;

/**
 * �����̵߳����ƣ�
 * 	1.ʹ��Thread���е�setName()����
 * 		void setName(String name)     
 * 	2.����һ���������Ĺ��췽�������������̵߳����ƣ����ø���Ĵ��ι��췽�������߳����ƴ��ݸ����࣬
 * 	�ø���(Thread)�����߳�������
 * 		Thread(String name)  �����µ�thread����
 * @author yuanhai
 *
 */
public class MyThread extends Thread{
	
	

	public MyThread() {	
	}

	public MyThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		// ��ȡ�̵߳�����
		System.out.println(getName());
	}

	
	
}
