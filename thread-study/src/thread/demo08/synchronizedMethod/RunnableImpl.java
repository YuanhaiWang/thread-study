package thread.demo08.synchronizedMethod;

/**
 * 解决线程安全问题的第一个方案： 使用同步方法
 * 		使用方法：
 * 			1.把访问了共享数据的代码抽取出来，放到一个方法中
 * 			2.在方法上添加一个synchronized修饰符
 * 		格式
 * 		修饰符 synchronized 返回值类型 方法名(){
 * 				可能会出现线程安全问题的代码（访问了共享数据的代码）
 * 			}
 * @author yuanhai
 *
 */
public class RunnableImpl implements Runnable{
	
	// 定义一个多个线程共享的票源
	private static int ticket = 100;

	@Override
	public void run() {
		System.out.println("this:"+this);
		// 使用死循环，让卖票操作重复执行
		while(true) {
//			payTicket();
			payTicketStatic();
		}
	}

	/*
	 * 	定义一个同步方法
	 * 	同步方法也会把方法内部的代码锁住，只让一个线程执行
	 * 	同步方法的锁对象是谁？
	 * 	就是实现类对象 new RunnableImpl(),即this
	 */
	public synchronized void payTicket() {
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

	/*
	 * 静态同步方法
	 * 静态同步方法的锁对象是什么？
	 * 不能是this，this是创建对象之后产生的，而静态方法优先于对象
	 * 静态方法的锁对象是本类的class属性,即class文件对象（反射）
	 */
	public static synchronized void payTicketStatic() {
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
