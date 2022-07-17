package java_short_video.multiThread_and_Concurrency_patika.threadDurdurmakveBekletmek;

public class Counter implements Runnable{

    private String name;
    private int id;

    private boolean isRun = true;

    public Counter(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(this.name + " started");
        int i = 0;
        while(isRun){

                if (this.id == 1){
                    try {
                        Thread.sleep(1000L * this.id);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }

                }

                System.out.println(this.name + " : "+i++);

        }

    }


    public void stop(){
        this.isRun = false;
    }


}
