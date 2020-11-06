package SE9_CH11_Thread;

public class TortoiseHareRace2 {

	public static void main(String[] args) {
		
		Hare hare = new Hare(10);
		Thread hareThread = new Thread(hare);
		Tortoise tortoise = new Tortoise(10);
		Thread tortoiseTread = new Thread(tortoise);
		
		hareThread.start();
		tortoiseTread.start();
	}

}
