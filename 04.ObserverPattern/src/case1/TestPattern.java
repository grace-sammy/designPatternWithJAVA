package case1;

public class TestPattern {

	public static void main(String[] args) {
		
		PlayController controller = new PlayController();

		MyClassA a = new MyClassA(controller);
		MyClassB b = new MyClassB(controller);
		
		System.out.println("-----��� Ŭ���� �Ͻ� ����---");
		controller.setFlag(false);
		
		System.out.println();
		System.out.println("-----��� Ŭ���� �ٽ� ����---");
		controller.setFlag(true);
		
		System.out.println();
	}

}
