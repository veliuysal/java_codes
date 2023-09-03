package oop.encapsulation;

public class CallPerson {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Veli");
        person.setSurname("UYSAL");
        person.setAge(36);

        System.out.println(person.getName() + " "+person.getSurname()+" - "+ person.getAge());
    }
}
