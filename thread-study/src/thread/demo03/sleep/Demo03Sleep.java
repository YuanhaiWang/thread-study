package thread.demo03.sleep;

/**
 * public static sleep(long mills);  ʹ��ǰִ�е��߳��Ժ�������ͣ����ʱִֹͣ�У�
 * ����������֮�󣬼���ִ��
 * @author yuanhai
 *
 */
public class Demo03Sleep {

	public static void main(String[] args) {
		// ģ�����
		for(int i=1;i<=60;i++) {
			System.out.println(i);
			// ����Thread���sleep�������ó���˯��һ����
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
