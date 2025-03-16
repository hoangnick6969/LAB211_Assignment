/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week7;
import java.util.ArrayList;
import org.w3c.dom.DOMException;

/**
 *
 * @author PC
 */
public class Manager {


public void createFruit(ArrayList<Fruit>lf){
    while (true){
        System.out.println("Enter fruit id:");
        String fruitId=Validation.checkInputString();
        if(!VALIDATION_checkIdExist(lf,fruitId)){
            
        }
    }
}    
}
