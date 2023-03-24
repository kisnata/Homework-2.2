import java.util.Random;
import java.util.function.LongUnaryOperator;

public class Main {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {

        Gryffindor Harry = generateGryffindor("Гарри Поттер");
        Gryffindor Ron = generateGryffindor("Рон Уизли");
        Ravenclaw Padma = generateRavenclaw("Падма Патил");
        Slytherin Draco = generateSlytherin("Драко Малфой");
        Hufflepuff Cedric = generateHufflepuff("Седрик Диггори");

        Harry.print();
        Ron.print();
        Padma.print();
        Draco.print();
        Cedric.print();

        Harry.compareHogwarts(Draco);
        Harry.compareGryffindor(Ron);
    }

    private static Gryffindor generateGryffindor(String name) {
        return new Gryffindor(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100));

    }

    private static Ravenclaw generateRavenclaw(String name) {
        return new Ravenclaw(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );

    }


    private static Hufflepuff generateHufflepuff(String name) {
        return new Hufflepuff(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }

    private static Slytherin generateSlytherin(String name) {
        return new Slytherin(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }
}


