package singletonExamples;

public class SingletonSequenceGenerator {

    private static SingletonSequenceGenerator instance = new SingletonSequenceGenerator();


    //prywatny konstruktor, zatem nie mozna utworzyc obiektu poza klasa
    private SingletonSequenceGenerator(){
    }

    public static SingletonSequenceGenerator getInstance(){
        return instance;
    }

    public int getSequence(){
        return 8;
    }

}
