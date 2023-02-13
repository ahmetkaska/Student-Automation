package StudentAutomations;

import java.util.ArrayList;

/**
 *
 * @author ahmetkaska
 */
public class Operations <T>{ // This class is generic for decreasing code repitation.
    
   
   
    public void showTeacherList(ArrayList<Teacher> arr){
        for(int i =0 ; i< arr.size();i++){
            System.out.println(arr.get(i).toString());
        }
    }
    
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
