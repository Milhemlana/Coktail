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
public class VolumeExceedsException extends Exception {
    @Override
    public String getMessage(){
       return "Blender overFlow!";
    }
    
}
