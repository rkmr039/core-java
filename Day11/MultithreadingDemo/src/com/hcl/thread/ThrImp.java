package com.hcl.thread;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

class ListDemo implements Runnable {

	@Override
	public void run() {
      List lstData = new ArrayList();
      
      lstData.add("Anand");
      lstData.add("Yash");
      lstData.add("Amit");
      lstData.add("Rishab");
      
      for (Object object : lstData) {
		System.out.println("list : " + object);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
      
	}
	
}

class LinkDemo implements Runnable {

	@Override
	public void run() {
		
		LinkedList lst = new LinkedList();
		
		lst.add("Bindu");
		lst.add("Vishalakshi");
		lst.add("Anubhav");
		lst.add("Prem");
		lst.add("Rishab");
		lst.add("Janani");
        lst.addFirst("Tarun");
        lst.addLast("Kiruba");;
		
		for (Object object : lst) {
			System.out.println("LinkedList : " + object);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}

class VecotrDemo implements Runnable {

	@Override
	public void run() {
		Vector v = new Vector(); 
		
		v.addElement("Niveda");
		v.addElement("Yashwant");
		v.addElement("Sai Krishna");
		v.addElement("Prem Reddy");
		v.addElement("Anisha");
		v.addElement("Nagendra");
		
		for (Object object : v) {
			System.out.println("Vector : " + object);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

public class ThrImp {
  public static void main(String[] args) {
	Thread t1 = new Thread(new ListDemo());
	Thread t2 = new Thread(new LinkDemo());
	Thread t3 = new Thread(new VecotrDemo());
	
	t1.start();
	t2.start();
	t3.start();
  } 
}
