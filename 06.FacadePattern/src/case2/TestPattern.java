package case2;

public class TestPattern {

	public static void main(String[] args) {
		
		Computer c = new Computer();
		Light l = new Light();
		Radio r = new Radio();
		
		//���� ��� ���
		c.turnOff();
		l.turnOff();
		r.turnOff();
		
		//�Ļ�� ���� ���� �� ���
		HomeFacade home = new HomeFacade(c, l, r);
		home.homeIn();
		
	}

}
