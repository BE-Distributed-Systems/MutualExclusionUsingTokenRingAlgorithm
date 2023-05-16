package edu.ait.client;

import java.io.*;
import java.net.*;

/**
 * Client Two
 * 
 * @author prabhat kumar
 *
 */
public class ClientTwo {
	static boolean setSendData;
	static boolean hasToken;

	public static void main(String arg[]) throws Exception {
		InetAddress lclhost;
		BufferedReader br;
		String str1;
		TokenClient21 tkcl;
		TokenClient21 ser;
		while (true) {
			lclhost = InetAddress.getLocalHost();
			tkcl = new TokenClient21(lclhost);
			tkcl.setRecPort(8004);
			tkcl.setSendPort(9002);
			lclhost = InetAddress.getLocalHost();
			ser = new TokenClient21(lclhost);
			ser.setSendPort(9000);
			if (hasToken == true) {

				System.out.println("Do you want to enter the Data –> YES/NO");
				br = new BufferedReader(new InputStreamReader(System.in));
				str1 = br.readLine();
				if (str1.equalsIgnoreCase("yes")) {
					System.out.println("ignorecase");
					ser.setSendData = true;
					ser.sendData();
				} else if (str1.equalsIgnoreCase("no")) {
					tkcl.sendData();
					hasToken = false;
				}
			} else {
				System.out.println("entering recieving mode");
				tkcl.recData();
				hasToken = true;
			}
		}
	}
}