package com.gamedirty.java.datastructure;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class ClearHeaderLinkedList<T> extends LinkedList {
   public void addLastOne(T t){
       if (contains(t)){
           Iterator<T> iterator = iterator();
           while (iterator.hasNext()){
               T next = iterator.next();
               iterator.remove();
               if (t.equals(next)){
                   break;
               }
           }
       }
       add(t);
   }
}
