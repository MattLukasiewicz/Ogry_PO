package org.example;

import java.io.InputStream;
import java.util.Scanner;

import static java.lang.Math.abs;

class Map {
    private char[][] mapArray;

    // Constructor that initializes the mapArray and loads the map from file
    public Map(String filename) {
        mapArray = new char[5][5];
        loadMapFromFile(filename);
    }

    // Method to load the map from a file into the mapArray
    private void loadMapFromFile(String filename) {
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(filename);
        if (inputStream == null) {
            System.out.println("File not found: " + filename);
            System.exit(1);
        }

        Scanner scanner = new Scanner(inputStream);
        for (int i = 0; i < 5; i++) {
            if (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] elements = line.split(" ");
                for (int j = 0; j < 5; j++) {
                    mapArray[i][j] = elements[j].charAt(0);
                }
            }
        }
        scanner.close();
    }

    // Method to display the mapArray on the screen
    public void displayMap() {
        System.out.println("Map:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(mapArray[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void Move(){
        //Creating a hero
        Harvester Hero1 = new Shrek("Shrek", '%', 280, 1.0);
        System.out.println("Name: " + Hero1.name + " Height: " + Hero1.height + " Accuracy: " + Hero1.harvesting_accuracy+ " Points: "+ Hero1.points);

        //Creating a trees
        Tree apple_tree = new Tree("apple_tree", 'J', 5, 240, 5);
        Tree banana_tree = new Tree("banana_tree", 'B', 10, 330, 1);

        //Counting some data
        int how_many_apple_trees = 0;
        int how_many_banana_trees = 0;

        //Moving and Harvesting
        for (int i = 0; i <5; i++) {
            for (int j = 0; j <5; j++) {

                if (mapArray[i][j] == apple_tree.symbol){
                    how_many_apple_trees++;
                    int heightDiference =abs(Hero1.height-apple_tree.heigh_of_the_fruits);
                    if(heightDiference<=40){
                        Hero1.points+= apple_tree.maxPoints();

                    }if(heightDiference>40){
                        Hero1.points+= apple_tree.maxPoints()* heightDiference*0.01;

                    }
                }


                if (mapArray[i][j] == banana_tree.symbol){
                    how_many_banana_trees++;
                    int heightDiference =abs(Hero1.height-banana_tree.heigh_of_the_fruits);
                    if(heightDiference<=40){
                        Hero1.points+= banana_tree.maxPoints();

                    }if(heightDiference>40){
                        Hero1.points+= banana_tree.maxPoints()* heightDiference*0.01;

                    }
                }



            }

        }
        //Printing data
        System.out.println("How many apple trees: " + how_many_apple_trees + " Max points: " +how_many_apple_trees*apple_tree.maxPoints());
        System.out.println("How many banana trees: " + how_many_banana_trees+ " Max points: " +how_many_banana_trees*banana_tree.maxPoints());
        System.out.println("How many points does hero have: " + Hero1.points);
        System.out.println();
    }
}


