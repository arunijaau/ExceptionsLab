package lab3;

/**
 * This class provides various services relating to name manipulation.
 * No output should be performed here.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class NameService {
    
    /**
     * Finds and returns the last name from within a full name. Caution: 
     * No validation is performed.
     * 
     * @param fullName - a name containing a first name and a last name
     * @return the last name
     * @throws YourCustomExceptionName if fullName is null or empty or has
     * fewer than two parts
     */
    public String extractLastName(String fullName)throws InvalidNameInputException {
        String lastName = null;
        
        if(fullName == null || fullName.isEmpty()){
            throw new InvalidNameInputException("Error: Full name should not be null or empty.");
        }
        
        String[] partsOfFullName = fullName.split(" ");
        if(partsOfFullName.length < 2 ){
            throw new InvalidNameInputException("Error: Full name must have first name and last name.");
        }
        
        lastName = partsOfFullName[partsOfFullName.length - 1];
        
        return lastName;
    }
    
}
