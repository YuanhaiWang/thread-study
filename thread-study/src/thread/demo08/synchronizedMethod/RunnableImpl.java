package thread.demo08.synchronizedMethod;

/**
 * ����̰߳�ȫ����ĵ�һ�������� ʹ��ͬ������
 * 		ʹ�÷�����
 * 			1.�ѷ����˹������ݵĴ����ȡ�������ŵ�һ��������
 * 			2.�ڷ��������һ��synchronized���η�
 * 		��ʽ
 * 		���η� synchronized ����ֵ���� ������(){
 * 				���ܻ�����̰߳�ȫ����Ĵ��루�����˹������ݵĴ��룩
 * 			}
 * @author yuanhai
 *
 */
public class RunnableImpl implements Runnable{
	
	// ����һ������̹߳����ƱԴ
	private static int ticket = 100;

	@Override
	public void run() {
		System.out.println("this:"+this);
		// ʹ����ѭ��������Ʊ�����ظ�ִ��
		while(true) {
//			payTicket();
			payTicketStatic();
		}
	}

	/*
	 * 	����һ��ͬ������
	 * 	ͬ������Ҳ��ѷ����ڲ��Ĵ�����ס��ֻ��һ���߳�ִ��
	 * 	ͬ����������������˭��
	 * 	����ʵ������� new RunnableImpl(),��this
	 */
	public synchronized void payTicket() {
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

	/*
	 * ��̬ͬ������
	 * ��̬ͬ����������������ʲô��
	 * ������this��this�Ǵ�������֮������ģ�����̬���������ڶ���
	 * ��̬�������������Ǳ����class����,��class�ļ����󣨷��䣩
	 */
	public static synchronized void payTicketStatic() {
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
