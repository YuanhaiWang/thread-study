package thread.demo04.runnable;

/**
 * �������̳߳���ĵڶ��ַ�ʽ��ʵ��Runnable�ӿ�
 * 
 * ʵ�ֲ��裺
 * 	1.����һ��runable�ӿڵ�ʵ����
 * 	2.��ʵ��������дrunable�ӿڵ�run()���������������߳�����
 * 	3.����һ��runnable�ӿڵ�ʵ�������
 * 	4.����Thread��������乹�췽���д���runable�ӿڵ�ʵ�������
 * 	5.����Thread���е�start(),�����µ��߳�ִ��run(����
 * 
 * �̳�Thread��ʵ�ֶ��̺߳�ʵ��Runnable�ӿ�ʵ�ֶ��̵߳�����ʵ��Runnable�ӿ�ʵ�ֶ��̵߳ĺô��� ����
 * 1.ʵ��Runnable�ӿ�ʵ�ֶ��̵߳ķ�ʽ�������˵��̳еľ�����
 * 		һ����ֻ�ܼ̳�һ���࣬�����̳���Thread�࣬�Ͳ��ܼ̳��������࣬����ʹ��ʵ��Runnable�ӿڵķ�ʽ�������Լ̳������࣬ʵ�������ӿ�
 * 2.ʵ��Runnable�ӿ�ʵ�ֶ��̵߳ķ�ʽ����ǿ�˳������չ�ԣ����ͳ��������ԣ����
 * 		ʵ��Runnable�ӿ�ʵ�ֶ��̣߳��������߳�����Ϳ������߳̽����˷��루���
 * 		��ʵ��������дrun()�����������߳�����
 * 		��ʹ�õĵط�����Thread����󣬵���start()���������������µ��߳�
 * 3.ʵ��Runnable�ӿ�ʵ�ֶ��̵߳ķ�ʽ���ʺ϶����ͬ�ĳ��������߳�ȥ����ͬһ����Դ�� ������
 * 4.ʵ��Runnable�ӿ�ʵ�ֶ��̵߳ķ�ʽ���̳߳�ֻ�ܷ���ʵ��Runable��Callable���̣߳�����ֱ�ӷ���̳�Thread���ࡣ
 * 
 * @author yuanhai
 *
 */
public class Demo04Runnable {

	public static void main(String[] args) {
		
		// 3.����һ��runnable�ӿڵ�ʵ�������
		RunnableImpl runImpl = new RunnableImpl();
		// 4.����Thread��������乹�췽���д���runable�ӿڵ�ʵ�������
		Thread t = new Thread(runImpl);
		t.start();
		
		for(int i=0;i<20;i++) {
			System.out.println(Thread.currentThread().getName()+"--->"+i);
		}
	}
}
