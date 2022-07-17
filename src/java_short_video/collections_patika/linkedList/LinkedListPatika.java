package java_short_video.collections_patika.linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListPatika {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("Mustafa");
        list.add("Can");
        list.add("Mustafa");
        list.add("Java");
        list.add("102");


        System.out.println(list.get(2));
        System.out.println("-----------------------");

        list.addFirst("Ayhan");
        list.addLast("Aras");

        System.out.println("list = " + list);

        System.out.println("-------------------------");

        Iterator<String> itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("--------------------------------------");

        for (String each : list) {
            System.out.println(each);
        }






    }
}
/*
Çift yönlü bağlı liste algoritmasının Java implementasyonudur.
Her eleman önceki ve sonraki elemanını işaret edecek şekilde iki yönlü bir ilişki kurulmuştur.
Listenin ben başına hem sonuna eleman eklenip çıkarılabilir, bu işlemler için metotlar mevcuttur.
LinkedList’te eleman silme veya araya eleman ekleme durumlarında kaydırma işlemi yapılmaz.

Bu listeye gönderilen veriler, arka planda özel bir obje ile sarılır (wrap) edilir. Bu objeler birbirini gösterecek şekilde referanslar objelere konur, böylece birbirlerine bağlanırlar.

Kullanılacak veri grubunu bir listeye koymamız ve bu gruba veri ekleme işlemi sürekli yapılacaksa, LinkedList kullanılması önerilir.

LinkedList sınıfı, ArrayList gibi thread-safe değildir. Bu List türünde de veri bütünlüğünü sorunu vardır.

LinkedList, hem List interface'inden hem Queue (Kuyruk) interface'inden miras alan bir sınıftır.

List<String> nameList = new LinkedList<String>();
nameList.add("Hale");
nameList.add("Jale");
nameList.add("Lale");
nameList.add("Ahmet");
nameList.add("Mehmet");
nameList.add("Kemal");

// get ile listeden eleman okuması yapılır. Okunan eleman listeden çıkartılmaz.
System.out.println("Element of 2 index: " + nameList.get(2));

// Liste başına eleman ekler
nameList.addFirst("Naz");

// Liste sonuna eleman ekler
nameList.addLast("Ümit");



ArrayList'te implemente edilen metotların çoğu LinkedList için de geçerlidir.

 */
