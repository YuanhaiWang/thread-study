package thread.demo03.sleep;

/**
 * public static sleep(long mills);  使当前执行的线程以毫秒数暂停（暂时停止执行）
 * 毫秒数结束之后，继续执行
 * @author yuanhai
 *
 */
public class Demo03Sleep {

	public static void main(String[] args) {
		// 模拟秒表
		for(int i=1;i<=60;i++) {
			System.out.println(i);
			// 试用Thread类的sleep方法，让程序睡眠一秒钟
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
