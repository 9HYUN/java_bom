package ch20;

class MyThread2 extends Thread
{
	public void run()
	{
		int i;
		for (i= 1; i<=200; i++)
		{
			System.out.print(i + "\t");
		}
	}
}

public class ThreadTest2 {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread()+ "start");
		MyThread2 th1 = new MyThread2();
		MyThread2 th2 = new MyThread2();
		
		th1.start();
		th2.start();
		System.out.println(Thread.currentThread()+ "end");
	}

}
