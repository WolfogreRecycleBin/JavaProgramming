package yyh.helper;

/**
 * Created by ÑîÓÀ»ª on 2015/12/16.
 */

/**
 * simple validation methods.Borrowed from jsoup
 */
public class Validate {

    public Validate(){}

    /**
     * validate that the object not null
     * @param obj the object to test
     */
    public static void notNull(Object obj){
        if(obj == null)
            throw new IllegalArgumentException("object must not be null");
    }

    /**
     * validate that the value is true
     * @param val the value to test
     */
    public static void isTrue(boolean val){
        if(!val)
            throw new IllegalArgumentException("Must be True");
    }

    /**
     * validate that the value is false
     * @param val the value to test
     */
    public static void isFalse(boolean val){
        if(val)
            throw new IllegalArgumentException("Must be false");
    }

    /**
     * validate that the string not empty
     * @param string the string to test
     */
    public static void notEmpty(String string) {
        if (string == null || string.length() == 0)
            throw new IllegalArgumentException("String must not be empty");
    }

    /**
     * cause a failure
     * @param msg Message to output
     */
    public static void fail(String msg){
        throw new IllegalArgumentException(msg);
    }
}
