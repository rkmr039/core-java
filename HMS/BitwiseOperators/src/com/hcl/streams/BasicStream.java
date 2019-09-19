package com.hcl.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BasicStream {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<=100; i++) {
			list.add(i);
		}
		// list.forEach(System.out::println);
		// list.stream().forEach(System.out::println);
		
		// It'll create threads according to available ports and CPU cores
		// list.parallelStream().forEach(System.out::println); 
		
		list.stream().filter( i -> {
			System.out.println("Hi");
			return true;
		});
		// get list of even nums
		List<Integer> evenNums = list.stream().filter(i -> i%2 == 0).collect(Collectors.toList());
		evenNums.forEach(System.out::println);
		
		
	}
}	
