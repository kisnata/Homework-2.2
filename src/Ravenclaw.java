public class Ravenclaw extends Hogwarts {
    private int mind;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String name, int magicPower, int transgressionLength,
                     int mind, int wisdom, int wit, int creativity) {
        super(name, magicPower, transgressionLength);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    public int ability() {
        return mind + wisdom + wit + creativity;
    }

    public void compareRavenclaw(Ravenclaw Ravenclaw) {
        int ability1 = ability();
        int ability2 = Ravenclaw.ability();
        if (ability1 > ability2) {
            System.out.printf("Когтевранец %s лучше, чем когтевранец %s: %d VS %d%n",
                    getName(), Ravenclaw.getName(), ability1, ability2);
        } else if (ability2 > ability1) {
            System.out.printf("Когтевранец %s лучше, чем когтевранец %s: %d VS %d%n",
                    Ravenclaw.getName(),
                    getName(),
                    ability2,
                    ability1);
        } else {
            System.out.printf("Когтевранец %s такой же, как когтевранец %s: %d VS %d%n",
                    Ravenclaw.getName(),
                    getName(),
                    ability1,
                    ability2);
        }
    }

    @Override
    public String toString() {
        return String.format("%s; ум: %d; мудрость: %d; остроумие: %d; творчество: %d",
                super.toString(), mind, wisdom, wit, creativity);
    }
}