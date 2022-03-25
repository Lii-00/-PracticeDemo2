/*
数组的练习
	1.创建已基本类型的数组，并输出字符A~Z；
	2.已知数列8、4、2、1、3、9、7、0	(1)分两行对齐输出该数组 (2)求出该数组中数据之和 (3)输入一任意数据，判断该数组中是否存在
*/
import java.util.Scanner;

public class ArrayDemo{
	
	public static void main(String[] args){
		
		//1.输出字符A~Z；
		char[] str = new char[26];
		for(int i = 0;i < 26;i++){
			System.out.println("str[" + i + "] = "+(char)('A' + i));
		}
		
		//2.对数列{8、4、2、1、3、9、7、0}按要求操作
		int[] array = new int[]{8,4,2,1,3,9,7,0};			//对数组初始化并赋值
		int sum = 0;
		for(int i = 0;i < array.length;i++){
			System.out.print(array[i] + "\t");
			if(i == 3){
				System.out.println();
			}
			sum += array[i];
		}
		System.out.println("\n该数组数据之和为：" + sum);
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入一个数据：");
		int target = sc.nextInt();
		for(int i = 0;i < array.length;i++){
			if(array[i] == target){
				System.out.println("您输入的数据存在于该数组中！");
				break;
			}else if(i == array.length - 1){
				System.out.println("抱歉！您输入的数据不存在于当前数组之中！");
			}
		}
		
	}
	
}