/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycoktail;
public class Ingredients {
    private String name;
    private double no_of_calories ;
    
    public Ingredients(){}
    public Ingredients(String name,double no_of_calories){
        this.name=name;
        this.no_of_calories=no_of_calories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNo_of_calories() {
        return no_of_calories;
    }

    public void setNo_of_calories(double no_of_calories) {
        this.no_of_calories = no_of_calories;
    }
    public String getInfo(){
        return "Name is: "+this.name+" , "+"The number of calories: "+this.no_of_calories;
    }
}
