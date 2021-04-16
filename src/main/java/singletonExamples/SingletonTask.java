package singletonExamples;

public class SingletonTask {
    public static void main(String[] args) {

        //nie moge utworzyc obiektu klasy, ktora jest singletonem, bo konstruktor jest prywatny
        //singletonExamples.SingletonSequenceGenerator generator =new singletonExamples.SingletonSequenceGenerator();

        SingletonSequenceGenerator generator = SingletonSequenceGenerator.getInstance();
        System.out.println(generator);
        System.out.println(generator.getSequence());
    }

}
