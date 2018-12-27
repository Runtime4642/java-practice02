package practice02;

import java.util.Scanner;

public class Prob01 {
	private int a;
	private int b;

	public static void main(String[] args) {
		final int[] MONEYS = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };
		int[] MONEYS2 = new int[MONEYS.length];
		System.out.print("금액 : ");
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		for(int i=0;i<MONEYS.length;i++)
		{
			if(money%MONEYS[i]==0)
			{
				MONEYS2[i] = money / MONEYS[i];
				break;
			}
			else {
				MONEYS2[i] = money / MONEYS[i];
				money = money % MONEYS[i];
				
			}
		}
		for(int i=0;i<MONEYS.length;i++)
		System.out.println(MONEYS[i]+"원 : "+MONEYS2[i]+"개");
		
	}

	
	
}
