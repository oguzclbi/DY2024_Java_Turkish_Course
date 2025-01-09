package day50_collections_part_2;

import day38_static.j05.StaticOrder;

import java.util.Stack;

public class J01_ListStack {
    public static void main(String[] args) {

        Stack<Integer> stack=new Stack<>();
        stack.push(1); //En alta eklendi
        stack.push(2);
        stack.push(3); //En üste eklendi

        System.out.println("stack.peek() = " + stack.peek()); //3
        System.out.println("stack.peek() = " + stack.peek()); //3

        System.out.println("stack.pop() = " + stack.pop()); //3
        System.out.println("stack.pop() = " + stack.pop()); //2
        System.out.println("stack.pop() = " + stack.pop()); //1
        //System.out.println("stack.pop() = " + stack.pop()); //EmptyStackException hatası verir çünkü eleman kalmadı

        System.out.println("stack = " + stack);


    }
}
