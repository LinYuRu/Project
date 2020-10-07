package interface_Prac;


class Maze {
	private int x = 0, y = 0;

	public void move(int x, int y) {
		synchronized (this) {
			this.x = x;
			this.y = y;
			this.notify();
			System.out.println("x : " + x + " y : " + y);
		}
	}

	public void checkExit() {
		synchronized (this) {
			try {
				this.wait();
				if (x == 0 && y == 0) {
					System.out.println("Hero Survived.");
					System.exit(-1);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
}


	class Hero implements Runnable {

		private Maze core;

		public Hero(Maze core) {
			this.core = core;
		}

		@Override
		public void run() {
			while (true) {
				
				try {
					Thread.sleep((int)(Math.random() * 1000));
					int x = (int) (Math.random() * 5);
					int y = (int) (Math.random() * 5);
					core.move(x, y);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}			
				
			}
		}

	}


class MazeCheck implements Runnable{

	private Maze core;

	public MazeCheck(Maze core) {
		this.core = core;
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep((int)(Math.random()*300));
				core.checkExit();
			} catch (InterruptedException e) {


				e.printStackTrace();
			}
		    
		}
	}
	
}

public class MazeGame {

	public static void main(String[] args) {
		Maze core = new Maze();

		Hero mars = new Hero(core);
		Thread threadA = new Thread(mars);
		threadA.start();

		MazeCheck check = new MazeCheck(core);
		Thread threadB = new Thread(check);
		threadB.start();

	}

}
