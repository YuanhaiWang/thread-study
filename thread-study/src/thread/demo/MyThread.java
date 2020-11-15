package thread.demo;
/*
 * 1，创建一个Thread类的子类
 */
public class MyThread extends Thread {
	// 2,在Thread类的子类中，重写thread类的run()方法，设置线程任务（即开启线程要做什么）
	@Override
	public void run() {
		for(int i = 1;i<21;i++) {
			System.out.println("myThread"+"------->"+i);
		}
	}

}
