package mentor_lesson.week4;

public class Millisecond {


    public static void main(String[] args) {

        long milliseconds = 1203183068328l;

        int totalSeconds = (int)(milliseconds / 1000);

        int seconds = totalSeconds % 60;

        int totalMinutes =  totalSeconds / 60;

        int minutes = totalMinutes % 60;

        int totalHours = totalMinutes / 60;

        int hours = totalHours %  24;

        System.out.println("Milliseconds = " + hours + " Hours, " + minutes + " minutes, " + seconds + " seconds ");


    }

}
