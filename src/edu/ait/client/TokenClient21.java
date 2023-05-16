package edu.ait.client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author prabh
 *
 */
class TokenClient21 {
	InetAddress inetAddress;
	int sendport, recordPort;
	boolean setSendData = false;
	boolean hasToken = false;
	TokenClient21 tkcl;
	TokenClient21 ser;

	TokenClient21(InetAddress lclhost) {

		this.inetAddress = lclhost;
	}

	void setSendPort(int sendport) {
		this.sendport = sendport;
	}

	void setRecPort(int recport) {
		this.recordPort = recport;
	}

	void sendData() throws Exception {
		System.out.println("case");
		BufferedReader br;
		String str = "Token";
		DatagramSocket ds;
		DatagramPacket dp;

		if (setSendData == true) {
			System.out.println("Enter the Data");
			br = new BufferedReader(new InputStreamReader(System.in));
			str = "ClientTwo….." + br.readLine();
		}
		ds = new DatagramSocket(sendport);
		dp = new DatagramPacket(str.getBytes(), str.length(), inetAddress, sendport - 1000);
		ds.send(dp);
		ds.close();
		System.out.println("Data Sent");
		setSendData = false;
		hasToken = false;

	}

	void recData() throws Exception {
		String msgstr;
		byte buffer[] = new byte[256];
		DatagramSocket ds;
		DatagramPacket dp;
		ds = new DatagramSocket(recordPort);
		dp = new DatagramPacket(buffer, buffer.length);
		ds.receive(dp);
		ds.close();
		msgstr = new String(dp.getData(), 0, dp.getLength());
		System.out.println("The data is " + msgstr);
		if (msgstr.equals("Token")) {
			hasToken = true;
		}
	}

}