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
		
		return "계좌번호 :"+a+", 잔고:"+b+"원"+"\t[[ "+(-creditLineLimit)+"원 마이너스통장 ]]";
	}
	
	public String info2(){
		
		String a=accountNo;
		String b=String.valueOf(balance);
		
		return "계좌번호 :"+a+", 잔고:"+b+"원";
	}
	*/
	public void withdraw(int minus) throws Exception {
			this.balance-=minus;
			
			if (creditLine && (creditLineLimit+balance)<minus) {
				throw new Exception("잔고부족 출금불가 합니다.");
			}
			if (!creditLine&&balance<minus) {
				throw new Exception("잔고부족 출금불가 합니다.");
			}
			this.balance-=minus;
			/*
			if(-creditLineLimit>this.balance){
				throw new Exception ("잔고부족 출금불가 합니다.");
			}
			*/
	}
	public void deposit(int plus){
		this.balance+=plus;
	}	
	
	public String toString(){
		return "계좌번호:"+accountNo+", 잔고:"+balance+"원"+(creditLine ?" [[-"+creditLineLimit+"원 마이너스통장]]":"");
	}
	

	
}
