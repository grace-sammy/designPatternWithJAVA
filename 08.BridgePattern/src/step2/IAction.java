package step2;

// IRobot, RobotModel1, RobotModel2�� ���� ���� ����� �߰��ϰ��� �Ѵ�.
public class IAction {
	private IRobot robot;
	
	public IAction(IRobot robot) {
		this.robot = robot;
	}
	
	//IRobot�� ����� ���� �Ȱ��� �����Ѵ�.
	void powerOn() {
		robot.powerOn();
	}
	void powerOff() {
		robot.powerOff();
	}

}
