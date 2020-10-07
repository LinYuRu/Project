package Collection;

class TestInteger{
	private Integer i1;

	public Integer getI1() {
		return i1;
	}

	public void setI1(Integer i1) {
		this.i1 = i1;
	}
	
}

class TestString{
	private String s1;
	
	public String getS1() {
		return s1;
	}


	public void setS1(String s1) {
		this.s1 = s1;
	}
}
class TestObject{
	private Object o1;

	public Object getO1() {
		return o1;
	}

	public void setO1(Object o1) {
		this.o1 = o1;
	}
	
}

class TestGenerics<T>{
	private T t1;
	
	public T getT1() {
		return t1;
	}
	
	public void setT1(T t1) {
		this.t1 = t1;
	}
	
}
public class CallTestGenericsEx1 {

	public static void main(String[] args) {
		TestInteger test1 = new TestInteger();
		test1.setI1(6);
		int num1 = test1.getI1();
	   System.out.println("Num1 : "+num1);
	
	   TestString test2 = new TestString();
	   test2.setS1("Thor");
	   String str = test2.getS1();
	   System.out.println("str : "+str);
	   
	   TestObject test3 = new TestObject();
	   test3.setO1("Ship");
	   String op = (String)test3.getO1();
	   System.out.println("op means :"+op);
	   
	   TestGenerics<Integer> test4 = new TestGenerics<Integer>();
	   test4.setT1(9);
	   int gg = test4.getT1();
	   System.out.println("gg : "+gg);
	   
	   TestGenerics<String> test5 = new TestGenerics<String>();
	   test5.setT1("Cesar");;
	   String kk = test5.getT1();
	   System.out.println("kk : "+kk);
	}

}
