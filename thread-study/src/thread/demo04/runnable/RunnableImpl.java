package thread.demo04.runnable;

/*
 * 1.����һ��runable�ӿڵ�ʵ����
 */
public class RunnableImpl implements Runnable{

	// 2.��ʵ��������дrunable�ӿڵ�run()���������������߳�����
	@Override
	public void run() {
		for(int i=0;i<20;i++) {
			System.out.println(Thread.currentThread().getName()+"--->"+i);
		}
	}

}
