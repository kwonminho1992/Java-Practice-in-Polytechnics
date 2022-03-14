package practice;

import java.util.Scanner;

public class p1Example {

	   public static void main(String[] args) {
		      // Mr. Kim's Example of P1 
		      
		   	  // set variables
		      Scanner scanner = new Scanner(System.in);
		      int dice = scanner.nextInt();
		      int sumOfDices = scanner.nextInt();
		      
		      int num = 6; // total number of cases
		      for (int i = 1; i < dice; i++) {
		         num = num * 6;
		      }
		      System.out.println("Total number of cases : " + num);
		      
		      // %, / 연산자를 활용할것
		      for (int i = 0; i < num; i++) {
		         String line = (i + 1) + " - ";
		         
		         for (int j = 1; j <= dice; j++) {
		            line = line + j + ", ";
		            
		         }
		         System.out.println(line);
		      }
		   }

		}
