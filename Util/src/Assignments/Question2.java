package Assignments;

import java.util.ArrayList;

public class Question2 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		mystery(list);

	}
	public static void mystery(ArrayList<Integer> list){
		for(int i=list.size()-2;i>0;i--){
			int a=list.get(i);
			int b=list.get(i+1);
			list.set(i,a+b);
			System.out.println(list);
		}
	}
}
