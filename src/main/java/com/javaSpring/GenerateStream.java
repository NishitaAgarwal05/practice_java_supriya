package com.javaSpring;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class GenerateStream {

	public static void main(String[] args) {
	
		
		Stream<Integer> infiniteStream = Stream.iterate(5,n -> n+5);
		
		System.out.println("Multiples of 5 upto 10 : ");
		infiniteStream.limit(10)
		.forEach(n -> System.out.println(n));
		
		}
		
	}

