package la;



public class NumberBox<T extends Number> {



    private T item;



    // store an item of type T

    public void setItem(T item) {

        this.item = item;

    }



    // retrieve the stored item

    public T getItem() {

        return item;

    }



    // calculate and return the value as double

    public double getValue() {

        return item.doubleValue();

    }

}