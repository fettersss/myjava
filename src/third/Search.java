package third;

import java.util.Scanner;

public class Search {
	public static void main(String args[]) throws Exception{
	
	String ID=null,NAME=null;
	String FilePath=null;
	//FilePath=Keyboard.getString();
	FilePath="D:\\stu.dat";
	StudentClass sc=new StudentClass("软工");
	StudentClass sc2=sc.read(FilePath);
	Scanner scanner=new Scanner(System.in);
	System.out.println("输入要查找的学生学号：");
	ID=scanner.nextLine();
	Student stu=sc2.getStudent(ID);
	//System.out.println("学号："+ID+"    姓名："+stu.getName()+"    英语："+stu.getEng()+"    数学："+stu.getMath()+"    计算机："+stu.getComp());
	System.out.println(stu);
	
	System.out.println("输入要查找的学生姓名：");
	NAME=Keyboard.getString();
	System.out.println("查找结果：");
	for(Student s:sc2.getStudents(NAME))
		System.out.println(s);
	System.out.println("查询完毕！");
	}
	
	
}
