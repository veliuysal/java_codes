public class LogicalErrors {
    public static void main(String[] args) {
        int result1= 5 + 4 * 3 / 2;
        int result2 = (5 + 4) * 3 /2 ;
        int result3 = (5 + 4) * (3 / 2);
        int result4 = (5 + (4 * 3)) / 2 ;
        System.out.println("Result1: "+result1);
        System.out.println("Result2: "+result2);
        System.out.println("Result3: "+result3);
        System.out.println("Result4: "+result4);
    }
}
