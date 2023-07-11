package OOP_Seminar3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ComponentIterator implements Iterator<Component> {
    List<Component> components = new ArrayList<>();
    int index = 0;
    public boolean hasNext() {
            return index < components.size();
        }

        public Component next() {
            return components.get(index++);
        }
    
}
