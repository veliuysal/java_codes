public class IfElseifToSwitch {
    public static void main(String[] args) {
        int i=20;
       /* if(i==10)
            System.out.println("10");
        else if(i==15)
            System.out.println("15");
        else if(i==20)
            System.out.println("20");
        else
            System.out.println("Nothing");

        */

        switch(i){
            case 10:
                System.out.println("10");
                break;
            case 15:
                System.out.println("15");
                break;
            case 20:
                System.out.println("20");
                break;
            default:
                System.out.println("Nothing");
        }
    }
}
