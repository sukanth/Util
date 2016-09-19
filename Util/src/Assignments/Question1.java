package Assignments;

import java.util.Arrays;

public class Question1 {

	public static void main(String[] args) {
		int[] arrayToBePassed ={3,4,5,6};
		fun(arrayToBePassed);

	}
	public static void fun(int[] list){
		for(int i=0;i<list.length/2;i++){
			int j=list.length-1-i;
			int temp = list[i];
			list[i]=list[j];
			list[j]=temp;
			System.out.println(Arrays.toString(list));
		}
	
	}

}
