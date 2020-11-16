package thread.demo01.getName;

/**
 * 获取线程的名称
 * 	1.试用Thread类中的方法getName();
 * 		String getName()	返回该线程的名称
 *  2.先获取到当前当前正在执行中的线程，再使用线程中的getName()获取线程的名称
 *  	static Thread currentThread()
 * @author yuanhai
 *
 */
public class MyThread extends Thread{

	@Override
	public void run() {
		// 获取线程名称
//		String threadName = getName();
//		System.out.println(threadName);
		
//		Thread t = Thread.currentThread();
//		System.out.println(t);   // Thread[Thread-0,5,main]
//		System.out.println(t.getName());
		
		System.out.println(currentThread().getName());
	}
	
	

}
