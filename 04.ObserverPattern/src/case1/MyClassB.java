package case1;

import java.util.Observable;
import java.util.Observer; //The type Observer is deprecated since version 9


public class MyClassB implements Observer{
	
	Observable observable; //��ϵ� Observable
	private boolean bPlay; //���࿩��
	
	public MyClassB(Observable o) {
		this.observable = o;
		Observable.addObserver(this);	//�������� ���� Ŭ���� ���
	}
	
	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof PlayController) {
			PlayController myControl = (PlayController)o;
			this.bPlay = myControl.getFlag();
			myActControl();
		}
		
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
