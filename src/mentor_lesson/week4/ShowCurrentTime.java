package mentor_lesson.week4;

public class ShowCurrentTime {

    public static void main(String[] args) {

        // Obtain the total milliseconds since midnight, Jan 1, 1970

        // You can invoke System.currentTimeMillis() to return the current time.
        long totalMilliseconds = System.currentTimeMillis(); // --->>> e.g., 1203183068328 milliseconds

        // Obtain the total seconds since midnight, Jan 1, 1970
        long totalSeconds = totalMilliseconds / 1000;

        // Compute the current second in the minute in the hour
        long currentSecond = totalSeconds % 60; // ---->>> 8

        // Obtain the total minutes
        long totalMinutes = totalSeconds / 60; // ---->>> 20053051

        // Compute the current minute in the hour
        long currentMinute = totalMinutes % 60; // ---->>> 31

        // Obtain the total hours
        long totalHours = totalMinutes / 60;// ---->>> 334217

        // Compute the current hour
        long currentHour = totalHours % 24; // ---->>> 17

        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");

    }

}
