package Practice;

import java.util.ArrayList;
import java.util.HashSet;

import javax.print.attribute.HashPrintJobAttributeSet;

public class Interview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ArrayList<String> arrayList = new ArrayList<String>();
		 * arrayList.add("A"); arrayList.add("M"); arrayList.add("B");
		 * 
		 * for (String arrayLis : arrayList) { System.out.println(arrayLis); }
		 */try {
			HashSet<String> hashSet = new HashSet<String>();
			hashSet.add("1");
			hashSet.addAll(null);
			for (String test : hashSet) {
				System.out.println(test);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
