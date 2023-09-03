package oop;

public class AttributeExample {
    int x;
    int y = 5;

    public static void main(String[] args) {
        AttributeExample obj=new AttributeExample();
        System.out.println(obj.x);
        obj.x = 40;
        System.out.println(obj.x);

        System.out.println(obj.y);
        obj.y = 10;
        System.out.println(obj.y);
    }
}
