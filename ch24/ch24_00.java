package ch24;
class MyData{
	
	int obj;
		void setobj(int obj) {
			this.obj = obj;
}
		int getobj() {
			return this.obj;
		}
		private int testE(int objE) {
//			Integer x=  objE;
			return objE;
		}
		
		public void tryE() {
			Integer e ;
			e = this.testE(obj);
			System.out.println(e);
		}
}
public class ch24_00 {
	
	
	public static void main(String[] args) {
		MyData m = new MyData();
//		m.setobj(10);
//		System.out.println(m.getobj());
//		tryE();
		System.out.println(ch24_00.class.getClass().getName());
		m.tryE();
		m.setobj(2);
		m.getobj();
		m.tryE();
		
	}
}
