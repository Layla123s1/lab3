package la;
import java.util.List;
import java.util.Arrays;

public class PrintableList<T>{
private List<T> list;
public PrintableList(T[] items) {
	this.list = Arrays.asList(items);
}
public List<T> getList(){
	return list;
}
public void printAll() {
	for (T item : list) {
		System.out.println(item);
	}
}
}
