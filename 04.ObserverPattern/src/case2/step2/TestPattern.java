package case2.step2;

public class TestPattern {

	public static void main(String[] args) {
		
		PlayController controller = new PlayController();
		Observer ob1 = new MyClassA(controller);
		Observer ob2 = new MyClassB(controller);

		System.out.println("------��� Ŭ���� �Ͻ�����---------");
		
		//�޽��� ���
		controller.setFlag(false);
		

		System.out.println("-----��� Ŭ���� �ٽý���----------");
		//�޽��� ���
		controller.setFlag(true);
	}

}
