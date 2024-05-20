package mycoktail;


import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lanam
 */
public class FileLogger implements Logger {
    private String filePath;
    public FileLogger(String filePath){
        this.filePath=filePath;
    }
    @Override
    public void log(String msg){
        try {
            FileWriter fw=new FileWriter(this.filePath);
            fw.write(msg);
            fw.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    
}
