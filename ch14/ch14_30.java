package ch14;
class Bank{
	int balance = 10000;
}
class FirstBank extends Bank{
	int balance = 50000;
}
public class ch14_30 {
	public static void main(String[] args) {
		Bank a = new FirstBank();
		System.out.println(a.balance);
	}
}
