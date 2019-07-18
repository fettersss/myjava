package third;

import java.io.Serializable;

public class Student implements Serializable{
	private String id;
	private String name;
	private int eng;
	private int math;
	private int comp;
	private int sum;
	
	public Student(String id,String name,int eng,int math,int comp) {
		this.id=id;
		this.comp=comp;
		this.name=name;
		this.eng=eng;
		this.math=math;
		sum();
	}
	
	public  Student(Student s) {
		this.id=s.id;
		this.comp=s.comp;
		this.name=new String(s.name);
		this.eng=s.eng;
		this.math=s.math;
		sum();
	}
	
	public void setId(String id) {
		this.id=id;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setEng(int eng) {
		this.eng=eng;
		sum();
	}
	
	public void setMath(int math) {
		this.math=math;
		sum();
	}
	
	public void setComp(int comp) {
		this.comp=comp;
		sum();
	}
	
	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getEng() {
		return eng;
	}
	
	public int getMath() {
		return math;
	}
	
	public int getComp() {
		return comp;
	}
	
	public int getSum() {
		return sum;
	}
	
	void sum() {
		this.sum=eng+math+comp;
	}
	
	public String toString() {
		return getId()+"\t"+getName()+"\t"+getEng()+"\t"+getMath()+"\t"+getComp()+"\t"+getSum();
	}
	
	public boolean equals(Object x) {
		if(this.getClass()!=x.getClass()) {
			return false;
		}
		Student bStudent=(Student) x;
		return (this.getId().equals(bStudent.getId()));
	}
	
	public int compare(Student A) { 
		if(this.getSum()>A.getSum()) {
			return 1;
		}
		else if(this.getSum()==A.getSum()) {
			return 0;
			}
		else {
			return -1;
		}
	}
	
	
	
	
}

