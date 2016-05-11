public class Main {
    static class Counter {
        private int count;

        public Counter() {
            count = 0;
        }

        public void increment() {
            count++;
        }

        public void decrement() {
            count--;
        }

        public int getCount() {
            return count;
        }
    }

    public static void main(String[] args) {
        Integer t = 0;
        Counter c = new Counter();
        Thread b1 = new Thread(new ActionB(c, true));
        Thread b2 = new Thread(new ActionB(c, false));
        b1.start();
        b2.start();
        System.out.println(String.format("Counter is %d", c.getCount()));
    }
}
