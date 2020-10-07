package JavaPractice;

public class MailCheck {

	public static void main(String[] args) {
		String EMAIL_REGEX = "\\p{Alpha}\\w{2,15}[@][a-z0-9]{3,}[.]\\p{Lower}{2,}";
		String email1 = "user@domain.com";
		Boolean b = email1.matches(EMAIL_REGEX);
		System.out.println("is e-mail: " + email1 + " :Valid = " + b);
		String email2 = "123@domain.con";
		b = email2.matches(EMAIL_REGEX);
		System.out.println("is e-mail: " + email2 + " :Valid = " + b);

	}

}
