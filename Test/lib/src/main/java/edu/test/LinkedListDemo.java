package edu.test;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	
	private List<Integer> list;
	
	public LinkedListDemo () {
		list = new LinkedList<Integer>();
		for (int i = 1; i <= 5; i++) {
			list.add(i);
		}
	}
	
	public void rotate(int n, boolean moveLeft) {
		int len = list.size();
		/*
		if (moveLeft) {
			for (int i = 0; i < n; i++) {
				int ret = list.remove(0);
				list.add(len-1, ret);
			}
		} else {
			for (int i = 0; i < n; i++) {
				int ret = list.remove(len-1);
				list.add(0, ret);
			}
		}*/
		
		for (int i = 0; i < n; i++) {
			if (moveLeft) {
				int ret = list.remove(0);
				list.add(len-1, ret);
			} else {
				int ret = list.remove(len-1);
				list.add(0, ret);
			}
		}
		
		
	}
	
	public void print () {
		for(Integer i: list) {
			System.out.println(i);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedListDemo lst = new LinkedListDemo();
		lst.rotate(2, true);
		lst.print();
		lst.rotate(2, false);
		lst.print();
	}

}
