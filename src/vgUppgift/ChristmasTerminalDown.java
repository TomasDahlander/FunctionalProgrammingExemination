package vgUppgift;

import javax.swing.*;
import java.util.*;

public class ChristmasTerminalDown {

    static ChristmasDatabaseDown hashMap = new ChristmasDatabaseDown();
    static Map<String, List<String>> map;

    public static void main(String[] args) {
        map = hashMap.getMap();
        while (true) {
            try {
                String input = JOptionPane.showInputDialog("Ange namn på en chef för att\nfå en lista på alla dennes undersåtar:").trim();
                if (input.isEmpty()) {
                    System.out.println("Du måste ange minst ett tecken...");
                    continue;
                }
                System.out.println(getListOfEmployees(input,new ArrayList<>(),0));
            } catch (NullPointerException e) {
                break;
            }
        }
    }

    public static List<String> getListOfEmployees(String name, List<String> list, int index){
        try {
            List<String> tempList = map.get(name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase());
            list.addAll(tempList);
            return getListOfEmployees(list.get(index), list, index + 1);

        }catch(NoSuchElementException | NullPointerException e){
            if(list.size() == 0) return list;
            else return getListOfEmployees(list.get(index),list,index+1);
        }catch(IndexOutOfBoundsException e){
            return list;
        }
    }
}