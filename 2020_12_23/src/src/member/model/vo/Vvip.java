package src.member.model.vo;

public class Vvip {

	private String name;
	private String grade;
	private double point;
	
	public Vvip() {
		
	}
	public Vvip(String name, String grade, double point) {
		this.name = name;
		this.grade = grade;
		this.point = point;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public double getPoint() {
		return point;
	}
	public void setPoint(double point) {
		this.point = point;
	}
	public double getBonusPoint() {
		return point*0.15;
	}
}
