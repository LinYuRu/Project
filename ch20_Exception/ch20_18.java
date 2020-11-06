package ch20_Exception;

public class ch20_18 {
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
		String[] pwd = {"123456", "123456789", "1234567"};
		for ( int i = 0 ; i < pwd.length; i++) {
			try {
				pwdCheck(pwd[i]);
			}
			catch (StringIndexOutOfBoundsException e) {
				System.out.println("ERROR! " + e);
				e.printStackTrace();
			}
		}
		System.out.println("測試密碼愉快");

	}

}
