package thread.demo07.useSynchronized;

/**
 * ģ����۵�ӰƱ����
 * ����3���̣߳�ͬʱ������ģ��Թ����Ʊ���г���
 * @author yuanhai
 *
 */
public class Demo07Ticket {

	public static void main(String[] args) {
		RunnableImpl run = new RunnableImpl();
		 // ����Thread����󣬹��췽���д���runnable�ӿڵ�ʵ�������
		Thread t0 = new Thread(run);
		Thread t1 = new Thread(run);
		Thread t2 = new Thread(run);
		//  ����start�������������߳�
		t0.start();
		t1.start();
		t2.start();
		
		// 
	}
}
