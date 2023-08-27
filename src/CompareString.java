public class CompareString {
    public static void main(String[] args) {
        String style="Bold";
        String style2="Bold";
        if(style == style2){
            System.out.println("Equal");
        }else {
            System.out.println("Not Equal");
        }

        if(style.equals(style2)){
            System.out.println("Content Equals");
        }else {
            System.out.println("Content Not Equals");
        }

        String newStyle=new String("Bold");
        String newStyle2 = new String("Bold");
        if(newStyle == newStyle2){
            System.out.println("New Equal");
        }else{
            System.out.println("New Not Equal");
        }
    }
}
