package thread.demo07.useSynchronized;

/**
 * 解决线程安全问题的第一个方案： 使用同步代码块
 * 		格式：
 * 			synchronized(锁对象){
 * 				可能会出现线程安全问题的代码（访问了共享数据的代码）
 * 			}
 * 		注意：
 * 			1.同步代码块中的对象可以是任意的对象
 * 			2.必须保证多个线程试用的锁对象是同一个
 * 			3.锁对象作用：
 * 				可以把同步代码块锁住，只让一个线程在同步代码块中执行
 * 		
 * @author yuanhai
 *
 */
public class RunnableImpl implements Runnable{
	
	// 定义一个多个线程共享的票源
	private int ticket = 100;
	
	// 创建一个锁对象,要创建在run()方法之外
	Object obj = new Object();

	@Override
	public void run() {
		// 使用死循环，让卖票操作重复执行
		while(true) {
			// 同步代码块
			synchronized (obj) {
				// 先判断票是否存在
				if(ticket > 0) {
					// 提高线程安全问题出现的概率，让程序睡眠一下
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+"--正在出售第"+ticket+"张票");
					ticket--;
				}
			}
		}
		
		
	}

}
