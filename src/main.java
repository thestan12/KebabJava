import kebab.aliment.Aliment;
import kebab.Kebab;
import kebab.aliment.TypeAliment;

public class main {
    public static void main(String[] args) {
        System.out.println("Hello World !!");

        Kebab unVraiKebab = new Kebab("Blanche");
        Kebab unVraiKebabAuPoisson = new Kebab("Samourai");
        Kebab unVraiKebabDePedale = new Kebab("Algérienne");

        unVraiKebabDePedale.addAliment(TypeAliment.SALADE);
        unVraiKebabDePedale.addAliment(TypeAliment.TOMATE);
        unVraiKebabDePedale.addAliment(TypeAliment.OIGNON);

        unVraiKebabAuPoisson.addAliment(TypeAliment.SALADE);
        unVraiKebabAuPoisson.addAliment(TypeAliment.TOMATE);
        unVraiKebabAuPoisson.addAliment(TypeAliment.OIGNON);
        unVraiKebabAuPoisson.addAliment(TypeAliment.POISSON);

        unVraiKebab.addAliment(TypeAliment.SALADE);
        unVraiKebab.addAliment(TypeAliment.TOMATE);
        unVraiKebab.addAliment(TypeAliment.OIGNON);
        unVraiKebab.addAliment(TypeAliment.VIANDE);

        System.out.println("Kebab vege : " + unVraiKebab.isVegetarian());
        System.out.println("Kebab vege : " + unVraiKebabDePedale.isVegetarian());
        System.out.println("Kebab au poisson : " + unVraiKebabAuPoisson.isFishKebab());

    }
}
