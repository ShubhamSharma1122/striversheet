package com.striver.easy.array;

public class ShortZeroOneAndTwo {
	public static void shortZerosOneThenTwo(int arr[]) {
		int zeroCount = 0, oneCount = 0, twoCount = 0;
		int index = 0;
		int end = arr.length;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				zeroCount++;
			}
			if (arr[i] == 1) {
				oneCount++;
			}
			if (arr[i] == 2) {
				twoCount++;
			}
		}

//			while (end > 0) {
//
//				if (zeroCount > 0) {
//					arr[index] = 0;
//					index++;
//					zeroCount--;
//				}
//				if (zeroCount == 0 && oneCount > 0) {
//					arr[index] =1;
//					index++;
//					oneCount--;
//				}
//				if (oneCount == 0 && zeroCount == 0 && twoCount > 0) {
//					arr[index] =2;
//					index++;
//					twoCount--;
//				}
//
//				end--;
//			}
		
		while(zeroCount-->0) {
			arr[index] = 0;
			index++;
		}
		while (oneCount-- > 0) {
			arr[index] = 1;
			index++;
		}
		while (twoCount-- > 0) {
			arr[index] = 2;
			index++;
		}
		

}

public static void main(String[] args) {
	
	int arr[] =new int[10];
	arr[0]=2;
	arr[1]=0;
	arr[2]=1;
	arr[3]=2;
	arr[4]=1;
	arr[5]=0;
	arr[6]=1;
	arr[7]=0;
	arr[8]=1;
	arr[9]=2;
	
	shortZerosOneThenTwo(arr);
	for(int i:arr) {
		System.out.print(i+" ");
	}
}
}