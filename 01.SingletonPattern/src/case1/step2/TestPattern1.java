package case1.step2;

public class TestPattern1 {

	public static void main(String[] args) {
		
		/*
		 * Datebase d1 = new Datebase("1"); 
		 * Datebase d2 = new Datebase("2"); 
		 * Datebase d3 = new Datebase("3"); 
		 * Datebase d4 = new Datebase("4"); 
		 * Datebase d5 = new Datebase("5"); 
		 * Datebase d6 = new Datebase("6");
		 * 
		 * �� ó�� ������ Database X 6��ŭ�� ���ҽ� ����
		 * �̸� �������� Database.java�� �����ڸ� private���� ����
		 * 
		 */
		
		Datebase database;
		database = Datebase.getInstance("ù ��° Database");
		System.out.println("This is the "+database.getName());
		
		database = Datebase.getInstance("�� ��° Database");
		System.out.println("This is the "+database.getName());
		
		System.out.println("database use");
		
		/* ����� -->
		 * This is the ù ��° Database
		 * This is the ù ��° Database
		 * 
		 * �ι�° getInstance�� ������ ������ ���� �����Ƿ�..
		 * */

	}

}
