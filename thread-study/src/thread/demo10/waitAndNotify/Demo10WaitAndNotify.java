package thread.demo10.waitAndNotify;

/**
 * 线程的等待唤醒案例
 * 		创建一个顾客（消费者）线程：告知老板（生产者）要的产品的种类和数量，然后调用wait()方法，放弃cpu的执行，进入到waiting状态（无限等待状态）
 * 		创建一个老板（生产者）线程：花了5秒做产品，做好之后，调用notify()方法，唤醒顾客线程
 * 
 * 	注意：
 * 		1.顾客和老板线程必须得使用同步代码块包裹起来，保证等待和唤醒只能有一个在执行 
 * 		2.同步使用的锁对象必须保证唯一
 * 		3.只有锁对象才能调用wait()和notify()方法
 * 
 * 	Object类中的方法：
 * 		void wait()
 * 			在其他线程调用此对象的notify()或notifyAll()方法前，导致当前线程等待
 * 		void notify()
 * 			唤醒在此对象监视器上等待的单个线程
 * 			会继续执行wait()之后的代码
 * 		
 * @author yuanhai
 *
 */
public class Demo10WaitAndNotify {
	
	public static void main(String[] args) {
		// 创建锁对象，保证唯一
		Object obj = new Object();
		
		// 创建一个顾客线程（消费者）
		new Thread() {
			@Override
			public void run() {
				// 使用死循环，一直等着买产品
				while(true) {
					// 保证等待和唤醒只能有一个在执行,需要使用同步技术
					synchronized(obj) {
						System.out.println("告知老板（生产者）要的产品的种类和数量");
						// 然后调用wait()方法，放弃cpu的执行，进入到waiting状态（无限等待状态）
						try {
							obj.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						// 消费者线程被唤醒之后，执行的代码
						System.out.println("产品做好了，消费者取得产品");
						System.out.println("*_*_*_*_*_*_*_*__*_*_*_*_*_*_*_*");
					}
				}
			}
		}.start();
		
		// 创建一个老板（生产者）线程
		new Thread() {
			@Override
			public void run() {
				// 使用死循环，一直做产品
				while(true) {
					// 花了5秒做产品
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}				
					// 保证等待和唤醒只能有一个在执行,需要使用同步技术
					synchronized(obj) {
						System.out.println("生产者五秒钟之后做好了产品，告知消费者可以使用产品");
						// 做好之后，调用notify()方法，唤醒顾客线程
						obj.notify();
					}
				}
				
			}
		}.start();
		
		
	}
	
	
	 
	
	
	
	
	
	
	

}
