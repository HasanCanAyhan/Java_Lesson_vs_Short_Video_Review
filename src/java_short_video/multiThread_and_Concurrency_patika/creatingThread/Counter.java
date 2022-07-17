package java_short_video.multiThread_and_Concurrency_patika.creatingThread;

public class Counter extends Thread{

    //islem parcacigi

    public String name;

    public Counter(String name){
        this.name = name;
    }

    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {
            System.out.println(this.name + " : " + i );
        }

    }



}
