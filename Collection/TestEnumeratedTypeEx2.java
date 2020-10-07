package Collection;
enum season{
	spring, summer("Alex"), autumn, winter ;
	
	private boolean status =true;
	private String name= "Shiny";
	
	season(){
		System.out.println("Status:"+status);
	}
	
	private season(String name) {
		this.name = name;
	}
	
	public void showInfo() {
		System.out.println("name:"+name);
	}
}

public class TestEnumeratedTypeEx2 {

	public static void main(String[] args) {
		season s1 = season.summer;
		s1.showInfo();

	}

}
