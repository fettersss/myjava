package first;

import java.io.*;
import java.io.InputStreamReader;

public class tese {
	static BufferedReader inputStream = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws Exception
    {
        int[] numbers = new int[3];
        //���������������� �����������󣬾ͼ������룬ֱ����������������ȷ	
        //�ڴ˲�ȫ����
        int i=0;
        while (true&&i<3) {
        	while (true&&i<3) { 
        	try {
        		System.out.println("Type in number" + (i+1)+":"); 
        		numbers[i]=Integer.valueOf(inputStream.readLine().trim()).intValue();
        		break;
        	}
        	catch (Exception e) { System.out.println("���������쳣,����������"); } 
        	}i++;
        	} 
        System.out.println("Finish!");}
	
}