package kebab;

public enum Aliment {
    VIANDE ("Viande", false, false),
    POISSON ("Poisson", false, true),
    SALADE ("Salade", true,false),
    TOMATE ("Tomate", true, false),
    OIGNON ("Oignon", true, false),
    FROMAGE ("Fromage", true, false),
    ;

    private String name;
    private Boolean isVegetalAliment;
    private Boolean isFishAliment;

    Aliment(String name, Boolean isVegetalAliment, Boolean isFishAliment){
        this.name = name;
        this.isVegetalAliment = isVegetalAliment;
        this.isFishAliment = isFishAliment;
    }

    public Boolean isVegetalAliment(){
        return isVegetalAliment;
    }

    public Boolean isFishAliment(){
        return isFishAliment;
    }
}
