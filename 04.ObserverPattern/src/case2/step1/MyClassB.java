package case2.step1;


public class MyClassB implements Observer{
	
	private boolean bPlay; //���࿩��
	
	@Override
	public void update(boolean play) {
		this.bPlay = play;
		myActControl();
	}
	
	public void myActControl() {
		if(bPlay) {
			System.out.println("MyClassB : ������ �����մϴ�");
		}else {
			System.out.println("MyClassB : ������ �����մϴ�");
		}
	}

}
