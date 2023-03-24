public class Gryffindor extends Hogwarts {

    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, int magicPower, int transgressionLength,
                      int honor, int bravery, int nobility) {
        super(name, magicPower, transgressionLength);
        this.honor = honor;
        this.bravery = bravery;
        this.nobility = nobility;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public int ability() {
        return nobility + honor + bravery;
    }

    public void compareGryffindor(Gryffindor Griffindor) {
        int ability1 = ability();
        int ability2 = Griffindor.ability();
        if (ability1 > ability2) {
            System.out.printf("Гриффиндорец %s лучше, чем гриффиндорец %s: %d VS %d%n",
                    getName(), Griffindor.getName(), ability1, ability2);
        } else if (ability2 > ability1) {
            System.out.printf("Гриффиндорец %s лучше, чем гриффиндорец %s: %d VS %d%n",
                    Griffindor.getName(),
                    getName(),
                    ability2,
                    ability1);
        } else {
            System.out.printf("Гриффиндорец %s такой же, как гриффиндорец %s: %d VS %d%n",
                    Griffindor.getName(),
                    getName(),
                    ability1,
                    ability2);

        }
    }

@Override
public String toString() {
    return String.format("%s; благородство: %d; честь: %d; храбрость: %d", super.toString(), nobility, honor, bravery);
}
}
