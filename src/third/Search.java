package third;

import java.util.Scanner;

public class Search {
	public static void main(String args[]) throws Exception{
	
	String ID=null,NAME=null;
	String FilePath=null;
	//FilePath=Keyboard.getString();
	FilePath="D:\\stu.dat";
	StudentClass sc=new StudentClass("��");
	StudentClass sc2=sc.read(FilePath);
	Scanner scanner=new Scanner(System.in);
	System.out.println("����Ҫ���ҵ�ѧ��ѧ�ţ�");
	ID=scanner.nextLine();
	Student stu=sc2.getStudent(ID);
	//System.out.println("ѧ�ţ�"+ID+"    ������"+stu.getName()+"    Ӣ�"+stu.getEng()+"    ��ѧ��"+stu.getMath()+"    �������"+stu.getComp());
	System.out.println(stu);
	
	System.out.println("����Ҫ���ҵ�ѧ��������");
	NAME=Keyboard.getString();
	System.out.println("���ҽ����");
	for(Student s:sc2.getStudents(NAME))
		System.out.println(s);
	System.out.println("��ѯ��ϣ�");
	}
	
	
}
