package acme.study_guide.chapter10.handling_exceptions.applying_a_multi_catch_block;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.MissingResourceException;

public class Example {
    public void doesNotCompile() { // METHOD DOES NOT COMPILE
        try {
            mightThrow();
        } catch (FileNotFoundException | IllegalStateException e) {
        } catch (InputMismatchException /* e */ | MissingResourceException e){
        }catch(/* FileNotFoundException | */ IllegalArgumentException e){
//        }catch(Exception e){
        }catch(IOException e){
        }catch(Exception e){
        }
    }

    private void mightThrow() throws DateTimeParseException, IOException {
    }
}
