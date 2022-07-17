package java_short_video.collections_patika.priorityQueue;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueuePatika {

    public static void main(String[] args) {

        PriorityQueue<String> q = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });


        q.add("Mustafa");
        q.add("Can");
        q.add("Ahmet");
        q.add("Damla");

        System.out.println(q);// [Ahmet, Damla, Can, Mustafa]

        System.out.println(q.poll());// Ahmet
        //poll(): Kuyruğun başındaki elemanı kuyruktan çıkartır.

        System.out.println(q);


        Iterator<String> itr = q.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }


    }

}
/*
Priority


PriorityQueue, terim anlamıyla gündelik yaşamda sık karşılaştığımız bir olguyu belirler.
Bazı durumlarda bir işi öteki işlerin hepsinden önce yapmak zorunda kalabiliriz.
Örneğin, Bir banka veznesinde kuyruğa girenler arasında öncelik sırası önde olanındır.
Ancak, bir kavşakta geçiş önceliği cankurtaranındır.
Bir hava meydanına iniş sırası bekleyen uçaklar arasında, öncelik sırası acil iniş isteyen uçağındır.
Bir hastanede muayene önceliği durumu en acil olan hastanındır.



Görüldüğü gibi, bir koleksiyon içinde öncelik sırasını farklı amaçlarla belirleyebiliriz.
En basiti, ilk gelen ilk çıkar dediğimiz FIFO yapısıdır.
Ama bu yapı karşılaşılacak bütün olasılıklara çözüm getiremez.
Dolayısıyla, koleksiyonun öğelerini istenen önceliğe göre sıralayan bir yapıya gereksinim vardır.

Biraz genellemeyle, PriorityQueue yapısına da kuyruk diyeceğiz;
ama burada yüklenen anlamı FIFO yapısından farklı olabilir. Sıralama bazen öğelerin doğal sırasıdır, bazen ilgili Comparator tarafından belirlenen sıradır.

Bir PriorityQueue kuyruğunda öğeler ya doğal sıralarındadır
ya da kuruluş anında kullanılan Comparator’un yaptığı sıradadırlar.
Tabii, böyle oluşu, hangi kurucunun kullanıldığına bağlıdır.
Bir PriorityQueue kuyruğuna null öğe konamaz.
Doğal sırasında olan bir PriorityQueue kuyruğuna, kendi öğeleriyle bağdaşmayan (mukayese edilemeyen) bir nesne konulamaz.
Böyle yapılırsa derleyiciden ClassCastException hatası alınır.


PriorityQueue kuyruğunun başı (head), kullanılan sıralamaya göre en küçük olan öğedir.
Eğer en küçük olan birden çok öğe varsa, kuyruğun başı onlardan birisidir.
Poll(), remove(), peek() ve element() metotları kuyruğun başına erişir.



PriorityQueue kuyruğunun uzunluğu için bir sınır yoktur;
ama yeni öğeler eklendikçe kendi kendine uzunluğunu değiştirebilir;
yani kuyruğun sığası otomatik olarak artar.


 */