package thread.demo01.getName;

/*
 * 线程的名称：
 * 	主线程：main
 * 	其他线程：Thread-0，Thread-1，Thread-2...
 */
public class Demo01GetThreadName {
	
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.start();
		
		MyThread mt2 = new MyThread();
		mt2.start();
		
		System.out.println(Thread.currentThread().getName());
	}

}
