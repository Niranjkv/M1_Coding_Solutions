public class SharedCounter {
private int count = 0;
public synchronized void increment() {
    count++;
}
public int getCount() {
return count;
}
public static void main(String[] args) throws InterruptedException {
SharedCounter counter = new SharedCounter();
Runnable task = () -> {
for (int i = 0;i < 10000; i++) {
counter.increment();
}
};
Thread thread1 = new Thread(task);
Thread thread2 = new Thread(task);
thread1.start();
thread2.start();
thread1.join(); // Wait for thread1 to finish
thread2.join(); // Wait for thread2 to finish
System.out.println("Final count: "+ counter.getCount());
}
}