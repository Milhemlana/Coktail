/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycoktail;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lanam
 */
public class MyCoktail {
    public static void main(String[] args) {
     Blender blender=new Blender(1000);
     int choice,n,size;
     Scanner in=new Scanner(System.in);
     choice=in.nextInt();
                
        System.out.println("Choose what you want in your delicious Coktail:");
        System.out.println("The menu of the ingredients .. cjoose what you want:"
                + "1. Apples"
                + "2. oranges"
                + "3.Bananas"
                + "4.Cherry"
                + "5. Milk"
                + "6. Kiwi"
                + "7. Nuts"
                + "8. Exit");
    do{
        
     choice=in.nextInt();
        switch (choice) {
  case 1:
    Ingredients apple = new Fruits("Apple",52,100);
   
     {
         try {
             blender.addIng(apple);
         } catch (VolumeExceedsException ex) {
             Logger.getLogger(MyCoktail.class.getName()).log(Level.SEVERE, null, ex);
         }
     }  
    Color col=new Color(40.1,70.59,27.84);
    break;
  case 2:
    Fruits Orange=new Fruits("Orange",0.47,99);
     {
         try {
             blender.addIng(Orange);
         } catch (VolumeExceedsException ex) {
             Logger.getLogger(MyCoktail.class.getName()).log(Level.SEVERE, null, ex);
         }
     }
      Color col1=new Color(255,165,0);
    break;
  case 3 :
    Fruits banana =new Fruits("Banana",89,100);
      Color col2=new Color(255,255,53);
     {
         try {
             blender.addIng(banana);
         } catch (VolumeExceedsException ex) {
             Logger.getLogger(MyCoktail.class.getName()).log(Level.SEVERE, null, ex);
         }
     }
    break;
    case 4:
    Fruits cherry=new Fruits("Cherry",50,100);
     {
         try {
             blender.addIng(cherry);
         } catch (VolumeExceedsException ex) {
             Logger.getLogger(MyCoktail.class.getName()).log(Level.SEVERE, null, ex);
         }
     }
      Color col3=new Color(210,4,45);
    break;
   case 5:
    Milk milk=new Milk("Milk",42,100);
     {
         try {
             blender.addIng(milk);
         } catch (VolumeExceedsException ex) {
             Logger.getLogger(MyCoktail.class.getName()).log(Level.SEVERE, null, ex);
         }
     }
    break;
   case 6:
       Fruits kiwi=new Fruits("Kiwi",61,100);
     {
         try {
             blender.addIng(kiwi);
         } catch (VolumeExceedsException ex) {
             Logger.getLogger(MyCoktail.class.getName()).log(Level.SEVERE, null, ex);
         }
     }
         Color col4=new Color(55.69,89.8,24.71);
         break;
   case 7:
       Nuts nut=new Nuts("nuts",607,100);
     {
         try {
             blender.addIng(nut);
         } catch (VolumeExceedsException ex) {
             Logger.getLogger(MyCoktail.class.getName()).log(Level.SEVERE, null, ex);
         }
     }
       break;
   case 8:
       System.exit(8);
  default:
    System.out.println("Now.. Wait for us to prepare it!");
        }
}while(choice!=8);
    System.out.println("Choose the cup' size you want!"
                + "1. 100 ml."
                + "2. 150 ml.");
        size=in.nextInt();
        switch(size){
            case 1:
                Cup cup=new Cup(100.0);
     {
         try {
             blender.pour(cup);
         } catch (BlenderEmptyException ex) {
             Logger.getLogger(MyCoktail.class.getName()).log(Level.SEVERE, null, ex);
         }
     }
                
                break;
            case 2:
                Cup cup2=new Cup(150.0);
     {
         try {
             blender.pour(cup2);
         } catch (BlenderEmptyException ex) {
             Logger.getLogger(MyCoktail.class.getName()).log(Level.SEVERE, null, ex);
         }
     }
                
                
                break;
            default:
        }
              
                
    }
    }
