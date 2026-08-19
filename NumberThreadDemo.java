/* Write a java program that creates three threads.
   The first thread prints even numbers (2,4,6,8,10) every 1 second,
   the second thread prints odd numbers (1,3,5,7,9) every 1.5 seconds,
   the third thread prints squares of numbers (1 to 5) every 2 seconds. */

class EvenNumbers extends Thread {
    public void run() {
        try {
            for (int i = 2; i <= 10; i += 2) {
                Thread.sleep(1000);
                System.out.println("Even: " + i);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class OddNumbers extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 9; i += 2) {
                Thread.sleep(1500);
                System.out.println("Odd: " + i);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class SquareNumbers extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                Thread.sleep(2000);
                System.out.println("Square: " + (i * i));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class NumberThreadDemo {
    public static void main(String args[]) {
        EvenNumbers t1 = new EvenNumbers();
        OddNumbers t2 = new OddNumbers();
        SquareNumbers t3 = new SquareNumbers();

        t1.start();
        t2.start();
        t3.start();
    }
}