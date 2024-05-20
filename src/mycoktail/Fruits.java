/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycoktail;

/**
 *
 * @author lanam
 */
public class Fruits extends Ingredients{
    private Color color;
    private double volume;
    
    public Fruits(){}
    public Fruits(String name,double no_of_calories,double volume){
    super(name,no_of_calories);
    this.volume=volume;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
    
    @Override
   public String getInfo(){
       return " , "+super.getInfo()+"The color is: "+this.color+" , "+" The volume is: "+this.volume+".";
   }
   public void Claories(){
       
   }
   
}
