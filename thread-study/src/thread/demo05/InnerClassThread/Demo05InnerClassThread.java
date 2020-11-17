package thread.demo05.InnerClassThread;

/**
 * �����ڲ���ķ�ʽʵ�ֶ��߳�
 * 
 * ������û������
 * �ڲ��ࣺд���������ڲ�����
 * 
 * �����ڲ������ã��򻯴���
 * 		������̳и��࣬��д���෽���������������ϳ�һ����ɡ�
 * 		��ʵ����ʵ�ֽӿڣ���д�ӿڷ���������ʵ�������ϳ�һ����ɡ�
 * -> �����ڲ�������ղ������/ʵ������󣬶������û������
 * 
 * 
 * ��ʽ��
 * 		new ����/�ӿ�(){
 * 			��д����/�ӿ��еķ���	
 * 		}
 * 
 * @author yuanhai
 *
 */
public class Demo05InnerClassThread {
	
	public static void main(String[] args) {
		//  �̵߳ĸ�����Thread
		new Thread() {
			// ��дrun()�����������߳�����
			@Override
			public void run() {
				for(int i=0;i<20;i++) {
					System.out.println(Thread.currentThread().getName()+"--->"+"Ԩ��");
				}
			}
		}.start();;
		
		//	�߳�ʵ��Runnable�ӿڵķ�ʽ
		// Runnable r = new RunnableImpl();       // ��̬
		Runnable r = new Runnable() {
			// ��дrun()�����������߳�����
			public void run() {
				for(int i=0;i<20;i++) {
					System.out.println(Thread.currentThread().getName()+"--->"+"��");
				}
			}
		};
		new Thread(r).start();
		
		// �򻯽ӿڵķ�ʽ��
		new Thread(new Runnable() {
			// ��дrun()�����������߳�����
			public void run() {
				for(int i=0;i<20;i++) {
					System.out.println(Thread.currentThread().getName()+"--->"+"����");
				}
			}
		}).start();
		
	}
	
		
		

}
