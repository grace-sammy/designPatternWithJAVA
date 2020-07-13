package case2.step3;

public class DatabaseUse {
	
	//������
	private Database db;
	
	//�����ͺ��̽� ��ȯ �����ϵ���
	public void setDatabase(Database db) {
		this.db = db;
	}
	
	//��� ����
	public void connect() {
		if (db == null) {
			System.out.println("�����ͺ��̽��� ���� �����ϼ���.");
		} else {
			//Function Delegate : ��ü���� �����ͺ��̽��� ������ ���� ��� ��� ����
			db.connectDatabase();
		}
	}
	
	public void select() {
		db.selectData();
	}
}
