package case2.step3;

public class TestPattern {

	public static void main(String[] args) {
		
		//�����ͺ��̽��� ���������� �����Ͽ� ����Ѵ�.
		DatabaseUse myDb = new DatabaseUse();
		myDb.connect();
		
		//A(DatabaseUse)���� ���� ���� �������� ������ B(MySQL)�� �Ѵ�.
		myDb.setDatabase(new MySQL());
		myDb.connect();
		myDb.select();
		//A(DatabaseUse)���� ���� ���� �������� ������ B(Informix)�� �Ѵ�.
		myDb.setDatabase(new Informix());
		myDb.connect();
		myDb.select();
		//�߰��� Ŭ����
		//���� �ڵ��� ���� ���� ����Ŭ ���� ����� �߰��� �� �ִ�.
		myDb.setDatabase(new Oracle());
		myDb.connect();
		myDb.select();

	}

}
