package case1.step3;

public class Datebase {
	
	private static Datebase singleton = new Datebase("products");
	//static�̱� ������ ���α׷� ����� ��ü�� ���������. '�̹�' ������ ���°� �ȴ�.
	//�Ʒ� getInstance���� null���θ� Ȯ���� �ʿ䰡 ��������. (�̹� �����Ƿ�)
	private String name;

	private Datebase(String name) {
		try {
			Thread.sleep(100);
			this.name = name;
		} catch (Exception e) {
			
		}
	}

	public static Datebase getInstance(String name) {
		return singleton;
	}
	public String getName() {
		return name;
	}
	
}
