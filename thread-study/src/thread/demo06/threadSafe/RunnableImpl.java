package thread.demo06.threadSafe;

/**
 * ʵ��һ�����۵�ӰƱ���̰߳�ȫ����
 * @author yuanhai
 *
 */
public class RunnableImpl implements Runnable{
	
	// ����һ������̹߳����ƱԴ
	private int ticket = 100;

	@Override
	public void run() {
		// ʹ����ѭ��������Ʊ�����ظ�ִ��
		while(true) {
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
