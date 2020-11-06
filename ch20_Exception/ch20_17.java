package ch20_Exception;

public class ch20_17 {
	public static void pwdCheck(String pwdStr) {
		if  (pwdStr.length() >=5 && pwdStr.length() <=8) {
			System.out.println("密碼內容成功 : " + pwdStr);
		}
		else {
			System.out.println("密碼內容失敗 : " + pwdStr);
			throw new StringIndexOutOfBoundsException("密碼長度不符規定");
		}
	}

	public static void main(String[] args) {
		String[] pwd = {"123456", "1234567", "123456789"};
		for ( int i = 0; i < pwd.length; i++) {
			pwdCheck(pwd[i]);
		}
		System.out.println("測試密碼愉快");

	}

}
