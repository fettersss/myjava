package third;

import java.io.*;

public class Keyboard {
    static BufferedReader inputStream=new BufferedReader(new InputStreamReader(System.in));
    public static int getInteger() throws Exception{
        try {
            return (Integer.valueOf(inputStream.readLine().trim()).intValue());
        }catch(Exception e) {
            throw new Exception("输入数字有误,请重新输入全部的信息");
        }
    }
    public static String getString() throws Exception{
        try {
            return (inputStream.readLine());
        }catch(IOException e) {
        	throw new Exception("输入数字有误,请重新输入全部的信息");
        }
    }
}
