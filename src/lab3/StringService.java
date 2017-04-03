/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author ajayasooriya
 */
public class StringService {
    public void saveText(String text,int value)throws RuntimeException{
        if(value == 0){
            throw new RuntimeException("Value cannot be zero.");
        }
        try{
            if(!text.equals(text.toUpperCase())){
                throw new UpperCaseMandatoryException();
            } 
        }catch(UpperCaseMandatoryException e){
            throw new RuntimeException(e);
        }
//        else if(text.length() < 5){
//            throw new IllegalArgumentException("Sorry text must be atleast 5 charachters.");
//            
//        }
    }
}
