package thread.demo;

/**
 * ���̣߳�ִ������������main���������߳�
 * ���̳߳���java������ֻ��һ���߳�
 * 			 ִ��ʱ��main������ʼ����������ִ��
 * @author yuanhai
 *
 */
public class Demo01MainThread {
	
	public static void main(String[] args) {
		Person p1 = new Person("Сǿ");
		p1.run();
		System.out.println(0/0);
		Person p2 = new Person("����");
		p2.run();
	}

}
