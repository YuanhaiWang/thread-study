package thread.demo04.runnable;

/**
 * 创建多线程程序的第二种方式：实现Runnable接口
 * 
 * 实现步骤：
 * 	1.创建一个runable接口的实现类
 * 	2.在实现类中重写runable接口的run()方法，用来设置线程任务
 * 	3.创建一个runnable接口的实现类对象
 * 	4.创建Thread类对象，在其构造方法中传递runable接口的实现类对象
 * 	5.调用Thread类中的start(),开启新的线程执行run(方法
 * 
 * 继承Thread类实现多线程和实现Runnable接口实现多线程的区别（实现Runnable接口实现多线程的好处？ ）：
 * 1.实现Runnable接口实现多线程的方式，避免了单继承的局限性
 * 		一个类只能继承一个类，如果类继承了Thread类，就不能继承其他的类，但是使用实现Runnable接口的方式，还可以继承其他类，实现其他接口
 * 2.实现Runnable接口实现多线程的方式，增强了程序的扩展性，降低程序的耦合性（解耦）
 * 		实现Runnable接口实现多线程，把设置线程任务和开启新线程进行了分离（解耦）
 * 		在实现类中重写run()方法：设置线程任务
 * 		在使用的地方创建Thread类对象，调用start()方法：用来开启新的线程
 * 3.实现Runnable接口实现多线程的方式，适合多个相同的程序代码的线程去共享同一个资源。 （？）
 * 4.实现Runnable接口实现多线程的方式，线程池只能放入实现Runable或Callable类线程，不能直接放入继承Thread的类。
 * 
 * @author yuanhai
 *
 */
public class Demo04Runnable {

	public static void main(String[] args) {
		
		// 3.创建一个runnable接口的实现类对象
		RunnableImpl runImpl = new RunnableImpl();
		// 4.创建Thread类对象，在其构造方法中传递runable接口的实现类对象
		Thread t = new Thread(runImpl);
		t.start();
		
		for(int i=0;i<20;i++) {
			System.out.println(Thread.currentThread().getName()+"--->"+i);
		}
	}
}
