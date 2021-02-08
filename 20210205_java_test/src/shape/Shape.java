package shape;
public abstract class Shape {
	private int width; // 가로 길이
	private int height; // 세로 길이
	private String colors; // 색상
	
	public Shape(){}
	public Shape(int width, int height, String colors) {
		this.width = width;
		this.height = height;
		this.colors = colors;
	}
	
	public abstract double getArea(); // 넓이 구하기
	@Override
	public String toString() {
		return getArea()+" "+colors;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String getColors() {
		return colors;
	}
	public void setColors(String colors) {
		this.colors = colors;
	}
	
}
