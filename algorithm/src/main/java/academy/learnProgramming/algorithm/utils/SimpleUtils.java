package academy.learnProgramming.algorithm.utils;

public class SimpleUtils {

    public boolean stringToBoolean(String value){

        if(value == null)
            return false;
        if(value.equals("y") || value.equals("Yes") || value.equals("true"))
            return true;

        return false;


    }
}
