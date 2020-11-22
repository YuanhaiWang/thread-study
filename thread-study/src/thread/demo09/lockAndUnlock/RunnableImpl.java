package thread.demo09.lockAndUnlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ����̰߳�ȫ����ĵ����ַ����� ʹ��Lock��
 * java.util.concurrent.locks.Lock�ӿ�
 * ����synchronizedҪ�Ƚ�����
 * Lock�ӿ��еĵķ�����
 * 		void lock() ��ȡ��
 * 		void unlock() �ͷ���
 * 	java.util.concurrent.locks.ReentrantLockʵ����Lock�ӿ�
 * ʹ�ò��裺
 * 		1.�ڳ�Աλ�ô���һ��ReentrantLock����
 * 		2.�ڿ��ܻ�����̰߳�ȫ����Ĵ���ǰ������Lock�ӿ��е�lock()������ȥ��ȡ��
 * 		3.�ڿ��ܻ�����̰߳�ȫ����Ĵ���󣬵���Lock�ӿ��е�unlock()������ȥ�ͷ���
 * 
 * @author yuanhai
 *
 */
public class RunnableImpl implements Runnable{
	
	// ����һ������̹߳����ƱԴ
	private int ticket = 100;
	
	// 1.�ڳ�Աλ�ô���һ��ReentrantLock����
	Lock lock = new ReentrantLock();

//	@Override
//	public void run() {
//		// ʹ����ѭ��������Ʊ�����ظ�ִ��
//		while(true) {
//			
//			// 2.�ڿ��ܻ�����̰߳�ȫ����Ĵ���ǰ������Lock�ӿ��е�lock()������ȥ��ȡ��
//			lock.lock();
//			
//			// ���ж�Ʊ�Ƿ����
//			if(ticket > 0) {
//				// ����̰߳�ȫ������ֵĸ��ʣ��ó���˯��һ��
//				try {
//					Thread.sleep(10);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				
//				System.out.println(Thread.currentThread().getName()+"--���ڳ��۵�"+ticket+"��Ʊ");
//				ticket--;
//			}
//			// 3.�ڿ��ܻ�����̰߳�ȫ����Ĵ���󣬵���Lock�ӿ��е�unlock()������ȥ�ͷ���
//			lock.unlock();
//		}
//	}
	
	@Override
	public void run() {
		// ʹ����ѭ��������Ʊ�����ظ�ִ��
		while(true) {
			
			// 2.�ڿ��ܻ�����̰߳�ȫ����Ĵ���ǰ������Lock�ӿ��е�lock()������ȥ��ȡ��
			lock.lock();
			
			// ���ж�Ʊ�Ƿ����
			if(ticket > 0) {
				// ����̰߳�ȫ������ֵĸ��ʣ��ó���˯��һ��
				try {
					Thread.sleep(10);
					System.out.println(Thread.currentThread().getName()+"--���ڳ��۵�"+ticket+"��Ʊ");
					ticket--;
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
					// 3.�ڿ��ܻ�����̰߳�ȫ����Ĵ���󣬵���Lock�ӿ��е�unlock()������ȥ�ͷ���
					lock.unlock(); // ���۳����Ƿ�����쳣����������ͷŵ�
				}
			}
			
		}
	}

}
