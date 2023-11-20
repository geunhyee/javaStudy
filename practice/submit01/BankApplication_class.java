package practice.submit01;

import java.util.Scanner;




public class BankApplication_class {
	
	
		
		private static Account_class[] accountArray = new Account_class[100];
		private static Scanner scanner = new Scanner(System.in);
		
		public static void main(String[] args) {
			boolean run = true;
			while (run) {
				System.out.println("-------------------");
				System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
				System.out.println("-------------------");
				System.out.println("선택>");
				
				int selectNo = scanner.nextInt();
				if(selectNo == 1) {
					createAccount();
				}else if(selectNo ==2) {
					accountList();
			
				}else if(selectNo ==3) {
					deposit();
					
				}else if(selectNo ==4) {
					withdraw();
				
				}else if(selectNo ==5) {
					run = false;
				}
			}
			System.out.println("프로그램 종료");
		}
			
			//계좌생성하기
			private static void createAccount() {
				System.out.println("-------------");
				System.out.println("계좌생성");
				System.out.println("-------------");
				System.out.println("계좌번호:");
				String ano = scanner. next();
				System.out.println("계좌주:");
				String owner = scanner.next();
				System.out.println("초기 입금 금액:");
				int balance = scanner.nextInt();
				Account_class newAccount = new Account_class(ano, owner, balance);
				for(int i = 0; i < accountArray.length; i++) {
					if(accountArray[i] == null) {
						accountArray[i] = newAccount;
						System.out.println("결과: 계좌가 생성되었습니다.");
						break;
						
					}
				}
			}
			//계좌 목록 보기
			private static void accountList() {
				System.out.println("------------");
				System.out.println("계좌목록");
				System.out.println("------------");
				for(int i = 0; i < accountArray.length; i++) {
					Account_class account = accountArray[i];
					if(accountArray != null) {
						System.out.println(account.getAno());
						System.out.println("      ");
						System.out.println(account.getOwner());
						System.out.println("      ");
						System.out.println(account.getBalance());
						System.out.println();
						
					}
				}
			}
			//예금하기
			private static void deposit() {
				System.out.println("---------------");
				System.out.println("예금");
				System.out.println("---------------");
				System.out.println("계좌번호");
				String ano = scanner.next();
				System.out.println("예금액: ");
				//계좌번호로 account 찾기
			
				int money = scanner.nextInt();
				Account_class account = findAccount(ano);
				if(account==null) {
					System.out.println("결과: 계좌가 없습니다.");
					return;
				}
				account.setBalance(account.getBalance() + money);
				System.out.println("결과 예금이 성공되었습니다.");
				// 예금 후 잔액 출력
				System.out.println("잔액:" + account.getBalance() );
				
			}
			
			//출금하기
			private static void withdraw() {
				System.out.println("------------");
				System.out.println("출금");
				System.out.println("------------");
				System.out.println("계좌번호: ");
				String ano = scanner.next();
				System.out.println("출금액:");
				int money = scanner.nextInt();
				Account_class account = findAccount(ano);
				if(account == null) {
					System.out.println("결과: 계좌가 없습니다.");
					return;
				}
				account.setBalance(account.getBalance()- money);
				System.out.println("결과: 출금이 성공되었습니다.");
				System.out.println("잔액" + account.getBalance());
			}
			
 //		Scanner scanner = new Scanner(System.in);
//		int accountCount = 1;
//		
//		Account_class[] accounts = new Account_class[accountCount];
//		
//		for(int i =0; i< accountCount; i++) {
//			System.out.println("[" + (i +1)+ "번째 계좌 정보 입력");
//			System.out.println("계좌 번호:");
//			int accountNum = scanner.nextInt();
//			System.out.println("이름:");
//			String name = scanner.nextLine();
//			System.out.println("잔액:");
//			int accountBalance = scanner.nextInt();
//			
//			accounts[i] = new Account_class(accountNum, name, accountBalance);
//			System.out.println("계좌가 생성되었습니다.");
//		}
//		for(int i= 0; i< accountCount; i++) {
//			System.out.println("[" + (i+1) + "번째 계좌정보]");
//			accounts[i].printAccontInfo();
//			System.out.println();
//		}
		
	
	private static Account_class findAccount(String ano) {
		Account_class account = null;
		for(int i = 0; i <accountArray.length; i++) {
			if(accountArray[i] != null){
				String abAno = accountArray[i].getAno();
				if(abAno.equals(ano)) {
					account = accountArray[i];
					break;
				}
			}
		}
		return account;
	}
	
}
