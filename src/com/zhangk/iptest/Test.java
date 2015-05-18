package com.zhangk.iptest;

public class Test {

	public static void main(String[] args) {
		IPSeeker ip = new IPSeeker("qqwry.dat", "d:/ip");
		// ≤‚ ‘IP 58.20.43.13
		System.out.println(ip.getIPLocation("58.20.43.13").getCountry() + ":"
				+ ip.getIPLocation("58.20.43.13").getArea());
	}

}
