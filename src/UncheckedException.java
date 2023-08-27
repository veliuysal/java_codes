public class UncheckedException {
    public static void main(String[] args) {
        String name = null;

        //kotu yaklasim.
        try {
            if(name.equals("kadir")) {
                System.out.println("name : kadir");
            }
        }catch(NullPointerException e) {
            System.out.println("catch!");
        }
        // guzel bir yaklasim.
        if(name != null && name.equals("kadir")) {
            System.out.println("name : kadir");
        }
        //En iyi  yaklasim.
        if("kadir".equals(name)) {
            System.out.println("name : kadir");
        }
    }

    public static  int  metot() throws RuntimeException{
        throw  new RuntimeException("Denemee");
    }
}


