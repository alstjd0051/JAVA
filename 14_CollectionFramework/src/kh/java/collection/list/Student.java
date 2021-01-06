package kh.java.collection.list;

public class Student implements Comparable<Student>{
	private int no;
	private String name;

	public Student() {
		super();
	}

	public Student(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + "]";
	}
	/*
	 * 기본 정렬 : 학번 오름차순
	 * 
	 * 양수
	 * 0
	 * 음수 : 자리바꿈
	 */
	
	@Override
	public int compareTo(Student other) {
		return this.no - other.no;
	}
}