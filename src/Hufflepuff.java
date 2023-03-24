public class Hufflepuff extends Hogwarts {
    private int industriousness;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int magicPower, int transgressionLength,
                      int industriousness, int loyalty, int honesty) {
        super(name, magicPower, transgressionLength);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public int ability() {
        return industriousness + loyalty + honesty;
    }

    public void compareHufflepuff(Hufflepuff Hufflepuff) {
        int ability1 = ability();
        int ability2 = Hufflepuff.ability();
        if (ability1 > ability2) {
            System.out.printf("Пуффендуец %s лучше, чем пуффендуец %s: %d VS %d%n",
                    getName(), Hufflepuff.getName(), ability1, ability2);
        } else if (ability2 > ability1) {
            System.out.printf("Пуффендуец %s лучше, чем пуффендуец %s: %d VS %d%n",
                    Hufflepuff.getName(),
                    getName(),
                    ability2,
                    ability1);
        } else {
            System.out.printf("Пуффендуец %s такой же, как пуффендуец  %s: %d VS %d%n",
                    Hufflepuff.getName(),
                    getName(),
                    ability1,
                    ability2);
        }
    }

    @Override
    public String toString() {
        return String.format("%s; трудолюбие: %d; верность: %d; честность: %d",
                super.toString(), industriousness, loyalty, honesty);
    }
}
