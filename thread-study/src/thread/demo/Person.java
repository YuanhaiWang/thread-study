package thread.demo;

public class Person {
	
	private String name;
	
	public void run() {
		// ����ѭ����ִ��20��
		for(int i=0;i<20;i++) {
			System.out.println(name+"------------->"+i);
		}
	}

	public Person() {
		super();
	}

	public Person(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
