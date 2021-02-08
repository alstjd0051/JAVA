package company;
public class Test02 {
	public static void main(String[] args) {
		Company com = new Company(Integer.parseInt(args[0]));
		System.out.printf("연 기본급 합 : %.1f  세후 : %.1f\n",com.getIncome(),com.getAfterTaxIncome());
		System.out.printf("연 보너스 합 : %.1f  세후 : %.1f\n",com.getBonus(),com.getAfterTaxBonus());
		System.out.printf("연 지급액 합 : %.1f\n",com.getAfterTaxIncome()+com.getAfterTaxBonus());
	}
}