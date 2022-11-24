package mentor_lesson.week27.phoneBookWithLinkedList;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class PhoneBookSinglyLinkedList {


    public PhoneBookNode head;
    public PhoneBookNode tail;
    public int size;


    public boolean isEmpty() {
        return (head == null);
    }

    public int size() {
        return size;
    }

    public void printPhoneBook() {

        PhoneBookNode curr = head;

        while (curr != null){
            System.out.println(curr.contact + "\n");
            curr = curr.next;
        }



    }

    public void add(Contact contact){

        PhoneBookNode newPhoneBookNode = new PhoneBookNode(contact);

        if (isEmpty()){
            head = tail = newPhoneBookNode;
        }else{
            tail.next = newPhoneBookNode;
            tail = newPhoneBookNode;
        }

        size++;
    }


    public PhoneBookNode findByFirstName(String firstName) {

        if (isEmpty()) return null;

        PhoneBookNode curr = head;

        while (curr != null){

            if (curr.contact.firstName.equals(firstName)){
                return curr;
            }
            curr = curr.next;
        }

        return null;
    }


    public List<PhoneBookNode> findAllByLastName(String lastName) {

        List<PhoneBookNode> phoneBookNodeList = new ArrayList<>();

        PhoneBookNode curr = head;

        while (curr != null){

            if (curr.contact.lastName.equals(lastName)){
                phoneBookNodeList.add(curr);
            }

            curr = curr.next;
        }

        return phoneBookNodeList;


    }

    public void deleteByFirstName(String firstName) {

        if (isEmpty()) throw new NoSuchElementException("No record is available in phone book");
        PhoneBookNode prev = head;
        PhoneBookNode curr = head;

        while (curr != null){

            if (curr.contact.firstName.equals(firstName)){

                if (curr == head && size > 0){
                    head = curr.next;
                } else if (curr == tail) {
                    tail = prev;
                    tail.next = null;
                }else {
                    prev.next = curr.next;
                }

                size--;
            }

            prev = curr;
            curr = curr.next;




        }

        throw new NoSuchElementException("The first name " + firstName + " could not match with any records" );


    }


    public void deleteAllMatchingLastName(String lastName){
        if (isEmpty()) throw new NoSuchElementException("No record is available in phone book");
        PhoneBookNode prev = head;
        PhoneBookNode curr = head;

        while (curr != null){

            if (curr.contact.lastName.equals(lastName)){

                if (curr == head && size > 0){
                    head = curr.next;
                } else if (curr == tail) {
                    tail = prev;
                    tail.next = null;
                }else {
                    prev.next = curr.next;
                    curr = prev;
                }

                size--;
                return;

            }

            prev = curr;
            curr = curr.next;




        }

        throw new NoSuchElementException("The last name " + lastName + " could not match with any records" );



    }


    public List<Contact> findAll(){

        List<Contact> phoneBookNodeList = new ArrayList<>();

        PhoneBookNode curr = head;
        while (curr != null){
            phoneBookNodeList.add(curr.contact);
            curr = curr.next;
        }

        return phoneBookNodeList;

    }


    public static void main(String[] args) {

        PhoneBookSinglyLinkedList list = new PhoneBookSinglyLinkedList();

        Contact contact1 = new Contact("c","f","c@gmail.com","1234");
        Contact contact2= new Contact("k","f","e@gmail.com","2222");
        Contact contact3= new Contact("b","q","m@gmail.com","3333");
        Contact contact4= new Contact("d","s","n@gmail.com","4444");

        PhoneBookNode one = new PhoneBookNode(contact1);
        PhoneBookNode two = new PhoneBookNode(contact2);
        PhoneBookNode three = new PhoneBookNode(contact3);
        PhoneBookNode four = new PhoneBookNode(contact4);

        list.head = one;
        one.next = two;
        two.next = three;
        three.next = four;
        list.tail = four;

        System.out.println( list.findByFirstName("c").contact );

        System.out.println("------------------------------------");

        System.out.println(list.size);

        System.out.println("------------------------------------");

        list.printPhoneBook();

        System.out.println("------------------------------------");

        list.add(new Contact("j","jojo","j@gmail.com","5555"));


        System.out.println("------------------------------------");

        System.out.println(list.findAll());

        System.out.println("------------------------------------");

        List<PhoneBookNode> l = list.findAllByLastName("f");
        for (PhoneBookNode phoneBookNode : l) {
            System.out.println(phoneBookNode.contact);
        }

        System.out.println("------------------------------------");

       // list.deleteByFirstName("k");

        //list.printPhoneBook();


        System.out.println("------------------------------------");

        list.deleteAllMatchingLastName("f");

        list.printPhoneBook();

    }

}