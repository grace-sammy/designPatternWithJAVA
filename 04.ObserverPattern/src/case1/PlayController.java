package case1;

import java.util.Observable;

//������ ���
public class PlayController extends Observable{
	
	private boolean bPlay; //���� ����
	
	public PlayController() {
		
	}
	
	//�����͸� ���� �޾� �÷��� ���� �����ϰ�,
	//���ο� �����Ͱ� �������� �˸���.
	public void setFlag(boolean bPlay) {
		this.bPlay = bPlay;
		setChanged();
		notifyObservers();
		//Observerable �ȿ� ��� �����Ǿ��ֱ� ������ �޼��� ȣ�⸸ ���ָ� �ȴ�.
	}
	
	//���࿩�� �÷��� �� ��ȯ
	public boolean getFlag() {
		return bPlay;
	}

	
}
