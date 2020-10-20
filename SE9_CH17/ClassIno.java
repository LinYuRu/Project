package SE9_CH17;

public class ClassIno {
	public static void main(String[]args) {
		Class clz = String.class;
		System.out.printf("所在模組:  %s%n", clz.getModule().getName());
		System.out.printf("類別名稱:  %s%n", clz);
		service.util.DateUtils test = new service.util.DateUtils();
		Class ck = service.util.DateUtils.class;
		System.out.printf("所在模組:  %s%n", ck.getModule().getName());
		System.out.printf("類別名稱:  %s%n", ck);
	}

}
