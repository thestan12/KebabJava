package kebab.aliment;

public class Aliment {
    private String name;
    private TypeAliment type;

    public Aliment (String name, TypeAliment type){
        this.name = name;
        this.type = type;
    }

    public Boolean getIsVegetal(){
        return this.type.isVegetalAliment();
    }

    public Boolean getIsFishAliment(){
        return this.type.isFishAliment();
    }

    public TypeAliment getType(){
        return this.type;
    }
}


