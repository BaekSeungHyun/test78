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
			throw new IllegalArgumentException("��ȭ�ð��Է¿���");
		}
		System.out.println("��ȭ �ð� :"+time+"��");
		
		double amount=time*0.5;
		
		if(this.battery<amount){
			this.battery=0;
		} else {
			this.battery-=amount;
		}
	}
	
	public void charge(int time){
		if(time<0){
			throw new IllegalArgumentException("�����ð��Է¿���");
		}
		System.out.println("���� �ð� :"+time+"��");
		
		double amount=time*3;
		
		if(this.battery+amount>100){
			this.battery=100;
		} else {
			this.battery+=amount;
		}
	}
	
	public void printBattery(){
		System.out.println("���� ���͸� ��:"+this.battery);
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
