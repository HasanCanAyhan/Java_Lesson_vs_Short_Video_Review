package mentor_lesson.week7;

public class NestedForLoops9 {
    
    public static void main(String[] args) {

        for (int i = 1; i <= 5  ; i++) {

            for (int j = 1; j < i ; j++) {
                System.out.print("* ");
            }

            for (int k = 4 +i; k <= 9 ; k++) {
                System.out.print(k+" ");
            }

            System.out.println();
        }
        
        
    }
    
    
}
/*
5 6 7 8 9
* 6 7 8 9
* * 7 8 9
* * * 8 9
* * * * 9
 */