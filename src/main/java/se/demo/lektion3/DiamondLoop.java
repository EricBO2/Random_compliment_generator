package se.demo.lektion3;

public class DiamondLoop {
    public static void diamondGenerator () {
        String diamond = "";
        int pyramidSize = 30;

        for (int i= 1; i<=pyramidSize; i++) {
            diamond = diamond.concat("*");
            System.out.println(diamond);
        }

        for (int i= 1; i<=pyramidSize -1; i++) {
            diamond = diamond.substring(0, diamond.length()-1);
            System.out.println(diamond);
        }
    }
}
