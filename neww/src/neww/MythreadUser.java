package neww;

public class MythreadUser {
	public static void main(String[] args) {
		MyThread t1=new MyThread();
		t1.start();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=0;i<=5;i++) {
			System.out.println("mythread 2.0");
		}
	}

}
