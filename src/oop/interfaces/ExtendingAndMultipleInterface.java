package oop.interfaces;

interface Language1 {
    public void getName();

    public void setName(String name);
}

interface HumanLanguage extends Language1 {

    public void getCountry();

    public void setCountry(String country);
}

interface ProgrammingLanguage extends Language1 {
    public void getUsingArea();

    public void setUsingArea(String usingArea);
}

class Java implements ProgrammingLanguage {

    @Override
    public void getName() {
        System.out.println("Programming Language is Java");
    }

    @Override
    public void setName(String name) {
        System.out.println("Programming Language is set " + name + " by user");
    }

    @Override
    public void getUsingArea() {
        System.out.println("Java is using 3 billion device");
    }

    @Override
    public void setUsingArea(String usingArea) {
        System.out.println("Java is using in" + usingArea);
    }
}

class Turkish implements HumanLanguage {

    @Override
    public void getName() {
        System.out.println("Human Language is Turkish");
    }

    @Override
    public void setName(String name) {
        System.out.println("Human Language is set " + name + " by user");
    }

    @Override
    public void getCountry() {
        System.out.println("Turkish speaks in Turkiye");
    }

    @Override
    public void setCountry(String country) {
        System.out.println("Turkish speaks in "+country);
    }
}

public class ExtendingAndMultipleInterface {

    //Elimizde bir interface olsun. Bu interface Language ismine sahiptir.
    //Bu interface ile biz kendi programlama dili ve insan dili isminde iki ayrı interface'in atası olsun.
    //Bu yeni oluşan dillerde ise yeni özelliklere sahip olsun. Language interface'i name field barındırsın ve get/set name methodları bulunsun.
    //Yeni oluşacak dil interface'lerinde ise bu durumlara ilave olarak kullanım yerleri ve ülke methodları barındırsın.
    //Daha sonra ise birer class ile bu yeni oluşan 2 dil interface'ini implemente edelim.

    public static void main(String[] args) {
        //HumanLanguage & Language
        Turkish turkish =new Turkish();
        turkish.getCountry();
        turkish.getName();
        turkish.setCountry("Azerbaycan");
        turkish.setName("İstanbul Türkçesi");

        //HumanLanguage
        HumanLanguage humanLanguage = new Turkish();
        humanLanguage.getCountry();

        //ProgrammingLanguage & Language
        Java java=new Java();
        java.getUsingArea();
        java.getName();
        java.setUsingArea("Web Programlama");
        java.setName("Java 1.8");

        //ProgrammingLanguage
        ProgrammingLanguage programmingLanguage= new Java();
        programmingLanguage.getUsingArea();
    }

}
