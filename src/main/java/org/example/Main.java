package org.example;

public class Main {
    public static void main(String[] args) {

        Harvester Hero1 = new Shrek("Shrek", '%', 280, 1.0);
        System.out.println("Name: " + Hero1.name + " Height: " + Hero1.height + " Accuracy: " + Hero1.harvesting_accuracy);

        //Basic movement
        Tree apple_tree = new Tree("apple_tree", 'J', 5, 240, 5);

        char[][] map_1 = {
                {apple_tree.symbol, '0', apple_tree.symbol},
                {'0', apple_tree.symbol, '0'},
                {apple_tree.symbol, '0', apple_tree.symbol}
        };

        int test

        int how_many_trees = 0;
        for (int i = 0; i <3; i++) {
            for (int j = 0; j <3; j++) {
                if (map_1[i][j] == apple_tree.symbol) how_many_trees++;


            }

        }
        System.out.println("How many apple trees: " + how_many_trees);
        System.out.println();
        //Map display
        for (int i = 0; i <3; i++) {
            for (int j = 0; j <3; j++) {
                System.out.print(map_1[i][j]);


            }
            System.out.println();

        }




    }
}