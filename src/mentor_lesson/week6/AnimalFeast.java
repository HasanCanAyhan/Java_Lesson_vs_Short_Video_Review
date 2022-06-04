package mentor_lesson.week6;

public class AnimalFeast {

    public static void main(String[] args) {

        String animal = "hello";
        String dish = "hayırdıro";

        System.out.println(isEligible(animal, dish));

    }

    public static boolean isEligible(String animal, String dish){

        return (animal.charAt(0) +""+ animal.charAt(animal.length() - 1)).equals(dish.charAt(0)+""+dish.charAt(dish.length() - 1));

    }

    public static boolean dishAnimal(String animal, String dish) {
        return animal.charAt(0) == dish.charAt(0) && animal.charAt(animal.length() - 1) == dish.charAt(dish.length() - 1);
    }


}
