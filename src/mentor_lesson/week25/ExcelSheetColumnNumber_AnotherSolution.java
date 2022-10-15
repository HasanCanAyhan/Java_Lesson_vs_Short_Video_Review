package mentor_lesson.week25;

public class ExcelSheetColumnNumber_AnotherSolution {

    public static void main(String[] args) {

        String s = "BCM";

        findExcelSheetColumnNum(s);
        findExcelSheetColumnNum2(s);
        System.out.println(withRecursion(s));


    }

    public static void findExcelSheetColumnNum(String str){

        //starting from right
        int result = 0;
        int multipler = 1;

        for (int i = str.length()-1; i >= 0 ; i--) {

            int thCh = str.charAt(i) - 'A' + 1;
            result += thCh * multipler;
            multipler = multipler * 26;

        }

        System.out.println(result);

    }

    public static void findExcelSheetColumnNum2(String str){

        //starting from left
        int result = 0;
        int p = str.length()-1;

        for (char c : str.toCharArray()) {

            result += (c - 'A' + 1) * Math.pow(26,p--);

        }

        System.out.println(result);

    }


    public static int withRecursion(String title) {

        if (title.length() == 0) return 0;
        return (title.charAt(title.length() - 1) - 'A' + 1)
                + 26 * withRecursion(title.substring(0, title.length() - 1));
    }



}
