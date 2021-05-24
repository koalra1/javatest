
public class Tv {

	String color;
	boolean power; // on/off == 0/1
	int channel; // 채널 번호 3-tvn 5-sbs 7-kbs 9-kbs1 11-mbc
	
	void power(){power = !power;} //true,false

	void channelUp(){channel++;}

	void channelDown(){channel--;}
	


}
