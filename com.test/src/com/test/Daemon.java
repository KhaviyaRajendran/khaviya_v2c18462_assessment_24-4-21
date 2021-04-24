package com.test;
public class Daemon extends Thread{
	public void run() {
		if(Thread.currentThread().isDaemon()) {
		System.out.println("daemon thread");}
		else {
			System.out.println("user thread");
		}
	}
	public static void main(String[] args) {
		Daemon d1=new Daemon();
		Daemon d2=new Daemon();
		d1.setDaemon(true);
		d1.start();
		d2.start();

	}
}
