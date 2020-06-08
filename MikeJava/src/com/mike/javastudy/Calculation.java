package com.mike.javastudy;
import java.math.BigDecimal;
import java.util.Scanner;

/**
 * 数値を2つ、計算記号を渡して計算を実行する
**/
public class Calculation {
	public static void main(String[] args) {
		String num1, num2, opr;
		//標準入力定義
		Scanner stdIn = new Scanner(System.in);
		System.out.print("数値を入力してください: ");
		num1 = stdIn.next();
		System.out.print("数値を入力してください: ");
		num2 = stdIn.next();
		System.out.print("演算子を入力してください: ");
		opr = stdIn.next();
		
		//計算結果格納用変数
		String result;
		
		if (opr.equals("+")){
			System.out.println(num1 + " + " + num2);
			result = NumberUtil.additionNum(num1, num2);
			System.out.println(result);
		}else if(opr.equals("-")) {
			System.out.println(num1 + " - " + num2);
			result = NumberUtil.subtructionNum(num1, num2);
			System.out.println(result);
		}else if(opr.equals("*")) {
			System.out.println(num1 + " * " + num2);
			result = NumberUtil.multiplicationNum(num1, num2);
			System.out.println(result);
		}else if(opr.equals("/")) {
			System.out.println(num1 + " / " + num2);
			result = NumberUtil.divisionNum(num1, num2);
			System.out.println(result);
		}
		}

	

}
