package thread.demo02.setName;

/**
 * 设置线程的名称：
 * 	1.使用Thread类中的setName()方法
 * 		void setName(String name)     
 * 	2.创建一个带参数的构造方法，参数传递线程的名称；调用父类的带参构造方法，把线程名称传递给父类，
 * 	让父类(Thread)给子线程起名称
 * 		Thread(String name)  分配新的thread对象
 * @author yuanhai
 *
 */
public class MyThread extends Thread{
	
	

	public MyThread() {	
	}

	public MyThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		// 获取线程的名称
		System.out.println(getName());
	}

	
	
}
