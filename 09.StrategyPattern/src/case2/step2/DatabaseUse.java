package case2.step2;

enum DBTYPE {MySQL, Informix}

public class DatabaseUse {
	
	private Database db;
	
	//��� ����
	public void connect(DBTYPE dbType) {
		switch(dbType) {
		case MySQL :
			db = new MySQL();
			break;
		case Informix :
			db = new Informix();
			break;
		}
		if (db == null) {
			System.out.println("�����ͺ��̽��� ���� �����ϼ���");
		} else {
			db.connectDatabase();
		}
	}
	
	public void select() {
		db.selectData();
	}
}
