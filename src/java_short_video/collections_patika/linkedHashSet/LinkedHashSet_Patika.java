package java_short_video.collections_patika.linkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet_Patika {

    public static void main(String[] args) {

        LinkedHashSet<Integer> lSet = new LinkedHashSet<>();
        lSet.add(10);
        lSet.add(10);
        lSet.add(20);
        lSet.add(30);

        Iterator<Integer> itr = lSet.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next()); // 10 20 30
        }



    }


}
/*
LinkedHashSet

LinkedHashSet, tüm öğeler arasında çift bağlantılı bir Liste tutan sıralı bir HashSet sürümüdür.
Yineleme sırasının korunması gerektiğinde bu sınıf kullanılır.
Bir HashSet aracılığıyla yinelendiğinde, sıra öngörülemezken, LinkedHashSet öğeler arasında eklendikleri sırayla yineleme yapmamıza izin verir.
Bir yineleyici kullanarak LinkedHashSet üzerinden geçiş yaparken, öğeler eklendikleri sırayla döndürülür.
 */
