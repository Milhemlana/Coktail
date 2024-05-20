
package mycoktail;

import java.util.ArrayList;
import java.util.logging.Logger;


public class Blender {
    
    private Cup cup;
    private Coktail coktail;
    private double capacity;
    private double no_cal;
    private double volume;
    private Color color=new Color();
    private ArrayList<Ingredients> ings=new ArrayList<>();
    private Logger logger;
    public Blender(Logger logger){
        this.logger=logger;
    }
    public Blender(){}
    public Blender(double capacity){
        this.capacity=capacity;
    }
  
public boolean isEmpty(){
        return this.volume==0;
}
public void addIng(Ingredients ing) throws VolumeExceedsException{
    
    if(this.volume<this.capacity) 
        this.capacity-=ing.getVolume();
    else throw new VolumeExceedsException();
}
public void blend(Ingredients ing){
    int finalR=0,finalG=0,finalB=0;
    double totalCalories=0;
    finalR+=ing.color.getR();
    finalG+=ing.color.getG();
    finalB+=ing.color.getB();
    totalCalories+=ing.getNo_of_calories();
    
    System.out.println("The total Number of calories is: "+totalCalories );
    System.out.println("The final RGB colors: ("+finalR+" ' "+finalG+" ' "+finalB+" )");
    
}
public void pour(Cup cup) throws BlenderEmptyException{
    if(isEmpty())
        throw new BlenderEmptyException();
    else
        if(cup.getCapacity()>this.volume)
            System.out.println("there is no enough ingredients!");
        else{
            this.volume-=cup.getCapacity();
            if(cup.getCapacity()==100)
            System.out.println("Total calories in the cup = "+(1/5)*this.capacity);
            else if(cup.getCapacity()==150)
                 System.out.println("Total calories in the cup = "+(1/4)*this.capacity);  
        }
}
    public Cup getCup() {
        return cup;
    }

    public void setCup(Cup cup) {
        this.cup = cup;
    }

    public Coktail getCoktail() {
        return coktail;
    }

    public void setCoktail(Coktail coktail) {
        this.coktail = coktail;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Blender{" + "cup=" + cup + ", coktail=" + coktail + ", capacity=" + capacity + ", no_cal=" + no_cal + ", volume=" + volume + ", color=" + color + ", ings=" + ings + ", logger=" + logger + '}';
    }
   
    
    
}