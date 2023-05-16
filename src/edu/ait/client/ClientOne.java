package edu.ait.client;

import java.io.*;
import java.net.*;

/**
 * 
 * Client One
 * 
 * @author prabhat kumar
 *
 */
public class ClientOne {
	static boolean setSendData;
	static boolean hasToken;

	public static void main(String arg[]) throws Exception {
		InetAddress inetAddress;
		BufferedReader bufferedReader;
		String str = "";
		TokenClient12 tkcl, tkser;

		while (true) {
			inetAddress = InetAddress.getLocalHost();
			tkcl = new TokenClient12(inetAddress);
			tkser = new TokenClient12(inetAddress);
			tkcl.setSendPort(9004);
			tkcl.setRecPort(8002);
			inetAddress = InetAddress.getLocalHost();
			tkser.setSendPort(9000);

			if (tkcl.hasToken == true) {

				System.out.println("Do you want to enter the Data –> YES/NO");
				bufferedReader = new BufferedReader(new InputStreamReader(System.in));
				str = bufferedReader.readLine();
				if (str.equalsIgnoreCase("yes")) {
					System.out.println("ready to send");
					tkser.setSendData = true;
					tkser.sendData();
					tkser.setSendData = false;
				} else if (str.equalsIgnoreCase("no")) {
					System.out.println("i m in else");
					tkcl.sendData();
					tkcl.recData();
					System.out.println("i m leaving else");
				}
			} else {
				System.out.println("ENTERING RECEIVING MODE…");
				tkcl.recData();
			}
		}
	}

}