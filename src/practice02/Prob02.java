package practice02;

import java.util.Scanner;

public class Prob02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int intArray[] = new int[5];
		int sum=0;
		System.out.println("5개의 숫자를 입력");
		for(int i=0;i<intArray.length;i++)
		{
			intArray[i]=in.nextInt();
			sum+=intArray[i];
		}
		System.out.println("평균은 "+sum/5.0+"입니다");
		
		
	}

}
