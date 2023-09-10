package oop.enumeration;

enum CollarType {
    WHITE_COLLAR, BLUE_COLLAR, OTHER
}

enum Legislation {
    LAW_657, LAW_OTHER
}

enum PersonalType {
    
    WORKER(Legislation.LAW_OTHER, CollarType.BLUE_COLLAR),
    OFFICER(Legislation.LAW_657, CollarType.WHITE_COLLAR),
    CONTRACT_WORKER(Legislation.LAW_OTHER, CollarType.BLUE_COLLAR),
    CONTRACT_OFFICER(Legislation.LAW_657, CollarType.WHITE_COLLAR),
    OTHER(Legislation.LAW_OTHER, CollarType.OTHER);

    private Legislation legislation;
    private CollarType collarType;

    PersonalType(Legislation legislation, CollarType collarType) {
        this.collarType = collarType;
        this.legislation = legislation;
    }

    public CollarType getCollarType() {
        return this.collarType;
    }

    public Legislation getLegislation() {
        return this.legislation;
    }

}

public class WorkingEnum {
    //İşçi, Memur, Sözleşmeli Memur, Sözleşmeli İşçi, Diğer isminde Personel Tipimiz olsun.
    //Bu personeller içinde beyaz yaka, mavi yaka özellikleri barındırsın.
    //Tabi oldukları yasaları da içersin. Bu dediğim özelliklere sahip bir PersonalType Enum'ı yazalım.
}