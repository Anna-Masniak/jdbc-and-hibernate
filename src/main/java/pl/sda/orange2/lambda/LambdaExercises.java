package pl.sda.orange2.lambda;

public class LambdaExercises {
    public static void main(String[] args) {
        BoysDontCry boy = new ChlopakiNiePlacza();
        boy.silnoreki();
        // boy.sing();

        ChlopakiNiePlacza boy2 = new ChlopakiNiePlacza();
        boy2.sing();


        //anonymus class
        BoysDontCry anonymusClassReference = new BoysDontCry() {
            @Override
            public void silnoreki() {
                System.out.println("Anonimowy silnoreki :)");
            }
        };

        anonymusClassReference.silnoreki();

        // wrong -> BoysDontCry stupid = new String("")
        BoysDontCry firstLambda = () -> {
        };

        BoysDontCry secondLambda = () -> System.out.println("Lambda ;)");
        secondLambda.silnoreki();
        BoysDontCry thirdLambda = () -> {
            System.out.println("one");
            System.out.println("second");
        };

        // () parenthesis - arguments list
        // -> arguments, body separator
        //

        System.out.println("____________________");
        System.out.println("Coffe time");

        CoffeMaker myCoffeMaker = (int water, String coffeType) -> "my coffe";
        CoffeMaker myCoffeMaker2 = (int water, String coffeType) -> {
            return "my coffe";
        };

        CoffeMaker myCoffeMaker3 = (int water, String coffeType) -> {
            System.out.println("Coffe brewing....");
            return "Java Latte";
        };

        String myCoffe = myCoffeMaker3.prepare(5, "Small");
        System.out.println("my coffe is ready: " + myCoffe);

        CoffeMaker shortVersion = (water, coffeType) -> "my coffe";
        shortVersion.prepare(5, "Large Java Coffe");


    }

}
