package vgUppgift;

import javax.swing.*;
import java.util.*;

public class ChristmasTerminal {

    static ChristmasDatabase hashMap = new ChristmasDatabase();
    static Map<String, String> map;

    public static void main(String[] args) {
        map = hashMap.getMap();

        while(true){
            String input = JOptionPane.showInputDialog("Ange namn på en undersåte för att få en lista på alla dennes chefer:");
            if(input == null) break;
            List<String> originalList = new ArrayList<>();
            System.out.println(getSubjects(originalList,input));
            originalList.clear();
        }
    }
    public static List<String> getSubjects(List<String> list, String subject){
        String boss = map.get(subject.substring(0,1).toUpperCase()+subject.substring(1).toLowerCase());
        if(boss == null) return list;
        else {
            list.add(boss);
            return list = getSubjects(list,boss);
        }
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