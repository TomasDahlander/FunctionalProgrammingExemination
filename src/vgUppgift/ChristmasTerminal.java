package vgUppgift;

import javax.swing.*;
import java.util.*;

public class ChristmasTerminal {

    static ChristmasDatabase hashMap = new ChristmasDatabase();
    static Map<String, String> map;

    public static void main(String[] args) {
        map = hashMap.getMap();
        while(true){
            try {
                String input = JOptionPane.showInputDialog("Ange namn på en undersåte för att\nfå en lista på alla dennes chefer:").trim();
                if(input.isEmpty()) {
                    System.out.println("Du måste ange minst ett tecken...");
                    continue;
                }
                List<String> originalList = new ArrayList<>();
                System.out.println(getSubjects(originalList, input));
            } catch(NullPointerException e){
                break;
            }
        }
    }

    public static List<String> getSubjects(List<String> list, String subject){
        String boss = map.get(subject.substring(0,1).toUpperCase()+subject.substring(1).toLowerCase());
        if(boss == null) return list;
        else {
            list.add(boss);
            return getSubjects(list,boss);
        }
    }
}