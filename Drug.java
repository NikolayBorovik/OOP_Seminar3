package OOP_Seminar3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class Drug implements Iterator<Component>, Comparable<Drug>{
    int id;
    List<Component> components;
    int index;

    public Drug(int id) {
        components = new ArrayList<>();
        index = 0;
        this.id = id;
    }

    public Drug addComponent (Component component){
        components.add(component);
        return this;
    }

    @Override
    public String toString() {
        // return "Drug [components=" + components + ", index=" + index + ", full power: " + getPower(this) + "]";
        return "Drug id: " + id + ", full power: " + getDrugPower(this);
    }

    @Override
    public boolean equals(Object obj) {
        return (this.id == ((Drug)obj).id);
        
    }

    @Override
    public int hashCode() {
        int total = 31;
        total = total*31 +id;
        return total;
    }

    // @Override
    // public Iterator<Component> iterator() {
    //     return new ComponentIterator();         // либо через отдельный класс
    //     // return new Iterator<Component>() {       // либо через АНОНИМНЫЙ КЛАСС!
    //     //     public boolean hasNext() {
        //     return index < components.size();
        // }

        // public Component next() {
        //     return components.get(index++);
        // }
        // };
        
    // }

    @Override
    public int compareTo(Drug o) {
        // if (getDrugPower(this)> getDrugPower(o))    
        //     return 1;
        // else if (getDrugPower(this) < getDrugPower(o))
        //     return -1;
        // else return 0;
        if (Integer.compare(getDrugPower(this), getDrugPower(o)) == 0) {
            return CharSequence.compare(this.getName(), o.getName());
        }
        return Integer.compare(getDrugPower(this), getDrugPower(o));  // более короткий способ записи кода выше
    }

    protected String getName() {
        // Iterator<Component> iter = this;
        String result = new String();
        // while(iter.hasNext()){
        //     result = result + iter.next();
        // }
        for (Component component : this.getComponents()) {
            result += component;
        }
        return result;
    }

    public int getDrugPower (Drug drug){
        int power = 0;
        for (Component component : drug.getComponents()) {
            power += component.getPower();
        }
        return power;
    }

    public List<Component> getComponents() {
        return components;
    }

    @Override
    public boolean hasNext() {
        return index < components.size();

    }

    @Override
    public Component next() {
        return components.get(index++);
    }

    
}
