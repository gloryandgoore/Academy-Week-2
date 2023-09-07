package com.bptn.course.week2;

public class NestedTryCatchExample {

	public static void main(String args[]) {
		// Main try block
		try {
			System.out.println("Inside main try block");
			// Inner try-catch block 1
			try {
				System.out.println("dividing");
				int num = 1997 / 0;
//				int num = 1995 / 5;
//				System.out.println(num);
//				throw new NullPointerException();
				// ask about this
			} catch (ArithmeticException ex) {
				System.out.println(ex);
			}
			// Inner try-catch block 2
			try {
				int[] arr = new int[5];
//				arr[7] = 10;
				arr[3] = 12;
			} catch (ArrayIndexOutOfBoundsException ex) {
				System.out.println(ex);
			}
			System.out.println("remaining statements inside main try block");
		} catch (Exception ex) {
			System.out.println(ex);
		}
		System.out.println("remaining code");
	}

}
