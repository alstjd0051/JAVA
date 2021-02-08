package company;
public class Company {
	private double salary;
	private double annualIncome;
	private double bonus;
	private double afterTaxBonus;
	
	public Company() {}
	public Company(double salary) {
		this.salary = salary;
		this.bonus = salary * 0.2;
	}
	
	public double getIncome(){
		return salary*12.0;
	}
	public double getAfterTaxIncome(){
		return this.getIncome() - (this.getIncome()*0.1);
	}
	public double getBonus(){
		return bonus*4.0;
	}
	public double getAfterTaxBonus(){
		return getBonus() - (getBonus()*0.055);
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getAnnualIncome() {
		return annualIncome;
	}
	public void setAnnualIncome(double annualIncome) {
		this.annualIncome = annualIncome;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public void setAfterTaxBonus(double afterTaxBonus) {
		this.afterTaxBonus = afterTaxBonus;
	}
}
