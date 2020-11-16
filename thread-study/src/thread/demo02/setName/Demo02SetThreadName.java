package thread.demo02.setName;

public class Demo02SetThreadName {

	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.setName("threadXiaoQiang");
		mt.start();
		
		MyThread mt2 = new MyThread("ThreadLiHua");
		mt2.start();
	}
}
