import java.util.Scanner;
import java.utils.*;

class Childthread implements Runnable{
    thread t;

    Childthread(){
        t = new thread(this);
        System.out.println("thread is in start ");
        t.start();
    }

    public void run (){
        System.System.out.println("Thread is in runnable state ");
        Scanner s = new Scanner(System.in);
        System.out.println("Thread is in blocked state ");
        System.out.println("Enter the string ");
        String str = s.next();

        for(int i = 1; i<= 3; i++){
            try {
                System.out.println("Thread is suspended ");
                t.sleep(3000);
                System.out.println("Thread is running ");
            } catch (InterruptedException e) {
                // handle exception
                System.out.println("Thread interupted ");
            }
            System.out.println("Thread terminated");
            t.stop();
        }
    }
}

class Driver{
    public static void main(String args){
        new Childthread();
    }
}

