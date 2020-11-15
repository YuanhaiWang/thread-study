package thread.demo;

/**
 * 主线程：执行主方法（即main方法）的线程
 * 单线程程序：java程序中只有一个线程
 * 			 执行时从main方法开始，从上往下执行
 * @author yuanhai
 *
 */
public class Demo01MainThread {
	
	public static void main(String[] args) {
		Person p1 = new Person("小强");
		p1.run();
		System.out.println(0/0);
		Person p2 = new Person("旺财");
		p2.run();
	}

}
