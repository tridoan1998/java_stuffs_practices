

include <iostream>

/*


stack: 
first in, last out

varibles: pointer, datas , size 
method: push(), pop(), peek(), size() 

4   
3
2
1

*/
//take in integer 
class Stack{

     Node *ptr;
     
    class Node {

        int element;
        Node *next_node;

        Node(int new_element) {
            this.element = new_element;
            Node *next_node = NULL;
        }

    }

    //constructor
    Stack() {
        Node *ptr = NULL;
        static int size = 0;
     }

    //return the size of the stack
    int get_size() {
        return this.size;
    }

    //                                          ptr
    //                                          ^
     //                                         |
    //       new_node(1) ->  new_node(2)  ->  new_node(3)        
    void push(int elements) {
        if (this.size == 0) {
            Node new_node = new Node(elements);
            ptr = &new_node;
        }
        else{
            Node new_node = new Node(elements);
            ptr.next_node = new_node;
            ptr =  new_node;
        }
        this.size += 1;
        return;
    }

    void pop() {
        if (this.size == 0) {
            return "Stack is empty, can not pop!";
            exit(1);
        }
        else{
            int poped_element;
            poped_element = *ptr;

        }
        return;
    }

    //return the value at the peek of the stack
    void peek() {
        return *(this.ptr);
    }

}