package case2.step2;

public abstract class Database {
	public String name;
	public double rows;
	
	//�����ͺ��̽����� ���� ���̺귯���� �ٸ���.
	public abstract void connectDatabase();
	
	//ǥ�� SQL���� ����Ѵ�. (����ó�� ����� ����.)
	public void insertData() {
		System.out.println(name+" �� �����͸� �߰��߽��ϴ�.");
	}
	public void selectData() {
		System.out.println(name+" ���� �����͸� "+ rows+"�� ��ȸ�߽��ϴ�.");
	}

}
