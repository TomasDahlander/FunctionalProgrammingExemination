package vgUppgift;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChristmasDatabaseDown {

    private final Map<String, List<String>> map = new HashMap<>();

    public ChristmasDatabaseDown(){
        map.put("Tomten", Arrays.asList("Glader", "Butter"));
        map.put("Glader", Arrays.asList("Tröger","Trötter","Blyger"));
        map.put("Butter", Arrays.asList("Rådjuret","Nyckelpigan","Haren","Räven"));
        map.put("Trötter", Arrays.asList("Skumtomten"));
        map.put("Skumtomten", Arrays.asList("Dammråttan"));
        map.put("Räven", Arrays.asList("Gråsuggan", "Myran"));
        map.put("Myran", Arrays.asList("Bladlusen"));
    }

    public Map<String, List<String>> getMap() {
        return map;
    }
}