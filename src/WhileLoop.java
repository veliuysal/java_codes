public class WhileLoop {
    public static void main(String[] args) {
       /* int start=0, finish=5;
        while (finish>=0){
            System.out.println("start: "+start);
            System.out.println("finish: "+finish);
            start++;
            finish--;
        }*/
        int start = 100;
       /* while (start >0){
            System.out.println("Değerimiz: "+start);
            if(start % 7 == 0){
                System.out.println("7'e bölünen sayıyı buldum. sayımız: "+start);
                break;
            }
            start--;
        }
        start=100;*/
        /*System.out.println("Başlangıç  Değeri: "+start);
     do {
         start--;
         System.out.println("Değerimiz: "+start);
     }while (start>0 && start % 7 != 0);

*/

        for (int i=100;i>0;i--){
            if(i % 7 == 0){
                System.out.println("7'e bölünen ilk sayı: "+i);
                break;
            }else {
                System.out.println("Değerimiz: "+i);
            }
        }
        int index=100;
        for(;index>0;index--){

        }
        for(;index>0; index -=5){

        }
        for(;index % 7 !=0;){
            index--;
        }
        for(;index>0 && index % 7 !=0;){

        }
    }
}
