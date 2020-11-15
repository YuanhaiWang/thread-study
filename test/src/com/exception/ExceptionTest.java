package com.exception;

public class ExceptionTest {

	public static void main(String[] args) {
		int[] arr = {1,2,3};
//		try {
			getElement(arr,3);
//		}catch(ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
//		}
		
		
	}
	
	private static int getElement(int[] arr,int i) throws ArrayIndexOutOfBoundsException {
		int x = arr[i];
		System.out.println("getElement()...........");
		return x;
		
	}
}
