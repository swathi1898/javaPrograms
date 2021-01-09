package com.swathi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> tempExit = new HashMap<>();
        locations.put(0, new Location(0,"you are sitting in front of your PC",null));

        tempExit = new HashMap<>();
        tempExit.put("N",5);
        tempExit.put("S",4);
        tempExit.put("E",3);
        tempExit.put("W",2);
        locations.put(1, new Location(1,"you are standing in front of the Forest",tempExit));

        tempExit = new HashMap<>();
        tempExit.put("N",5);
        tempExit.put("E",1);
        locations.put(2, new Location(2,"you are at the park",tempExit));

        tempExit = new HashMap<>();
        tempExit.put("W",1);
        locations.put(3, new Location(3,"you are inside a Cave",tempExit));

        tempExit = new HashMap<>();
        tempExit.put("N",1);
        tempExit.put("W",2);
        locations.put(4, new Location(4,"you are in the valley ",tempExit));

        tempExit = new HashMap<>();
        tempExit.put("S",1);
        tempExit.put("W",2);
        locations.put(5, new Location(5,"you are at the waterFalls",tempExit));
        
        Map<String ,String> commands = new HashMap<String, String>();
        commands.put("QUIT","Q");
        commands.put("NORTH","N");
        commands.put("SOUTH","S");
        commands.put("EAST","E");
        commands.put("WEST","W");

        int loc = 1;
        while (true){
            System.out.println(locations.get(loc).getDescription());
            tempExit.remove("S");
            if(loc== 0){
                break;
            }
            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.print("Available exits are ");
            for (String exit: exits.keySet()){
                System.out.print(exit+", ");
            }
            System.out.println();
            String direction = scanner.nextLine().toUpperCase();
            if(direction.length()>1){
                String[] words = direction.split(" ");
                for(String word : words){
                    if(commands.containsKey(word)){
                        direction = commands.get(word);
                        break;
                    }
                }
            }
            if(exits.containsKey(direction)){
                loc = exits.get(direction);
            }else{
                System.out.println("you cannot go in there \n ====================");

            }
        }


    }
}
