package thread.demo01.getName;

/**
 * ��ȡ�̵߳�����
 * 	1.����Thread���еķ���getName();
 * 		String getName()	���ظ��̵߳�����
 *  2.�Ȼ�ȡ����ǰ��ǰ����ִ���е��̣߳���ʹ���߳��е�getName()��ȡ�̵߳�����
 *  	static Thread currentThread()
 * @author yuanhai
 *
 */
public class MyThread extends Thread{

	@Override
	public void run() {
		// ��ȡ�߳�����
//		String threadName = getName();
//		System.out.println(threadName);
		
//		Thread t = Thread.currentThread();
//		System.out.println(t);   // Thread[Thread-0,5,main]
//		System.out.println(t.getName());
		
		System.out.println(currentThread().getName());
	}
	
	

}
