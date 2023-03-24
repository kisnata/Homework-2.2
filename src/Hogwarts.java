public abstract class Hogwarts {
    private int magicPower;
    private int transgressionLength;
    private String name;

    public Hogwarts(String name, int magicPower, int transgressionLength) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionLength = transgressionLength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionLength() {
        return transgressionLength;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public void setTransgressionLength(int transgressionLength) {
        this.transgressionLength = transgressionLength;
    }

    private int ability() {
        return magicPower + transgressionLength;
    }

    public void compareHogwarts(Hogwarts Hogwarts) {
        int ability1 = ability();
        int ability2 = Hogwarts.ability();
        if (ability1 > ability2) {
            System.out.printf("Студент %s лучше, чем студент %s: %d VS %d%n",
                    getName(), Hogwarts.getName(), ability1, ability2);
        } else if (ability2 > ability1) {
            System.out.printf("Студент %s лучше, чем студент %s: %d VS %d%n",
                    Hogwarts.getName(),
                    getName(),
                    ability2,
                    ability1);
        } else {
            System.out.printf("Студент %s такой же, как студент %s: %d VS %d%n",
                    Hogwarts.getName(),
                    getName(),
                    ability1,
                    ability2);

        }
    }

public void print(){
    System.out.println(this);
}

    @Override
    public String toString() {
        return String.format("Студент %s; сила магии: %d; сила трансгрессии: %d",
                name, magicPower, transgressionLength);
    }
}
