package case2.step1;


public class MyClassA implements Observer{
	
	private boolean bPlay; //���࿩��
	
	@Override
	public void update(boolean play) {
		this.bPlay = play;
		myActControl();
	}
	
	public void myActControl() {
		if(bPlay) {
			System.out.println("MyClassA : ������ �����մϴ�");
		}else {
			System.out.println("MyClassA : ������ �����մϴ�");
		}
	}
}
