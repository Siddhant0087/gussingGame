package miniProject;

import java.util.Scanner;

public class miniProject {
	
	public static void game(int num, int gussNum) {
		
		if(gussNum == num) {
			System.out.println("Congrats!! you Guss correctly");
			System.out.println("Num is : "+ num);
		}
		
		else if(gussNum > num) {
			System.out.println("Guss Number Is Bigger");
		}
		
		else {
			System.out.println("Guss Number Is Smaller");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = (int)(Math.random()*100);
		
		
		Scanner sc = new Scanner(System.in);
		int gussNum = 0;
		
		while(gussNum >= 0) {
			System.out.println("Enter the num you guess (1-100)");
			gussNum = sc.nextInt();
			
			game(num, gussNum);
		}
		
		if(gussNum < 0) {
			System.out.println("You Quit the game");
			System.out.println("The Number Is : " + num);
		}
		
		
	}

}
