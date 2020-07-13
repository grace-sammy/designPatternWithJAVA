package case1.step3;

public class TestPattern2 {
	
	static int nNum = 0;

	public static void main(String[] args) {

		Runnable task = () -> { //thread ����
			try {
				nNum++;
				Datebase database = Datebase.getInstance(nNum + "��° Database");
				System.out.println("This is the "+database.getName());
			} catch (Exception e) {
				
			}
		};
		
		for (int i=0; i<10; i++) { //thread 10�� ����
			Thread t = new Thread(task); 
			t.start();
		}
		/* ������ 
		 * 
		 * 	This is the 2��° Database
			This is the 2��° Database
			This is the 2��° Database
			This is the 2��° Database
			This is the 2��° Database
			This is the 2��° Database
			This is the 2��° Database
			This is the 2��° Database
			This is the 2��° Database
			This is the 2��° Database
		   >>>1���� ������
		  
		    ������ �޸� ������� ����Ǳ� ������ �� 1~10 ���ʷ� �����¾ʴ´�.
		  (���� ���ÿ� ���۵� -> �׷��� ������ singleton�� null�̶�� �ν�)
		  */
	}
}
