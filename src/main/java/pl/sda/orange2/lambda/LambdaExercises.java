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
        } ;

        anonymusClassReference.silnoreki();


    }
}
