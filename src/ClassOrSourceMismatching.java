public class ClassOrSourceMismatching {
    public static void main(String[] args) {
        int example = 10;
        int example2 = 30;
        int x = 2;
        float X=(float) 27d * 2;
        String number= "number: "+x+x;
        System.out.println("Improper Case: " + example);
        int result = islemYap(x);
        System.out.println("" + 2 + 3);
        System.out.println("deneme: "+ number);
        for(int index=0;index<1000;index++){
            if(index == args.length)
            return;
        }
    }

    public static int islemYap(int x){
        int result=x*x;

        result = result + 2;
        return result;
    }

    }

