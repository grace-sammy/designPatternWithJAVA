package case2.step2;


public class MyClassB implements Observer{
	
	Publisher observable; //��ϵ� Observable
	private boolean bPlay; //���࿩��
	
	//������ �� ���� �ڱ� �ڽ��� �������� ����Ѵ�.
	public MyClassB(Publisher o) {
		this.observable = o;
		observable.addObserver(this);
	}
	
	
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
			observable.deleteObserver(this); //�������� ���� (���� ������ ������ ���� ���ϰԵȴ�.)
		}
	}

}
