public class ForLoopExample {
    public static void main(String[] args) {
        int[] arr= {12,5,7,8,9};
        int total=0;
        for(int index= 0; index<arr.length; index++){
            total += arr[index];
        }
        for(int element: arr){
            System.out.println(element);
        }
    }
}
