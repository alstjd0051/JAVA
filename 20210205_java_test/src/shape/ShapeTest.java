package shape;
public class ShapeTest {
	public static void main(String[] args) {
		Shape[] shape = new Shape[6];
		String[] spName = new String[shape.length];
		shape[0] = new Triangle(7,5,"Blue");
		shape[1] = new Rectangle(4,6,"Blue");
		shape[2] = new Triangle(6,7,"Red");
		shape[3] = new Rectangle(8,3,"Red");
		shape[4] = new Triangle(9,8,"White");
		shape[5] = new Rectangle(5,7,"White");
		for(int i = 0 ; i < spName.length ; i++){
			if(i%2 != 0) spName[i] = "Rectangle";
			else spName[i] = "Triangle";
		}
		System.out.println("기본정보");
		for(int i = 0 ; i<shape.length ; i++){
			System.out.println(spName[i]+"\t"+shape[i]);
		}
		
		System.out.println("\n사이즈를 변경 후 정보");
		for(int i = 0 ; i<shape.length ; i++){
			if (shape[i] instanceof Triangle){
				((Triangle)shape[i]).setResize(5);
			} else{
				((Rectangle)shape[i]).setResize(5);
			}
			System.out.println(spName[i]+"\t"+shape[i]);
		}
		
	}
}
