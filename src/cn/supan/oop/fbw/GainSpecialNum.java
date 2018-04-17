package cn.supan.oop.fbw;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * 获取输入特殊数字类：
 * 	属性：
 * 		接收键盘输入特殊数字数组  nums
 *  函数：
 * 		获取单个输入的特殊数方法  getNumber()
 *    	获取输入特殊数数组的方法 getSpecialNums()
 * */

public class GainSpecialNum {
	//用于接收输入的三个特殊数
	static int nums[] = new int[3];
	// 调用获取单个输入特殊数的方法，返回一个满足规则的数组
	public static int[] getSpecialNums() {
		System.out.println("Please enter the first special number:");
		nums[0] = getNumber();
		System.out.println("Please enter the second special number:");
		nums[1] = getNumber();
		System.out.println("Please enter the last special number:");
		nums[2] = getNumber();
		System.out.println("The speical numbers are: " + getNumsString());
		System.out.println("hahaa");
		return nums;
	}

	// 获取键盘输入:返回单个输入的特殊数
	public static int getNumber() {
		boolean flag = false;
		int i = 0;
		while (!flag) {
			try {
				Scanner in = new Scanner(System.in);
				i = in.nextInt();
				if (i >= 10 || i < 0) {
					System.out.println("The number must be 0-9, please try again:");
					flag = false;
				} else if (nums[0] == i || nums[1] == i || nums[2] == i) {
					System.out.println("Can not input same number twice, please try again:");
					flag = false;
				} else {
					flag = true;
				}
			} catch (InputMismatchException e) {
				System.out.println("Bad input, please try again:");
			}
		}
		return i;
	}

	private static String getNumsString() {
		return nums[0] + "," + nums[1] + "," + nums[2];
	}
}