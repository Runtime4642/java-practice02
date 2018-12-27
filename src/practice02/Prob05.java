package practice02;

import java.util.Random;
import java.util.Scanner;

public class Prob05 {


	public static void main(String[] args) {
		
		while(true) {
		Random r = new Random();
		int k = r.nextInt(100) + 1;
		Scanner scanner = new Scanner(System.in);
		while(true)
		{	
		
		int input = scanner.nextInt();
		if(k==input)
		{
			System.out.println("맞았습니다");
			break;
		
		}
		else if(k<input)
		{
			System.out.println("더 낮게");
		}
		else
			System.out.println("더 높게");
		}
		System.out.println("더하시겠습니까?(y/n)");
		String answer = scanner.next();
		if( answer.equals("y") ){
			break;
		    //종료하도록 작성한다.	
		}
		}
	}


}
