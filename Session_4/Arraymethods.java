package Session_4;

import java.util.Arrays;

public class Arraymethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//1. Filling arrays
		int[] arr=new int[5];
		/*
		 * syntax:
		 * fill(arrayname,fill-value)
		 */
		Arrays.fill(arr, 1);  //Fills the entire array with 1
		System.out.println("-----Filling single value for entire array-----");
		System.out.println(Arrays.toString(arr));
		
		System.out.println("------filling the value from certain given index-----");
		
		/**
		 * syntax:
		 * fill(arrayname,sourceindex,destinationindex,value-to-be-fill)
		 */
		Arrays.fill(arr, 1,4,2);//fills element from index 1 to 3 with 2
		
		System.out.println(Arrays.toString(arr));
		
		
		//2)Sorting
		
		int[] numbers= {8,5,4,3,21,0,1,2};
		
		System.out.println("---Sorting an array elements----");
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		
		//3)Binary search (before use sort after use binary search)
		System.out.println("---Binary Search-------");
		int index=Arrays.binarySearch(numbers, 21);
		System.out.println(index);
		
		
		//4)Copying Arrays
		System.out.println("--Copying Arrays----");
		int original[]= {1,2,3,4};
		System.out.println("Original Arrays:"+Arrays.toString(original));
		int copy[]=Arrays.copyOf(original, original.length);
		 
		System.out.println("copying original elements:"+Arrays.toString(copy));
		
		
		//4.1)Copying arrays using range
		int copyrange[]=Arrays.copyOfRange(original, 1, 3); //create copy of the element index 1 to 3
		System.out.println("Copying original elements using Range:"+Arrays.toString(copyrange));
		
		
		
		//5)Comparing Arrays
		
		int arr1[]= {5,6,7};
		int arr2[]= {5,6,7};
		System.out.println("--comparing two array elements-------");
		
		boolean cmpr=Arrays.equals(arr1, arr2);
		System.out.println("After Comparing:"+cmpr);
		
		
		//6)Cloning Arrays
		System.out.println("---Cloning an Array----");
		int arr3[]= {9,8,7,6};
		int clone[]=arr3.clone();
		System.out.println("After Cloning:"+Arrays.toString(clone));
		
		
		//7)Length of an array
		
		int arr4[]= {25,36,45,78,66};
		System.out.println("Arrays length "+ arr4.length);
		
	}

}
