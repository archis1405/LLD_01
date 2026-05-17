package lld10.GenericMethods;

public class Pair<T,V> {
    private T first;
    private V second;

    public Pair(T first, V second){
        this.first = first;
        this.second = second;
    }

    /*
        static utility method (static function: a function that belongs to the entire class)

        public static T getDefaultFirst(){
            return null;
        }

        this will throw an error --> the error is due to static method

        T is defined when the object is created now I make it static I am trying to call the method

        even before the method is created, now in picture comes generic methods and this should not be allowed
        as if the object is not created then T is not defined due to this we encounter the error here, thats why
        it will throw error during compilation

     */

    public T getFirst(){
        return first;
    }

    public V getSecond() {
        return second;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(V second) {
        this.second = second;
    }
}
