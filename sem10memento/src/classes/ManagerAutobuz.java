package classes;

import java.util.ArrayList;
import java.util.List;

public class ManagerAutobuz {
    List<AutobuzMemento> autobuze;

    public ManagerAutobuz(){
        autobuze= new ArrayList<>();
    }
    public void adaugaMemento(AutobuzMemento memento){
        autobuze.add(memento);
    }
    public AutobuzMemento getMemento(Integer index){
        return autobuze.get(index);
    }
}
