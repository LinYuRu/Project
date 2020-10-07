package JavaFlowControl;

public class HW3 {

	public static void main(String[] args) {

		int index = 1;
		double Lenth = 20;

		if (index == 1)	{
			System.out.println(Lenth+" cm" );
			Lenth = Lenth * (1/100d);
			System.out.println(Lenth+" m" );
		}

		if (index == 2)	{
			System.out.println(Lenth+" cm" );
			Lenth = Lenth *(1/100d);
			System.out.println(Lenth+" m"  );
		}
	}
}
