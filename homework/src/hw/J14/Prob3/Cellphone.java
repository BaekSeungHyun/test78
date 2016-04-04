package hw.J14.Prob3;

class CellPhone {
	
	private String model;
	private double battery;
	
	public CellPhone(){
	}
	public CellPhone(String model){
		this.model=model;
	}
	
	public void call(int time){
		if(time<0){
			throw new IllegalArgumentException("통화시간입력오류");
		}
		System.out.println("통화 시간 :"+time+"분");
		
		double amount=time*0.5;
		
		if(this.battery<amount){
			this.battery=0;
		} else {
			this.battery-=amount;
		}
	}
	
	public void charge(int time){
		if(time<0){
			throw new IllegalArgumentException("충전시간입력오류");
		}
		System.out.println("충전 시간 :"+time+"분");
		
		double amount=time*3;
		
		if(this.battery+amount>100){
			this.battery=100;
		} else {
			this.battery+=amount;
		}
	}
	
	public void printBattery(){
		System.out.println("남은 배터리 양:"+this.battery);
	}
	
	public boolean equals(Object obj){
		if(obj==null){
			return false;
		} else if(!(obj instanceof CellPhone)){
			return false;
		} else {
			CellPhone otherPhone=(CellPhone)obj;
			return this.model.equals(otherPhone.model);
		}		
	}
	
	
}
