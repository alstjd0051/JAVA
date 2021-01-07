package kh.java.inherit.product.model.vo;

public class TV extends Product{
	
	//생성자
	public TV() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TV(String brand, String ProductName, int price,
			int size,int channel) {
		super(brand, ProductName, price);
		this.size = size;
		this.channel = channel;
		// TODO Auto-generated constructor stub
	}
	private int size; //인치
	private int channel;
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	
	public String getTVInfo() {
		return getProductInfo() +"," +size+", " + channel;
	}
	
	
	
}
