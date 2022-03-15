package practice;

import java.util.Arrays;
import java.util.Scanner;

public class p1Solution {

    public static void main(String[] args) {
    	// code I referred to solve p1
    	// logic source : https://wikidocs.net/124671
    	
        Scanner sc=new Scanner(System.in);
        //1. 변수 선언 및 초기화
        int dice = sc.nextInt();     //주사위의 개수
        int[] result = new int [dice];  //결과값을 저장할 배열
        int n = 0;      //0~(N-1)번 주사위를 의미

        //2. 재귀함수 호출
        roll(n, dice, result);

    }
    
    public static void roll (int n, int dice, int[] result) {
    	if (n == dice) {
    	} else {
        	
        	for (int i = 1; i <= 6; i++) {
        		result[n] = i;
        		n = n + 1;
        		roll(n, dice, result);
        		n = n - 1;
        	}
    	}
    	
    }


}
