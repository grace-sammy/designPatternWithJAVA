package case1.step2;

public class AObj {
	
	BInterface bInterface;
	
	public AObj() {
		bInterface = new BImplement();
	}
	public void SomeFunc() {
		//����
		//��� ������ ����. Delegate
		bInterface.funcA();
		bInterface.funcA();
	}

}
