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