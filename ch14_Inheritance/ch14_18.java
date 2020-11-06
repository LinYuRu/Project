package ch14_Inheritance;
class Car{
	private int maxSpeed;
	private String color;
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public int getMaxspeed() {
		return maxSpeed;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void printCarInfo() {
		System.out.println("車子最高時速: " + maxSpeed + "\t車子外觀顏色: " + color);
	}
}
class Sentra extends Car{
	public void SentraShow() {
		Engine sentraEngine = new Engine();
		sentraEngine.starting();
		sentraEngine.running();
		sentraEngine.stopping();
	}
}
class Engine{
	public void starting() {
		System.out.println("引擎啟動");
	}
	public void running() {
		System.out.println("引擎運轉");
	}
	public void stopping() {
		System.out.println("引擎停止");
	}
}
public class ch14_18 {
	public static void main(String[] args) {
		Sentra sentra = new Sentra();
		sentra.setMaxSpeed(100);
		sentra.setColor("Red");
		sentra.printCarInfo();
		sentra.SentraShow();
	}
}
