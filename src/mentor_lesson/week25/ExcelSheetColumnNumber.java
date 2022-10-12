package mentor_lesson.week25;

public class ExcelSheetColumnNumber {

    public static void main(String[] args) {

        String str = "BA";
        System.out.println(excelColumnNum(str));
    }
    public static int excelColumnNum(String str){


        /*
        int result = 0;

        for (char eachCh : str.toCharArray()) {
            // 'A' : 65,  A:1;
            // CDA : 2133,
            // CA : 79
            //  A = 1 (26 * 0 +1)
            //  C = 3 * 26 = 78

            result *= 26;
            result += eachCh - 'A' +1;

        }

         */


        int result = 0;

        for (char each : str.toCharArray()) {

            int theCh =   each - 'A' + 1;

            result = result * 26 + theCh;


        }









        return result;


    }


}
