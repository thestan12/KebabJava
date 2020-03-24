package kebab;

import kebab.aliment.Aliment;
import kebab.aliment.TypeAliment;

import java.util.ArrayList;
import java.util.List;

public class Kebab {
    private List<TypeAliment> aliments;
    private String sauce;

    public Kebab(String sauce){
        aliments = new ArrayList<TypeAliment>();
        this.sauce = sauce;
    }

    public Kebab(List<TypeAliment> aliments){
        this.aliments = aliments;
    }

    public List<TypeAliment> getAliments(){
        return this.aliments;
    }

    public void addAliment(TypeAliment aliment){
        this.aliments.add(aliment);
    }

    public Boolean isVegetarian(){
        for(TypeAliment aliment:aliments){
            if(!aliment.isVegetalAliment()) return false;
        }
        return true;
    }

    public Boolean isFishKebab(){
        for(TypeAliment aliment:aliments){
            if(aliment.isFishAliment()) return true;
        }
        return false;
    }

    public void sansOignon(){
        for(TypeAliment aliment:aliments){
            if(aliment.equals(TypeAliment.OIGNON)){
                aliments.remove(aliment);
            }
        }
    }

    public void supplementFromage(){
        Boolean fromageAdd = false;

        for(TypeAliment aliment:aliments){
            if(aliment.equals(TypeAliment.FROMAGE)){
                aliments.add(TypeAliment.FROMAGE);
                fromageAdd = true;
            }
        }

        if(!fromageAdd){
            this.aliments.add(TypeAliment.FROMAGE);
        }
    }
}
