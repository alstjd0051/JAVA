package mobile;

public abstract class Mobile {
	private String mobileName;
	private int batterySize;
	private String osType;

	public Mobile() {}

	public Mobile(String mobileName, int batterySize, String osType) {
		this.mobileName = mobileName;
		this.batterySize = batterySize;
		this.osType = osType;
	}

	public abstract int opertate(int time);

	public abstract int charge(int time);

	@Override
	public String toString() {
		return "    "+mobileName+"\t"+batterySize+"\t"+osType;
	}

	public String getMobileName() {
		return mobileName;
	}

	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}

	public int getBatterySize() {
		return batterySize;
	}

	public void setBatterySize(int batterySize) {
		this.batterySize = batterySize;
	}

	public String getOsType() {
		return osType;
	}

	public void setOsType(String osType) {
		this.osType = osType;
	}
}
