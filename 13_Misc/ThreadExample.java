
class MyThread extends Thread {
	private Foo foo;
	public String name;
	public String firstMethod;
	public MyThread(Foo f, String nm, String fM) {
		foo = f;
		name = nm;
		firstMethod = fM;
	} 
	 
	public void run() { 
		if (firstMethod.equals("A")) {
			foo.methodA(name);
		} else { 
			foo.methodB(name);
		} 
	} 
} 
class Foo { 
	private String name;
	 
	public Foo(String nm) {
		name = nm;
	} 
	 
	public String getName() {
		return name;
	} 
	 
	public void pause() { 
		try { 
			Thread.sleep(1000 * 3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
	}	 
	 
	public synchronized void methodA(String threadName) {
		System.out.println("thread " + threadName + " starting: " + name + ".methodA()");
		pause(); 
		System.out.println("thread " + threadName + " ending: " + name + ".methodA()");
	} 
	 
	public void methodB(String threadName) {
		System.out.println("thread " + threadName + " starting: " + name + ".methodB()");
		pause(); 
		System.out.println("thread " + threadName + " ending: " + name + ".methodB()");
	}	 
} 
public class ThreadExample {

	
	public static void main(String[] args) {
		/* Part 1 Demo -- same instance */ 
		System.out.println("Part 1 Demo with same instance.");
		Foo fooA = new Foo("ObjectOne");
		MyThread thread1a = new MyThread(fooA, "Dog", "A");
		MyThread thread2a = new MyThread(fooA, "Cat", "A");
		thread1a.start();
		thread2a.start();
		while (thread1a.isAlive() || thread2a.isAlive()) { };
		System.out.println("\n\n");
		 
		/* Part 1 Demo -- difference instances */ 
		System.out.println("Part 1 Demo with different instances.");
		Foo fooB1 = new Foo("ObjectOne");
		Foo fooB2 = new Foo("ObjectTwo");
		MyThread thread1b = new MyThread(fooB1, "Dog", "A");
		MyThread thread2b = new MyThread(fooB2, "Cat", "A");
		thread1b.start();
		thread2b.start();
		while (thread1b.isAlive() || thread2b.isAlive()) { };
		System.out.println("\n\n");
		 
		/* Part 2 Demo */ 
		System.out.println("Part 2 Demo.");
		Foo fooC = new Foo("ObjectOne");
		MyThread thread1c = new MyThread(fooC, "Dog", "A");
		MyThread thread2c = new MyThread(fooC, "Cat", "B");
		thread1c.start();
		thread2c.start();
	}
	
}
