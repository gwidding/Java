package assignment7;

public class TVRemote705 {
	public static void main(String[] args) {
		TVRemoteController tvR = new TVRemoteController();
		for(int i = 0; i < 10; i++) {
			tvR.channelUp();
			System.out.println("MSG: 현재 채널: " + tvR.channel);
		}
		for(int i =0 ; i < 10; i++) {
			tvR.channelDn();
			System.out.println("MSG: 현재 채널: " + tvR.channel);
		}
		for(int i =0 ; i < 5; i++) {
			tvR.volUp();
			System.out.println("MSG: 현재 채널: " + tvR.volume);
		}
		for(int i =0 ; i < 5; i++) {
			tvR.volDn();
			System.out.println("MSG: 현재 채널: " + tvR.volume);
		}
	}
}
