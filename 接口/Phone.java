class Phone implements USB,WiFi{ //实现USB接口 和wifi接口
	public void read(){//复写接口中的抽象方法
		System.out.println("USBPhone read");
	}

	public void write(){//复写接口中的抽象方法
		System.out.println("USBPhone write");
	}

	public void open(){
		System.out.println("WIFI open");
	}

	public void close(){
		System.out.println("WIFI close");
	}
}