package thread.demo;

/**
 * �������̳߳���ĵ�һ�ַ�ʽ�� ����Thread�������
 * java.lang.Thread���������̵߳��࣬����Ҫʵ�ֶ��̳߳��򣬿��Լ̳и���
 * 
 * ʵ�ֲ��裺
 * 		1������һ��Thread�������
 * 		2,��Thread��������У���дthread���run()�����������߳����񣨼������߳�Ҫ��ʲô��
 * 		3������Thread����������
 * 		4������Thread���е�start()�����������µ��̣߳�ִ��run()����
 * 			void start(); ʹ���߳̿�ʼִ�У�jvm����ø��̵߳�run()������
 * java����������ռʽ���ȣ��ĸ��߳����ȼ��ߣ�������ִ�У�ͬһ�����ȼ��������ѡ��ִ��
 * 
 * @author yuanhai
 *
 */
public class Demo01Thread {
	public static void main(String[] args) {
		// 3������Thread����������
		MyThread mt = new MyThread();
		// 4������Thread���е�start()�����������µ��̣߳�ִ��run()����
		//��ʵ����start()����ȥִ��run()��������ֱ�ӵ���run()�������������
		// 	- run()��ʵ�����Ƿ����������������̣߳��޷������µ��߳�
		// 	- start()�����������µ��̣߳�����ʵ�ֶ��̹߳�����
		//  - ͨ��start()ʹ���̴߳��ھ���״̬���ڻ��CPUʱ��Ƭ��ͨ��run()��ʼ����
		mt.start();
		
		for(int i = 1;i<21;i++) {
			System.out.println("main"+"------->"+i);
		}
	}

}
