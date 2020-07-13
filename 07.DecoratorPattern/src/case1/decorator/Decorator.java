package case1.decorator;

import case1.base.IceCream;

//÷������ ��Ÿ���� Abstract Ŭ���� (Decorator Ŭ����)
//���ڷ����� Ŭ������ ������ �� Ŭ������ ���ΰ� �ִ� Ŭ������ ������ �ݿ��Ѵ�.
//�׷��Ƿ�, IceCream��ü�� �� �ڸ��� �� �� �־�� �ϹǷ� IceCreamŬ������ ����Ѵ�.

public abstract class Decorator extends IceCream {
	
	//������ �߰��ؾ� �ϹǷ� ����Ŭ�������� �� �����ϵ��� �����Ѵ�.
	public abstract String getDescription();
	//����� �̹� �߻�޼����̹Ƿ� ����Ŭ�������� �� �����ؾ� �Ѵ�.

}
