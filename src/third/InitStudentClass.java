package third;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InitStudentClass {
	public static void main(String args[]) throws Exception {
		List<Student> students = new ArrayList<Student>();
		StudentClass sc = new StudentClass("��");
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("�����" + (i+1) + "��ѧ������Ϣ����ѧ�� ���� Ӣ��ɼ� ��ѧ�ɼ� ������ɼ�)");
			try {
				String input = scanner.nextLine();
				String[] temp = input.split("\\s");
				Student studenti = new Student(temp[0],temp[1],Integer.parseInt(temp[2]),Integer.parseInt(temp[3]),Integer.parseInt(temp[4]));
				if(!sc.addStudent(studenti))
					throw new Exception("��ѧ���Ѵ���");
			} catch (Exception e) {
				System.err.println("�����������������룡"+e);
				i--;
				continue;
			}}
			// students.set(i, new Student(getAStudent(i+1)));
		String sss = sc.toString();
		System.out.println(sc);
		try {
			sc.save("D:\\stu.dat");
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("�༶��Ϣ��ʼ����ϣ�");
	}}

	/*public static Student getAStudent(int i) {
		Student studenti;
		System.out.println("�����" + i + "��ѧ������Ϣ����ѧ�� ���� Ӣ��ɼ� ��ѧ�ɼ� ������ɼ�)");
		// System.out.println("ѧ�ţ�");
		Scanner scanner = new Scanner(System.in);
		String id = null;
		String name = null;
		int eng = 0;
		int math = 0, comp = 0;
		int m = 0, n = 0;
		try {

			String input = scanner.nextLine();
			String[] temp = input.split("\\s");
			studenti = new Student(temp[0],temp[1],Integer.parseInt(temp[2]),Integer.parseInt(temp[3]),Integer.parseInt(temp[4]));
		} catch (Exception e) {
			e.printStackTrace();
			continue;
		}
		
		 * System.out.println("������"); m=0; while(m<1){try{
		 * name=Keyboard.getString(); m++; }catch(Exception e){
		 * e.printStackTrace(); continue; } } System.out.println("Ӣ��ɼ���");
		 * while(n<1){ try{ eng=Keyboard.getInteger(); n++; }catch(Exception e){
		 * e.printStackTrace(); continue; }} System.out.println("��ѧ�ɼ���"); n=0;
		 * while(n<1){ try{ math=Keyboard.getInteger(); n++; }catch(Exception
		 * e){ e.printStackTrace(); continue; } } n=0;
		 * System.out.println("������ɼ���"); while(n<1){ try{
		 * comp=Keyboard.getInteger(); n++; } catch(Exception e){
		 * e.printStackTrace(); continue; }}
		
		studenti = new Student(id, name, eng, math, comp);
		return studenti;
	}
}
*/