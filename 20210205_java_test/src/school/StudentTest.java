package school;
public class StudentTest {
	public static void main(String[] args) {
		Student[] studentArray = new Student[3];
		studentArray[0] = new Student("È«±æµ¿",15,171,81);
		studentArray[1] = new Student("ÇÑ»ç¶÷",13,183,72);
		studentArray[2] = new Student("ÀÓ°ÆÁ¤",16,175,65);
		double[] avg = new double[studentArray.length];
		for(Student s : studentArray){
			avg[0] += s.getAge();
			avg[1] += s.getHeight();
			avg[2] += s.getWeight();
		}
		for(int i = 0; i < avg.length ; i++){
			avg[i] = Math.round((avg[i]/avg.length)*100)/100.00;
		}
		System.out.printf("³ªÀÌ Æò±Õ : %.2f\n",avg[0]);
		System.out.printf("½ÅÀåÀÇ Æò±Õ : %.2f\n",avg[1]);
		System.out.printf("¸ö¹«°Ô Æò±Õ : %.2f\n",avg[2]);
	}
}
