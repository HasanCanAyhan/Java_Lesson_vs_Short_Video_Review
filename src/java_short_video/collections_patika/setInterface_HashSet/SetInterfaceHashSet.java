package java_short_video.collections_patika.setInterface_HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class SetInterfaceHashSet {

    public static void main(String[] args) {

        // a ===> 171234554
        // b ===> 123443534
        //f(x) = x*3 * xmod7 * sqrt(x)
        //f(5) = 122234
        //f(6) = 223456

        //h[171234554] = a  ,  f(a) => 171234554


        HashSet<Integer> hSet = new HashSet<>();
        hSet.add(10);
        hSet.add(20);
        hSet.add(10);
        hSet.add(30);
        hSet.add(null);


        /*
        System.out.println(hSet.size());//4
        System.out.println(hSet.isEmpty());//false
        System.out.println(hSet.contains(20));// true
        System.out.println(hSet.contains(1));// false
         */

        //hSet.remove(10);
        //hSet.clear();

        /* for-each
        for (Integer element : hSet){
            System.out.println(element);
        }
         */

        //
        Iterator<Integer> itr = hSet.iterator();
        while (itr.hasNext()){ // checks if next one is there or not
            System.out.println(itr.next());
        }



    }

}
/*
Set interface (Arayüzü)


Collection interface’den kalıtım almıştır.
Aynı elemanların veri kümesi içinde tekrar bulunmasına izin vermez.
HashSet sınıfı en yaygın olan alt sınıfıdır.
Eleman tekrarının olmamasını sağlayabilmek için veri kümesi içindeki nesnelerin “equals” ve “hashCode” fonksiyonlarının tanımlı olması gerekir.



Set interface’in alt sınıfları:



HashSet


LinkedHashSet


TreeSet


HashSet Sınıfı


Liste tipinde veri tutmayı sağlar. Veri kümesindeki elemanlara ekleme, silme ve erişim imkanı tanır. Veri kümesinde mükerrer değer tutmaz.
Mükerrer değer tutmamayı nesnelerdeki hashCode fonksiyonunu kullanarak sağlar. “null” değer eklemesi yapılabilir.

“equals” ve “hasCode” fonksiyonları doldurulmuş bir Book sınıfı tasarladık. Book nesnelerinden oluşan bir veri kümesi oluşturduk.
 */