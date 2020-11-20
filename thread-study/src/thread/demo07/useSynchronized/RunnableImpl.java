package thread.demo07.useSynchronized;

/**
 * ����̰߳�ȫ����ĵ�һ�������� ʹ��ͬ�������
 * 		��ʽ��
 * 			synchronized(������){
 * 				���ܻ�����̰߳�ȫ����Ĵ��루�����˹������ݵĴ��룩
 * 			}
 * 		ע�⣺
 * 			1.ͬ��������еĶ������������Ķ���
 * 			2.���뱣֤����߳����õ���������ͬһ��
 * 			3.���������ã�
 * 				���԰�ͬ���������ס��ֻ��һ���߳���ͬ���������ִ��
 * 		
 * @author yuanhai
 *
 */
public class RunnableImpl implements Runnable{
	
	// ����һ������̹߳����ƱԴ
	private int ticket = 100;
	
	// ����һ��������,Ҫ������run()����֮��
	Object obj = new Object();

	@Override
	public void run() {
		// ʹ����ѭ��������Ʊ�����ظ�ִ��
		while(true) {
			// ͬ�������
			synchronized (obj) {
				// ���ж�Ʊ�Ƿ����
				if(ticket > 0) {
					// ����̰߳�ȫ������ֵĸ��ʣ��ó���˯��һ��
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+"--���ڳ��۵�"+ticket+"��Ʊ");
					ticket--;
				}
			}
		}
		
		
	}

}
