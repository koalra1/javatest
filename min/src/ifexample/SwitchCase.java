package ifexample;

public class SwitchCase {

	public static void main(String[] args) {
		int floor = 5;
		String store;
		
		switch(floor) {
		case 1 : store = "�౹";
			break;
		
		case 2 : store = "�����ܰ�";
			break;
		case 3 : store = "�Ǻΰ�";
			break;
		case 4 : store = "ġ��";
			break;
		default:
			store = "�ｺŬ��";
		}
		System.out.println(floor + "���� ��ġ��"+store+"�Դϴ�.");
	}

}
