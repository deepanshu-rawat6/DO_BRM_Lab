package mypkg;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
//	Counting Sort 
	public void sort(){
		int[] arr = {2,1,1,0,2,5,4,0,2,8,7,7,9,2,0,1,9};
		System.out.println("Original Array:");
        System.out.println(Arrays.toString(arr));
//        System.out.println(arr.length);
        int[] count = new int[10];
        for(int i:arr){
            count[i]++;
        }
        for(int i = 1; i < 10; i++) {
            count[i] = count[i] + count[i - 1];
        }
        int[] sorted = new int[arr.length];
        for(int i = arr.length - 1; i >= 0; i--) {
            sorted[--count[arr[i]]] = arr[i];
//            count[arr[i]]--;
        }
        System.out.println("\nSorted Array:");
        System.out.println(Arrays.toString(sorted)); 
    }

	public static void main(String[] args) {
		
		Main obj = new Main();
		
		obj.sort();

	}
}
