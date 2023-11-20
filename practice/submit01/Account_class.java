package practice.submit01;

public class Account_class {
	
	private String ano; // 계좌번호
	private String owner; //이름
	private int balance; // 잔액
	public Account_class(String ano, String owner, int balance) {
		super();
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
		
	}
	
//	int account;
//	String name;
//	int accountBalance;
//	
//	public Account_class(int account, String name, int accountBalance) {
//		
//		this.account = account;
//		this.name = name;
//		this.accountBalance = accountBalance;
//	}
//	public void printAccontInfo() {
//		System.out.println("계좌 번호:" + account);
//		System.out.println("계좌주:" + name);
//		System.out.println("잔액:" + accountBalance);
//		
//	}


