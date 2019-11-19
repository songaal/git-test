
class Main extends Thread {
	
	public void run() {
		System.out.println("Run!");
	}
	public static void main(String[] args) {
		new Main().run()
	}
}