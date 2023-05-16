package edu.ait.server;

/**
 * @author prabhat kumar
 *
 */
public class TokenServer {
	public static void main(String agrs[]) throws Exception {

		while (true) {
			Server server = new Server();
			server.recordPort(8000);
			server.recordData();
		}
	}
}