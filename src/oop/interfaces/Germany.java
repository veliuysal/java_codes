package oop.interfaces;

public class Germany implements Language, EconomyParams {

    @Override
    public void getType() {
        System.out.println("German Language's Type is started.");
    }

    @Override
    public void getVersion() {
        System.out.println("German Language's Version is started");
    }

    public static void main(String[] args) {
        Language language=new Germany();
        language.getType();
        language.getVersion();

        EconomyParams economyParams = new Germany();
        economyParams.getCurrency();
        economyParams.getNote();

        Germany germany = new Germany();
    }

    @Override
    public void getNote() {
        System.out.println("German Language's Note is started");
    }

    @Override
    public void getCurrency() {
        System.out.println("German Language's Currency is started");
    }
}
