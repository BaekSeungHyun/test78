package hw.j15;

public class Account {
	
	//Field
	private String accountNo;
	private boolean creditLine;
	private int creditLineLimit; 
	private int balance;
	//private String message;
	
	//Constructor
	public Account() {
	
	}
	
	public Account(String ac, int ba) {
	}
	
	public Account(String account, boolean credit, int creditLine, int balan) {
		this(account, balan);
		this.accountNo=account;
		this.creditLine=credit;
		this.creditLineLimit=creditLine;
		this.balance=balan;
	}
	//Getter & Setter
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public boolean isCreditLine() {
		return creditLine;
	}
	public void setCreditLine(boolean creditLine) {
		this.creditLine = creditLine;
	}
	public int getCreditLineLimit() {
		return creditLineLimit;
	}
	public void setCreditLineLimit(int creditLineLimit) {
		this.creditLineLimit = creditLineLimit;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	/*
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	*/
	//method
	/*
	public String info(){
		
		String a=accountNo;
		String b=String.valueOf(balance);
		
		return "���¹�ȣ :"+a+", �ܰ�:"+b+"��"+"\t[[ "+(-creditLineLimit)+"�� ���̳ʽ����� ]]";
	}
	
	public String info2(){
		
		String a=accountNo;
		String b=String.valueOf(balance);
		
		return "���¹�ȣ :"+a+", �ܰ�:"+b+"��";
	}
	*/
	public void withdraw(int minus) throws Exception {
			this.balance-=minus;
			
			if (creditLine && (creditLineLimit+balance)<minus) {
				throw new Exception("�ܰ���� ��ݺҰ� �մϴ�.");
			}
			if (!creditLine&&balance<minus) {
				throw new Exception("�ܰ���� ��ݺҰ� �մϴ�.");
			}
			this.balance-=minus;
			/*
			if(-creditLineLimit>this.balance){
				throw new Exception ("�ܰ���� ��ݺҰ� �մϴ�.");
			}
			*/
	}
	public void deposit(int plus){
		this.balance+=plus;
	}	
	
	public String toString(){
		return "���¹�ȣ:"+accountNo+", �ܰ�:"+balance+"��"+(creditLine ?" [[-"+creditLineLimit+"�� ���̳ʽ�����]]":"");
	}
	

	
}
