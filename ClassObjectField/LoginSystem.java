package ClassObjectField;

public class LoginSystem {
	private String systemUserName = "Ironman", systemPwd = "666";

	private boolean checkUserProfiles(String UserName, String UserPwd) {
		if (systemUserName.equalsIgnoreCase(UserName) && systemPwd.equalsIgnoreCase(UserPwd)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		if(args.length==2) {
			LoginSystem Login = new LoginSystem();
			boolean status = Login.checkUserProfiles(args[0],args[1]);
			if(status) {
			System.out.println("Welcome bro");
		}else {
			System.out.println("Please enter correct name&Pwd");
		}
		System.out.println("Please enter your name&pwd");
	}
}
}