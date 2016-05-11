public class ActionB implements Runnable{
    Main.Counter counter;
    boolean toIncrease;

    public ActionB (Main.Counter counter, boolean toIncrease) {
        this.counter = counter;
        this.toIncrease = toIncrease;
    }

    public void run(){
        if (toIncrease) {
            increase();
        } else {
            decrease();
        }
    }

    public synchronized void increase() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }

    public synchronized void decrease() {
        for (int i = 0; i < 1000; i++) {
            counter.decrement();
        }
    }
}
