package first;

import java.io.*;
import java.io.InputStreamReader;

public class tese {
	static BufferedReader inputStream = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws Exception
    {
        int[] numbers = new int[3];
        //输入三个整型数字 ，如果输入错误，就继续输入，直到三整数都输入正确	
        //在此补全程序
        int i=0;
        while (true&&i<3) {
        	while (true&&i<3) { 
        	try {
        		System.out.println("Type in number" + (i+1)+":"); 
        		numbers[i]=Integer.valueOf(inputStream.readLine().trim()).intValue();
        		break;
        	}
        	catch (Exception e) { System.out.println("错误命令异常,请重新输入"); } 
        	}i++;
        	} 
        System.out.println("Finish!");}
	
}