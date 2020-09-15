package rocks.zipcode.quiz4.arrays;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {
        return values[values.length/2];
    }

    public static String[] removeMiddleElement(String[] values) {
//      String middleElement = values[values.length/2];
        String[] remove = new String[values.length-1];
        for(int index = 0; index < values.length; index++){
            if(index == values.length/2){

            }
            else if (index > values.length/2){
                remove[index-1] = values[index];
            }
            else {
                remove[index] = values[index];
            }
        }
        return remove;
    }

    public static String getLastElement(String[] values) {
        return values[values.length-1];
    }

    public static String[] removeLastElement(String[] values) {
        //find last element
        String[] remove = new String[values.length-1];
        for(int index = 0; index < values.length-1; index++){
            if(index == values.length-1){

            }
            else {
                remove[index] = values[index];
            }
        }
        return remove;
    }
}