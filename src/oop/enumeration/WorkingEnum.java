package oop.enumeration;

enum CollarType {
    WHITE_COLLAR, BLUE_COLLAR, OTHER
}

enum Legislation {
    LAW_657, LAW_OTHER
}

enum PersonalType {

    WORKER(Legislation.LAW_OTHER, CollarType.BLUE_COLLAR, 3),
    OFFICER(Legislation.LAW_657, CollarType.WHITE_COLLAR, 4),
    CONTRACT_WORKER(Legislation.LAW_OTHER, CollarType.BLUE_COLLAR),
    CONTRACT_OFFICER(Legislation.LAW_657, CollarType.WHITE_COLLAR),
    OTHER(Legislation.LAW_OTHER, CollarType.OTHER);

    private Legislation legislation;
    private CollarType collarType;
    private Integer coefficient;

    PersonalType(Legislation legislation, CollarType collarType) {
        this.collarType = collarType;
        this.legislation = legislation;
    }

    PersonalType(Legislation legislation, CollarType collarType, int coefficient) {
        this.collarType = collarType;
        this.legislation = legislation;
        this.coefficient = coefficient;
    }

    public CollarType getCollarType() {
        return this.collarType;
    }

    public Legislation getLegislation() {
        return this.legislation;
    }

    public Integer getCoefficient() {
        return this.coefficient;
    }

    public String getPrintableValues() {
        return getCollarType() + " - " + getLegislation() + " - " + getCoefficient();
    }

}

public class WorkingEnum {
    //İşçi, Memur, Sözleşmeli Memur, Sözleşmeli İşçi, Diğer isminde Personel Tipimiz olsun.
    //Bu personeller içinde beyaz yaka, mavi yaka özellikleri barındırsın.
    //Tabi oldukları yasaları da içersin. Bu dediğim özelliklere sahip bir PersonalType Enum'ı yazalım.
    public static void main(String[] args) {
        System.out.println(PersonalType.OFFICER);
        System.out.println(PersonalType.OFFICER.getPrintableValues());

        System.out.println(PersonalType.CONTRACT_OFFICER);
        System.out.println(PersonalType.CONTRACT_OFFICER.getPrintableValues());
    }
}