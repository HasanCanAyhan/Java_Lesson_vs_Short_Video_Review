package java_short_video.multiThread_and_Concurrency_patika.runnableInterface;

public class Counter implements Runnable{

    private String name;

    public Counter(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void run() {

        System.out.println(getName() + " started");

        for (int i = 0; i <= 100 ; i++) {
            System.out.println(getName() + " : " + i);
        }

    }


}
