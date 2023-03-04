package pl.sda.orange2.lambda;

//It's functional interferace because has one abstract method
@FunctionalInterface //ochrona żeby nie zepsuć,
public interface BoysDontCry {
    void silnoreki();

    default void cry(){} //mozna implementować, ale nie trzeba, nie robi sie z automatu

    // void cry(); - nie moze być drugiej metody,
    // bo lambda się wysypie
}
//metoda w interfejsie jest zawsze publiczna i abstrakcyjna,
// bo nie ma ciała

// lambda to anonimowa metoda,
// która pociaga za sobą zawsze definicję klasy
