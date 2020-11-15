package thread.demo;

/**
 * 创建多线程程序的第一种方式： 创建Thread类的子类
 * java.lang.Thread类是描述线程的类，我们要实现多线程程序，可以继承该类
 * 
 * 实现步骤：
 * 		1，创建一个Thread类的子类
 * 		2,在Thread类的子类中，重写thread类的run()方法，设置线程任务（即开启线程要做什么）
 * 		3，创建Thread类的子类对象
 * 		4，调用Thread类中的start()方法，开启新的线程，执行run()方法
 * 			void start(); 使该线程开始执行；jvm会调用该线程的run()方法；
 * java程序属于抢占式调度，哪个线程优先级高，则优先执行；同一个优先级，则随机选择执行
 * 
 * @author yuanhai
 *
 */
public class Demo01Thread {
	public static void main(String[] args) {
		// 3，创建Thread类的子类对象
		MyThread mt = new MyThread();
		// 4，调用Thread类中的start()方法，开启新的线程，执行run()方法
		//　实用用start()方法去执行run()方法，和直接调用run()方法是有区别的
		// 	- run()，实质上是方法，作用是运行线程，无法开启新的线程
		// 	- start()，创建启动新的线程，可以实现多线程工作。
		//  - 通过start()使得线程处于就绪状态，在获得CPU时间片后通过run()开始运行
		mt.start();
		
		for(int i = 1;i<21;i++) {
			System.out.println("main"+"------->"+i);
		}
	}

}
