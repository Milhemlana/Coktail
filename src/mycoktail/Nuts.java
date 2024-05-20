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
public class Nuts extends Ingredients {
    double volume;
    public Nuts(){}
    public Nuts(String name,double no_of_calories,double volume){
        super(name,no_of_calories);
        this.volume=volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
   
    @Override
    public String getInfo(){
        return super.getInfo();
    }
}
