package case1.step2;

public class Datebase {
	
	private static Datebase singleton;
	private String name;

	private Datebase(String name) {
		try {
			Thread.sleep(100);
			this.name = name;
		} catch (Exception e) {
			
		}
	}

	//synchronized ���� �߰��ϹǷν�, ���ÿ� ���� �����尡 �����ϴ���
	//���� ���� �� �����尡 �����⸦ ��ٸ��� �ȴ�. (���ʵ��� �����ϵ���)
	// but ����� ���� ����. --> �����尡 ���� ��� �����
	public synchronized static Datebase getInstance(String name) {
		if (singleton == null) {
			singleton = new Datebase(name);
		}
		return singleton;
	}
	public String getName() {
		return name;
	}
	
}
