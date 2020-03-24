import kebab.Kebab;
import kebab.Aliment;
import kebab.Sauce;

public class main {
    public static void main(String[] args) {
        System.out.println("Hello World !!");

        Kebab unVraiKebab = new Kebab(Sauce.BLANCHE);
        Kebab unVraiKebabAuPoisson = new Kebab(Sauce.SAMOURAI);
        Kebab unVraiKebabDePedale = new Kebab(Sauce.ALGERIENNE);

        unVraiKebabDePedale.addAliment(Aliment.SALADE);
        unVraiKebabDePedale.addAliment(Aliment.TOMATE);
        unVraiKebabDePedale.addAliment(Aliment.OIGNON);

        unVraiKebabAuPoisson.addAliment(Aliment.SALADE);
        unVraiKebabAuPoisson.addAliment(Aliment.TOMATE);
        unVraiKebabAuPoisson.addAliment(Aliment.OIGNON);
        unVraiKebabAuPoisson.addAliment(Aliment.POISSON);

        unVraiKebab.addAliment(Aliment.SALADE);
        unVraiKebab.addAliment(Aliment.TOMATE);
        unVraiKebab.addAliment(Aliment.OIGNON);
        unVraiKebab.addAliment(Aliment.VIANDE);

        System.out.println("Kebab vege : " + unVraiKebab.isVegetarian());
        System.out.println("Kebab vege : " + unVraiKebabDePedale.isVegetarian());
        System.out.println("Kebab au poisson : " + unVraiKebabAuPoisson.isFishKebab());

    }
}
