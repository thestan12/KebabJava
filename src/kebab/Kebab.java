package kebab;

import java.util.ArrayList;
import java.util.List;

public class Kebab {
    private List<Aliment> aliments;
    private Sauce sauce;

    public Kebab(Sauce sauce){
        aliments = new ArrayList<Aliment>();
        this.sauce = sauce;
    }

    public Kebab(List<Aliment> aliments){
        this.aliments = aliments;
    }

    public List<Aliment> getAliments(){
        return this.aliments;
    }

    public void addAliment(Aliment aliment){
        this.aliments.add(aliment);
    }

    public Boolean isVegetarian(){
        for(Aliment aliment:aliments){
            if(!aliment.isVegetalAliment()) return false;
        }
        return true;
    }

    public Boolean isFishKebab(){
        for(Aliment aliment:aliments){
            if(aliment.isFishAliment()) return true;
        }
        return false;
    }

    public void sansOignon(){
        for(Aliment aliment:aliments){
            if(aliment.equals(Aliment.OIGNON)){
                aliments.remove(aliment);
            }
        }
    }

    public void supplementFromage(){
        Boolean fromageAdd = false;

        for(Aliment aliment:aliments){
            if(aliment.equals(Aliment.FROMAGE)){
                aliments.add(Aliment.FROMAGE);
                fromageAdd = true;
            }
        }

        if(!fromageAdd){
            this.aliments.add(Aliment.FROMAGE);
        }
    }
}
