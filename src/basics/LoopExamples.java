package basics;

public class LoopExamples {
    public static void main(String[] args) {
        String ifade= "12345";
        int[] arr = {1,2,3,4,5};
        int[] arr2=new int[5];
        int arr3[]=new int[7];
                /*
        for(int index=ifade.length()-1 ; index>=0 ; index--){
            System.out.print(ifade.charAt(index));
        }*/
        for(int index=arr.length -1;index>=0 ;index--){
            System.out.print(arr[index]);
        }
    }
}
