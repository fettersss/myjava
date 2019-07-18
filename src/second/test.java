package second;

import java.io.*;

public class test {
	public static void main(String[] args) {
		String fileName="D:\\test.txt";
		MyLog myLog =new MyLog();
		try {
			long s=System.currentTimeMillis();//获取当前时间
			DataOutputStream out = new DataOutputStream(
                    new FileOutputStream( fileName  ) );
			java.util.Random r=new java.util.Random();
			for(int i=0;i<100000;i++) {
				out.writeDouble(r.nextDouble());
			}
			out.close();
			long n=System.currentTimeMillis();
			long cost=n-s;
			System.out.println("所消耗的时间为 "+(n-s)+" 毫秒");
			String se = "Done,cost "+cost+" without buffer";
			myLog.addLog(myLog.type.INFORMATION,se);
			myLog.readLog();
			
			long s1=System.currentTimeMillis();//获取当前时间
			DataOutputStream out1 = new DataOutputStream(
                    new BufferedOutputStream(
                      new FileOutputStream( fileName  ) ) );

			java.util.Random r1=new java.util.Random();
			for(int i=0;i<100000;i++) {
				out1.writeDouble(r1.nextDouble());
			}
			out1.close();
			long n1=System.currentTimeMillis();
			long cost1=n1-s1;
			System.out.println("所消耗的时间为 "+cost1+" 毫秒");
			String se1 = "Done,cost "+cost1+" without buffer";
			myLog.addLog(myLog.type.INFORMATION,se1);
			myLog.readLog();
		}
		catch(IOException iox) {
			myLog.addLog(myLog.type.ERROR,iox.getMessage());
			System.out.print(" file write wrong!");
		}
	}
}
