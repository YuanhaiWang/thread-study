package thread.demo06.threadSafe;

/**
 * 实现一个出售电影票的线程安全问题
 * @author yuanhai
 *
 */
public class RunnableImpl implements Runnable{
	
	// 定义一个多个线程共享的票源
	private int ticket = 100;

	@Override
	public void run() {
		// 使用死循环，让卖票操作重复执行
		while(true) {
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
