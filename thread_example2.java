
public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JavaThread2 jt1 = new JavaThread2("Hello1");
		JavaThread2 jt2 = new JavaThread2("World1");
		Thread th1 = new Thread(jt1);
		Thread th2 = new Thread(jt2);
		
		th1.start();
		th2.start();
		
		System.out.println("Main Thread");

	}

}

class JavaThread2 implements Runnable {

	private String word;
	
	public JavaThread2(String s) {
		// TODO Auto-generated constructor stub
		word = s;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for(;;) {
				System.out.println(word);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println(e);
		}
		
	}
	
}
