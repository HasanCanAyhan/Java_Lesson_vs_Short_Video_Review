package java_short_video.multiThread_and_Concurrency_patika.runnableInterface;

public class SimpleRunnable implements Runnable {

    public String name;
    public SimpleRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        // o an çalışan Thread'in ismini alıyoruz.

        String threadName = Thread.currentThread().getName();

        System.out.println("My summation " + threadName + " is started!");
        System.out.println(this.name);

        int total = 0;
        for(int i=0; i < 1000; i++) {
            total += i;
        }

        System.out.println("Total: " + total);

    }

    public static void main(String[] args) {

        // Runnable interface'den kalıtım almış olan "SimpleRunnable" sınıfından bir nesne oluşturuyoruz.

        SimpleRunnable simpleRunnable = new SimpleRunnable("simpleRunnable");

        // Runnable tipindeki nesneyi Thread kurucusuna gönderiyoruz.

        Thread simpleThread3 = new Thread(simpleRunnable);

        // start fonksiyonunu çağırdığımızda "SimpleRunnable" sınıfı içindeki "run" fonksiyonu işletilecektir.
        simpleThread3.start();


    }


}
/*
Runnable interface ile Thread Kullanımı

Thread’lere Runnable tipinde nesne vererek kod parçasını bir iş parçacığı olarak işletebiliriz.

Yukarıda “Runnable” interface’den kalıtım alan “SimpleRunnable” isminde bir sınıf tanımladık.
Bu sınıf içindeki “run” metodunu override ederek iş parçacığı içinde çalıştırılacak olan kodu yazıyoruz.

“Runnable” tipindeki sınıfımızdan bir nesne oluşturuyoruz. Ardından, Thread sınıfından bir nesne oluşturup kurucu metodun içine “Runnable” tipte oluşturduğumuz nesneyi gönderiyoruz.
Bununla birlikte 3 Thread (iş parçacığı) tanımlamış oluyoruz.

Not: Thread.currentThread() ile o anda aktif olarak çalışan iş parçacığının referansını alabiliyoruz. Burada aldığımız Thread nesnesi iş parçacığı içinde çalıştırılan kodu ifade eder.



 */