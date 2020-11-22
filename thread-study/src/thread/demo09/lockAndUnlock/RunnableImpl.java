package thread.demo09.lockAndUnlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 解决线程安全问题的第三种方案： 使用Lock锁
 * java.util.concurrent.locks.Lock接口
 * 它比synchronized要先进好用
 * Lock接口中的的方法：
 * 		void lock() 获取锁
 * 		void unlock() 释放锁
 * 	java.util.concurrent.locks.ReentrantLock实现了Lock接口
 * 使用步骤：
 * 		1.在成员位置创建一个ReentrantLock对象
 * 		2.在可能会出现线程安全问题的代码前，调用Lock接口中的lock()方法，去获取锁
 * 		3.在可能会出现线程安全问题的代码后，调用Lock接口中的unlock()方法，去释放锁
 * 
 * @author yuanhai
 *
 */
public class RunnableImpl implements Runnable{
	
	// 定义一个多个线程共享的票源
	private int ticket = 100;
	
	// 1.在成员位置创建一个ReentrantLock对象
	Lock lock = new ReentrantLock();

//	@Override
//	public void run() {
//		// 使用死循环，让卖票操作重复执行
//		while(true) {
//			
//			// 2.在可能会出现线程安全问题的代码前，调用Lock接口中的lock()方法，去获取锁
//			lock.lock();
//			
//			// 先判断票是否存在
//			if(ticket > 0) {
//				// 提高线程安全问题出现的概率，让程序睡眠一下
//				try {
//					Thread.sleep(10);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				
//				System.out.println(Thread.currentThread().getName()+"--正在出售第"+ticket+"张票");
//				ticket--;
//			}
//			// 3.在可能会出现线程安全问题的代码后，调用Lock接口中的unlock()方法，去释放锁
//			lock.unlock();
//		}
//	}
	
	@Override
	public void run() {
		// 使用死循环，让卖票操作重复执行
		while(true) {
			
			// 2.在可能会出现线程安全问题的代码前，调用Lock接口中的lock()方法，去获取锁
			lock.lock();
			
			// 先判断票是否存在
			if(ticket > 0) {
				// 提高线程安全问题出现的概率，让程序睡眠一下
				try {
					Thread.sleep(10);
					System.out.println(Thread.currentThread().getName()+"--正在出售第"+ticket+"张票");
					ticket--;
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
					// 3.在可能会出现线程安全问题的代码后，调用Lock接口中的unlock()方法，去释放锁
					lock.unlock(); // 无论程序是否出现异常，都会把锁释放掉
				}
			}
			
		}
	}

}
