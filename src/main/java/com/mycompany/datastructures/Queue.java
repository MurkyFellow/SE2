
package com.mycompany.datastructures;

public class Queue {

    private int [] values;
    private int index;
    
    Queue(int size) {
        values = new int[size];
        index = 0;
    }
    
    public void append(int input, int position){
        if (position < values.length){
            values[position] = input;
            index++;
        }        
    }
    
    public int get(){
        int position = index-1;
        index--;
        return values[position];
    }
    
    public boolean isEmpty(){
        return index == 0;
    }
    
    public boolean isFull(){
        return index == values.length;
    }
    
    public int peek(){
        return values[0];
    }
}
