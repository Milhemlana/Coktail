package mycoktail;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lanam
 */
public class  ConsolLogger implements Logger {
    @Override
    public void log (String msg){
        System.out.println(msg);
        
    }
    
    
}
