package se.demo.lektion3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomComplimentGenartor {
    List<String> complimentList = new ArrayList<String>();
    public RandomComplimentGenartor() {
        complimentList.add("Nice hair");
        complimentList.add("Nice face");
        complimentList.add("Nice eyes");
        complimentList.add("Nice legs");
        complimentList.add("Nice mustache");
    }

    public String getRandomCompliment() {
        Random rnd = new Random();
        int i = rnd.nextInt(complimentList.size());
        return complimentList.get(i);
    }

}
