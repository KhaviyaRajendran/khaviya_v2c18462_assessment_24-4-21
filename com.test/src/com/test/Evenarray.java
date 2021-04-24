package com.test;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
public class Evenarray {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(5,19,61,20,88);
		Predicate<Integer> p=i->i%2==0;
		List<Integer> even=list.stream().filter(p).collect(Collectors.toList());
		System.out.println("Even:"+even);

	}
}
