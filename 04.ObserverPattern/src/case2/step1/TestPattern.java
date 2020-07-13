package case2.step1;

public class TestPattern {

	public static void main(String[] args) {
		
		PlayController pager = new PlayController();
		Observer ob1 = new MyClassA();
		Observer ob2 = new MyClassB();

		//������ ���
		pager.addObserver(ob1);
		pager.addObserver(ob2);
		
		//�޽��� ���
		pager.setFlag(false);
		
		//������ ����
		pager.deleteObserver(ob2);

		System.out.println("---------------");
		//�޽��� ���
		pager.setFlag(true);
	}

}
