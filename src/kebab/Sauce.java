package kebab;

public enum Sauce {
    SAMOURAI("Samourai"),
    BLANCHE("Blanche"),
    ALGERIENNE("Algerienne")
    ;

    private String name;

    Sauce(String name){
        this.name = name;
    }
}
