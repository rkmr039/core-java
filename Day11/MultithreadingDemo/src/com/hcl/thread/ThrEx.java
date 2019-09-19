package com.hcl.thread;

class Even extends Thread {
  @Override
  public void run() {
    for (int i = 0; i < 20; i+=2) {
      System.out.println("Even "+ i);
      try {
		Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      } 
	}
  }
}

class Odd extends Thread {
  @Override
  public void run() {
    for (int i = 1; i < 20; i+=2) {
      System.out.println("Odd " + i);
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
	}
  }
}
class Fact extends Thread {
  @Override
  public void run() {
    int f = 1;
    for (int i = 1; i < 8; i++) {
      f = f * i;
      System.out.println("Factorial " + f);
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
	}
  }
}
public class ThrEx {
public static void main(String[] args) {
	Even e = new Even();
	Odd o = new Odd();
	Fact f = new Fact();
	Thread t1 = new Thread(e);
	Thread t2 = new Thread(o);

	Thread t3 = new Thread(f);
	
	t1.start();
	t2.start();
	try {
		t2.join();
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	t3.start();	
}
}
