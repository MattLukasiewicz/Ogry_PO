package org.example;

public class Shrek extends Harvester{
    public Shrek(String name,char symbol,int height, double harvesting_accuracy){
        super(name,symbol,height,harvesting_accuracy);
    }
    @Override
    public void Superpower(){
        System.out.println("Shrek's superpower is not discovered yet");
    }


}
