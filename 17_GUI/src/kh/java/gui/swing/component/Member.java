package kh.java.gui.swing.component;

import java.io.Serializable;

public class Member implements Serializable {

	private String name;
	private String addr;
	private int age;
	private boolean maried;
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Member [name=" + name + ", addr=" + addr + ", age=" + age + ", maried=" + maried + "]";
	}
	public Member(String name, String addr, int age, boolean maried) {
		super();
		this.name = name;
		this.addr = addr;
		this.age = age;
		this.maried = maried;
	}
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isMaried() {
		return maried;
	}
	public void setMaried(boolean maried) {
		this.maried = maried;
	}
}
