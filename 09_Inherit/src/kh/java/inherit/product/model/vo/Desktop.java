package kh.java.inherit.product.model.vo;

public class Desktop extends Product {

	private String os;
	private String monitor;
	private String keyboard;
	
	public Desktop() {
		
	}
	/**
	 * brand, productname, price, os, monitor, keyboard
	 * 
	 * Desktop d = new Desktop("삼성", "삼성데스크탑", "윈도우","100만원",
	 * 							 "27인치 좋은것", "기계식키보드");
	 */
	public Desktop(String brand, String productName, int price,
					String os, String monitor, String keyboard) {
		
//		this.brand = brand;
//		this.ProductName = productName;
//		this.Price = price;
		
		//상속받은 public메소드는 현재객체 소속인것처럼 사용가능.
		setBrand(brand);//this 생략
		setProductName(productName);
		setPrice(price);
		this.os = os;
		this.monitor = monitor;
		this.keyboard = keyboard;
		
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public String getMonitor() {
		return monitor;
	}
	public void setMonitor(String monitor) {
		this.monitor = monitor;
	}
	public String getKeyboard() {
		return keyboard;
	}
	public void setKeyboard(String keyboard) {
		this.keyboard = keyboard;
	}
	
	public String getDesktopInfo() {
//		return getBrand() + ", " + getProductName() + ", " + getPrice() + ", "
//				+ os + ", "+ monitor + ", " + keyboard;
		return getProductInfo() + ", " + os + ", "+ monitor + ", " + keyboard;
	}
	@Override
	public String toString() {
//		return getBrand() + ", " + getProductName() + ", " + getPrice() + ", "
//				+ os + ", "+ monitor + ", " + keyboard;
		return super.toString() + ", " + os + ", "+ monitor + ", " + keyboard;
	}
}
