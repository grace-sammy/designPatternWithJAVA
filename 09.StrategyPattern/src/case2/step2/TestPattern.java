package case2.step2;

public class TestPattern {

	public static void main(String[] args) {
		
		DatabaseUse myDb = new DatabaseUse();
		
		//�����ͺ��̽�����
		myDb.connect(DBTYPE.MySQL);
		myDb.select();
		
		//�����ͺ��̽�����
		myDb.connect(DBTYPE.Informix);
		myDb.select();

	}

}
