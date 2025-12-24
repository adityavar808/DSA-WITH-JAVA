package ArrayList;

import java.util.*;

public class ArrayList_First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(list);
		
		//Add
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		System.out.println(list);
		
		//Get
		
		int getValue = list.get(2);
		System.out.println(getValue);
		
		//Get all the Values
		int lengthArr = list.size();
		for(int i = 0; i < lengthArr; i++) {
			System.out.print(list.get(i));
			if(i == lengthArr-1) {
				break;
			}
			System.out.print(",");
		}
		System.out.println();
		
		
		//remove value
		//int removeValue = list.remove(2);
		//System.out.println(removeValue);
		
		System.out.println(list);
		
		System.out.println(list.remove(2));
		System.out.println(list);
		
		//Update the value
		
		list.set(2, 30);
		System.out.println(list);
		
		//size
		System.out.println(list.size());
		
		//for each loop
		for(int val : list) {
			System.out.print(val + " ");
		}
	}

}
