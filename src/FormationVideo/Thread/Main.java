package FormationVideo.Thread;

import java.lang.Thread;

public class Main extends Thread
{
    public void run(){
        // System.out.println("je suis le traitement...");
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){}
        }
    }
    public static void main(String[] args) throws InterruptedException{

        Main task1 = new Main();
        Main task2 = new Main();

        task1.start();
        task2.start();

        task1.join();
        task2.join();

        System.out.println("tous les taches sont fini...");
    }
}
