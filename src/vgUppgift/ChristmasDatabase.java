package vgUppgift;

import java.util.HashMap;
import java.util.Map;

public class ChristmasDatabase {

    private Map<String, String> map = new HashMap<>();

    public ChristmasDatabase(){
        map.put("Bladlusen","Myran");
        map.put("Gråsuggan","Räven");
        map.put("Myran","Räven");
        map.put("Dammråttan","Skumtomten");
        map.put("Skumtomten","Trötter");
        map.put("Rådjuret","Butter");
        map.put("Nyckelpigan","Butter");
        map.put("Haren","Butter");
        map.put("Räven","Butter");
        map.put("Tröger","Glader");
        map.put("Trötter","Glader");
        map.put("Blyger","Glader");
        map.put("Glader","Tomten");
        map.put("Butter","Tomten");
    }

    public Map<String, String> getMap(){
        return map;
    }
}
/*
Tomtarna på Nordpolen har en strikt chefs-hierarki:
Högsta chefen för allt är "Tomten"
Under "Tomten" jobbar "Glader" och "Butter"
Under "Glader" jobbar "Tröger", "Trötter" och "Blyger"
Under "Butter" jobbar "Rådjuret", "Nyckelpigan", "Haren" och "Räven"
Under "Trötter" jobbar "Skumtomten"
Under "Skumtomten" jobbar "Dammråttan"
Under "Räven" jobbar "Gråsuggan" och "Myran"
Under "Myran" jobbar "Bladlusen"
 */