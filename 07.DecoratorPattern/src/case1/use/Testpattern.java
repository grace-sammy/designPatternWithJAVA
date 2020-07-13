package case1.use;

import case1.base.IceCream;
import case1.base.IceCreamCake;
import case1.base.IceCreamCone;
import case1.base.IcePop;
import case1.decorator.Melon;
import case1.decorator.StrawBerry;

public class Testpattern {

	public static void main(String[] args) {
		
		IceCream iceCream1 = new IceCreamCone();
		System.out.println(iceCream1.getDescription() + " ���� :" + iceCream1.price());
		
		//�Ʒ��� ���� ������ �⺻�� ÷�������� Wrapping�ؼ� ���ݰ� ������ �߰��� �� �ִ�.
		IceCream iceCream2 = new IceCreamCake();
		iceCream2 = new StrawBerry(iceCream2);
		System.out.println(iceCream2.getDescription() + " ���� :" + iceCream2.price());
		
		IceCream iceCream3 = new Melon(new StrawBerry(new IcePop()));
		System.out.println(iceCream3.getDescription() + " ���� :" + iceCream3.price());

	}

}
