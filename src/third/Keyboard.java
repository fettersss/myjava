package third;

import java.io.*;

public class Keyboard {
    static BufferedReader inputStream=new BufferedReader(new InputStreamReader(System.in));
    public static int getInteger() throws Exception{
        try {
            return (Integer.valueOf(inputStream.readLine().trim()).intValue());
        }catch(Exception e) {
            throw new Exception("������������,����������ȫ������Ϣ");
        }
    }
    public static String getString() throws Exception{
        try {
            return (inputStream.readLine());
        }catch(IOException e) {
        	throw new Exception("������������,����������ȫ������Ϣ");
        }
    }
}
