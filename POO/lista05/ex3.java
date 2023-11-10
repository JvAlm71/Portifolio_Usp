
// In programming, a try 
// block is used to wrap code that might potentially 
// throw an exception. The catch blocks are used to handle those exceptions. 
// Multiple catch blocks can be used to handle different types of exceptions that might be 
// thrown in the try block. This is useful because it allows the programmer to handle different
//  error conditions differently. For example, you might want to handle a FileNotFoundException
//   differently from an IOException, even though both are related to I/O operations.
import java.io.FileNotFoundException;
import java.io.IOException;

public class ex3 { 
    try {
        // Code that may throw exceptions
    } catch (FileNotFoundException e) {
        // This block handles FileNotFoundException
    } catch (IOException e) {
        // This block handles IOException and related exceptions
    } catch (Exception e) {
        // This block handles all other exceptions
    }
}
