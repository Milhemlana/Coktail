
package mycoktail;


public class Cup {
    private double capacity;
    private double no_of_calories;
    public Cup(){}
    public Cup(double capacity,double no_of_calories){
        this.capacity=capacity;
        this.no_of_calories= no_of_calories;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getNo_of_calories() {
        return no_of_calories;
    }

    public void setNo_of_calories(double no_of_calories) {
        this.no_of_calories = no_of_calories;
    }

    
    
}
