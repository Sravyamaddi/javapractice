package com.javapractice;

public class ThreadDemo implements Runnable {
	
	private static Thread t1 ;
	public static void main(String[] args) {
		try {
			t1 = new Thread( new ThreadDemo());
			t1.start();
			Thread t2 = new Thread(new ThreadDemo());
			t2.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		System.out.println("Thread running" + Thread.currentThread().getName());
		for (int i = 0; i < 4; i++) {
			System.out.println("Iteration : " + i +Thread.currentThread().getName());
			try {
				synchronized (t1) {
					t1.wait(1000);//making only t1 thread to wait
					t1.notify();
				}
				Thread.sleep(1000);// every thread will sleep here
			} catch (InterruptedException e) {
				System.out.println("Thread has been interrupted");
			}
		}
	}
}


