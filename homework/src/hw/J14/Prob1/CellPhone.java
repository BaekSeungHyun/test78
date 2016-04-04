package hw.J14.Prob1;

public class CellPhone {

	private String phoneNumber;
	private int totalCallTime;
	private int totalFee;
	private int freePerCallTime;
	
	public CellPhone() {
	}
	
	public CellPhone(String number, int price) {
		this.phoneNumber=number;
		this.freePerCallTime=price;
	}
	
	public void call(String number2, int time) {
		System.out.println(number2+" 번호로 "+time+" 통화함.");
		this.totalCallTime+=time;
	}
	
	public void calculateTotalFee() {
		this.totalFee=(freePerCallTime*totalCallTime);
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getTotalCallTime() {
		return totalCallTime;
	}

	public void setTotalCallTime(int totalCalTime) {
		this.totalCallTime = totalCalTime;
	}

	public int getTotalFee() {
		return totalFee;
	}

	public void setTotalFee(int totalFee) {
		this.totalFee = totalFee;
	}

	public int getFreePerCallTime() {
		return freePerCallTime;
	}

	public void setFreePerCallTime(int feePerCallTime) {
		this.freePerCallTime = feePerCallTime;
	}
}
