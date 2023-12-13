package Test;

import java.util.*;

//Q. Write a Java program to simulate a stack using the ArrayList class.
 public class Stacks {
 static class Stack{
    //creating arraylist
    static ArrayList<Integer> list = new ArrayList<>();

    //cheaking if list is empty return true or false
    public static boolean isEmpty(){
        return (list.size()==0);
    }

    //adding value to the list
    public static void push(int data){
       list.add(data);
    }

    //removing value from the list
    public static int pop(){
        //cheaking if list is empty return -1 
        if(isEmpty()==true)
        return -1;
        // if list having some value remove it
        int top= list.get(list.size()-1);
        list.remove(list.size() -1);
        return top;
    }

    //returning the peek value
    public static int peek(){
        if(isEmpty())
        return -1;

        return list.get(list.size()-1);
    }
 }
     public static void main(String[] args) {
        
        Stack s=new Stack();
        

        s.push(10);
        s.push(20);
        s.push(30);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
   }
}
    