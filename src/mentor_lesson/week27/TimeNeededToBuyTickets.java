package mentor_lesson.week27;

import java.util.ArrayDeque;
import java.util.Queue;

public class TimeNeededToBuyTickets {

    public static int getTimeWithQueue(int[] tickets, int k){

        Queue<Integer> ticketQueue = new ArrayDeque<>();
        int length = tickets.length-1;

        while (tickets[k] != 0){
            for (int i = 0; i <= length ; i++) {
                if (tickets[i] == 0) continue;
                ticketQueue.add(tickets[i]--);
            }
        }

        return ticketQueue.size();
    }

    public static void main(String[] args) {

    }


}
