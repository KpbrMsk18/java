package com.mike.javastudy;

import java.math.BigDecimal;

public class NumberUtil {
	
		/**
		 * 和算処理
		 * @param num1
		 * @param num2
		 * @return addition
		 */
		 public static String additionNum(String num1, String num2) {
			//BigDecimalで計算
			BigDecimal bd1 = new BigDecimal(num1);
			BigDecimal bd2 = new BigDecimal(num2);
			BigDecimal res = bd1.add(bd2);
			
			String addtion = res.toString();
			return addtion;
		}

		/**
		 * 減算処理
		 * @param num1
		 * @param num2
		 * @return subtraction
		 */
		public static String subtructionNum(String num1, String num2) {
			//BigDecimalで計算
			BigDecimal bd1 = new BigDecimal(num1);
			BigDecimal bd2 = new BigDecimal(num2);
			BigDecimal res = bd1.subtract(bd2);
			
			String subtruction = res.toString();
			return subtruction;
		}
		
		/**
		 * 積算処理
		 * @param num1
		 * @param num2
		 * @return multiplication
		 */
		public static String multiplicationNum(String num1, String num2) {
			//BigDecimalで計算
			BigDecimal bd1 = new BigDecimal(num1);
			BigDecimal bd2 = new BigDecimal(num2);
			BigDecimal res = bd1.multiply(bd2);
			
			String multiplication = res.toString();
			return multiplication;
		}
		/**
		 * 除算処理
		 * @param num1
		 * @param num2
		 * @return division
		 */
		public static String divisionNum(String num1, String num2) {
			//BigDecimalで計算
			BigDecimal bd1 = new BigDecimal(num1);
			BigDecimal bd2 = new BigDecimal(num2);
			BigDecimal res = bd1.divide(bd2);
			
			String division = res.toString();
			return division;
		}
}
