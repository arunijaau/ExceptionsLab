/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Aruni
 */
public class InvalidNameInputException extends IllegalArgumentException{
    
    private static final String ERROR_MSG = "Full name should have atleast 2 parts separated by spaces.";
    
    public InvalidNameInputException() {
        super(ERROR_MSG);
    }

    public InvalidNameInputException(String string) {
        super(ERROR_MSG);
    }

    public InvalidNameInputException(String string, Throwable cause1) {
        super(ERROR_MSG, cause1);
    }

    public InvalidNameInputException(Throwable cause1) {
        super(cause1);
    }
    
}
