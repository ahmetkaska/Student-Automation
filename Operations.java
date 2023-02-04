package StudentAutomation;

import java.util.ArrayList;

/**
 *
 * @author ahmetkaska
 */
public class Operations <T>{ // This class is generic for decreasing code repitation.
    
   
    
    public void listAddObject(ArrayList<T> arrayList, T t){
        arrayList.add(t);
    }
    
    public void listRemoveObject(ArrayList<T> arrayList, T t){
        arrayList.remove(t);
    }
    
    public void listUpdateObject (ArrayList<T> arrayList , int index, T t){
        arrayList.set(index, t); 
        
    }
    
    
    
}
