package se.demo.lektion3;

public class Main {
    public static void main(String[] args) {
        DiamondLoop.diamondGenerator();
        RandomComplimentGenartor rng = new RandomComplimentGenartor();
        System.out.println(rng.getRandomCompliment());
    }
}
