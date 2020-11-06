package ch21_Thread;

class MultiThread extends Thread{
	MultiThread(String name) {
		super(name);
	}
	public void run() {
		System.out.println("Thread運行中...");
	}
}

public class ch21_3 {

	public static void main(String[] args) {
		MultiThread t = new MultiThread("Horse");
		t.start();
		System.out.println("列出預設的執行緒名稱: "+ t.getName());
		System.out.println("列出預設的執行緒ID: "+ t.getId());
		System.out.println("列出預設的執行緒參照: "+ t.currentThread());
		System.out.println("列出預設的執行緒狀態: "+ t.getState());
		System.out.println("列出預設的執行緒是否存在: "+ t.isAlive());

	}

}
