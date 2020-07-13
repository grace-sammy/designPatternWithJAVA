package case1.decorator;

import case1.base.IceCream;

public class StrawBerry extends Decorator {
	//strawberry�� decorator�� ������ Decorator�� ���
	
	//wrapping�ϰ��� �ϴ� ���Ḧ �����ϱ� ���� �ν��Ͻ� ����
	IceCream iceCream;
	
	public StrawBerry(IceCream iceCream) {
		this.iceCream = iceCream;
	}

	@Override
	public String getDescription() {
		return iceCream.getDescription() + " + ����";
	}
	
	@Override
	public int price() {
		return 500 + iceCream.price();
	}

	

}
