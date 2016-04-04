package hw.J14.Prob1;

public class SmartPhone extends CellPhone {

	private boolean isMonthlyFixedRate;
	private int regularFee;
	
	public SmartPhone() {
	}
	
	public SmartPhone(String number, int price){
		super(number,price);
	}
	
	public SmartPhone(String number2, int price2, boolean judge, int charge){
		super(number2, price2);
		this.isMonthlyFixedRate=judge;
		this.regularFee=charge;
	}
	
	public void calculateTotalFee() {
		if(isMonthlyFixedRate){
			System.out.println("고객님은 "+regularFee+" 정액 요금제입니다.");
			setTotalFee(regularFee);
		} else {
			super.calculateTotalFee();
		}
	}
}
