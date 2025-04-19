package aps.proxy.main;

import aps.proxy.service.ServiceProxy;

public class Application {
	public static void main(String[] args) {
		ServiceProxy proxy = ServiceProxy.getProxy();

		proxy.execute();
	}
}
