package springtest;

public class Address {
	private String lane;
	private String pincode;

	@Override
	public String toString() {
		return "Address [lane=" + lane + ", pincode=" + pincode + "]";
	}

	public String getLane() {
		return lane;
	}

	public void setLane(String lane) {
		this.lane = lane;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	
}
