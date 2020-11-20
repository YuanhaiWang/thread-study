package thread.demo08.synchronizedMethod;

/**
 * 模拟出售电影票案例
 * 创建3个线程，同时开启，模拟对共享的票进行出售
 * @author yuanhai
 *
 */
public class Demo08Ticket {

	public static void main(String[] args) {
		RunnableImpl run = new RunnableImpl();
		System.out.println("run:"+run);
		// 创建Thread类对象，构造方法中传递runnable接口的实现类对象
		Thread t0 = new Thread(run);
		Thread t1 = new Thread(run);
		Thread t2 = new Thread(run);
		// 调用start方法，开启多线程
		t0.start();
		t1.start();
		t2.start();
		
		// 
	}
}
