package thread.demo;
/*
 * 1������һ��Thread�������
 */
public class MyThread extends Thread {
	// 2,��Thread��������У���дthread���run()�����������߳����񣨼������߳�Ҫ��ʲô��
	@Override
	public void run() {
		for(int i = 1;i<21;i++) {
			System.out.println("myThread"+"------->"+i);
		}
	}

}
