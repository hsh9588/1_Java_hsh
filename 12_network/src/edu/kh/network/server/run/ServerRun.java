package edu.kh.network.server.run;

import edu.kh.network.server.medel.service.ServerService;

public class ServerRun {

	public static void main(String[] args) {

		
		ServerService service = new ServerService();
		
		service.serverStart();
	}

}
