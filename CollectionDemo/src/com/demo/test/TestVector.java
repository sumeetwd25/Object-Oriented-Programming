package com.demo.test;

import java.util.Vector;

public class TestVector {

	public static void main(String[] args) {
		Vector <Integer> v = new Vector <> ();
		System.out.println("capacity:"+v.capacity());
		v.add(15);
		v.add(54);
		v.add(23);
		System.out.println("size:"+v.size());
		System.out.println("capacity:"+v.capacity());
		for(int i=0;i<10;i++) {
			v.add(i+11);
		}
		System.out.println("size:"+v.size());
		System.out.println("capacity:"+v.capacity());
		for(int i=0;i<10;i++) {
			v.add(i+11);
		}
		System.out.println("size:"+v.size());
		System.out.println("capacity:"+v.capacity());
	}

}
