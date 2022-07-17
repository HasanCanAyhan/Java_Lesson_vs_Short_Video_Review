package java_short_video.collections_patika.treeSet;

import java.util.TreeSet;

public class TreeSetPatika {

    public static void main(String[] args) {
        // According to note

        OrderNoteComparator order = new OrderNoteComparator();
        TreeSet<Student> students =new TreeSet<>(order);
        //Student s1 = new Student("Mustafa",20);
        //studentss.add(s1);or:
        students.add(new Student("Mustafa",20));
        students.add(new Student("Ahmet",100));
        students.add(new Student("Behlül",45));
        students.add(new Student("Damla",60));
        students.add(new Student("Damla",60));
        students.add(new Student("Cemre",60));


        for (Student stu : students){
            System.out.println(stu.getName());
        }

        System.out.println("---------------------------------------------");

        // According to name

        OrderNameComparator order1 = new OrderNameComparator();
        TreeSet<Student> studentss  =new TreeSet<>(order1);

        studentss.add(new Student("Mustafa",20));
        studentss.add(new Student("Ahmet",100));
        studentss.add(new Student("Behlül",45));
        studentss.add(new Student("Damla",60));
        studentss.add(new Student("Damla",60));
        studentss.add(new Student("Cemre",60));

        for (Student student : studentss) {

            System.out.println(student.getName());
        }


    }

}
/*
TreeSet Sınıfı

Veri kümesine konulan elemanların verdiğiniz kurala göre sıralanmasını sağlar.
Bunun sağlanabilmesi için kullanacağınız sınıfın “sıralanabilir” olması gerekmektedir.
Bir sınıfın sıralanabilir olması için “Comparable” interface’den kalıtım alıp “compareTo” metodunu doldurması gerekmektedir.
Nesne üzerindeki “compareTo” fonksiyonu küçükten büyüğe doğal sıralama imkanı sağlar.
 */