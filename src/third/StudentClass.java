package third;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class StudentClass implements Serializable {
	private String name;//�༶����
	static int capacity=40;//�������
	private List<Student> students;//ѧ��
	//private Student students[];
	private int size;//ʵ������
	
	public StudentClass(String name){
		this.name=name;
		//students=new Student[capacity];
		this.students=new ArrayList<Student>();
	}
	public String getName(){
		return name;
	}
	public int getCapacity(){
		return capacity;
	}
	public List<Student> getStudents(){
		return students;
	}
	public int getSize(){
		return size;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setCapacity(int capacity){
		this.capacity=capacity;
	}
	public void setSize(int size){
		if(size>capacity){
			System.out.println("sizeΪ"+size+",���ܳ���"+capacity);
			return;
		}
		this.size=size;
	}
	public void setStudents(List<Student> students) throws Exception{
		int i=0;
		while(i<size){
			//Student sss=this.students.get(i);
			//sss=students.get(i);
			this.students.add(students.get(i));
			if(find1(this.students.get(i).getId(),i-1)<0)
				i++;
			else
				{
				System.out.println(this.students.get(i).getId()+"ѧ���ظ���Ч,���������룡");
				this.students.get(i).setId(Keyboard.getString());
				i++;
				}
		}
		this.size=students.size();
	}
	public boolean addStudent(Student stu)
	{//��༶�����һ��ѧ��
		for(Student s:students){
			if(s.getId().equals(stu.getId()))
				return false;}
		//Student bbb=this.students.get(size);
		this.students.add(new Student(new String(stu.getId()),new String(stu.getName()),stu.getEng(),
				stu.getMath(),stu.getComp()));
		return true;
	}
	
	public int find(String id){
		for(int i=0;i<size;i++)
			if(students.get(i).getId().equals(id))
				return i;
		return -1;
	}
	public int find1(String id,int m){
	for(int j=0;j<m;j++)
		if(students.get(j).getId().equals(id))
			return j;
	return -1;}
	public void save(String filePath) throws Exception
	{//����ǰ�༶�������л����ļ�
		FileOutputStream fos=new FileOutputStream(filePath);		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(this);
		System.out.println(this);
		oos.close();
	}
	
	public static StudentClass read(String filePath) throws Exception
	{//���ļ������л����༶����
		FileInputStream fis = new FileInputStream(filePath);
		ObjectInputStream ois = new ObjectInputStream(fis);
		StudentClass class1= (StudentClass) ois.readObject();
		System.out.println(class1);
		return class1;
	}
	public Student getStudent(String id)
	{//��ѧ�Ų�ѯ�õ�ѧ����Ϣ
		for(Student s:students){
			if(s.getId().equals(id))
				return s;
		}
		return null;
	}
	
	public Collection<Student> getStudents(String Name){

		Collection<Student> c= new ArrayList<Student>(students);
		Iterator<Student> it=c.iterator();
		while(it.hasNext())
		{
			if(!it.next().getName().equals(Name))
			{
				it.remove();
			}}
		return c;
		/*for(Student s:students){
			if(s.getName().equals(Name)){
				System.out.println("ѧ�ţ�"+s.getId()+"    ������"+s.getName()+"    Ӣ�"+s.getEng()+"    ��ѧ��"+s.getMath()+"    �������"+s.getComp());
				return s;				
			}
			
		}return null;*/
	}

	//public Collection<Student> getStudents(String stuName)


}
