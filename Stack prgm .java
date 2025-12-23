class Stack {
    int top = -1;            // stack starts empty
    int capacity = 10;       // maximum size of stack
    int a[] = new int[capacity];  // array to hold elements

    // Push operation
    void push(int x) {
        if (top == capacity - 1) {   // if stack is full
            System.out.println("STACK OVERFLOW");
            return; // stop pushing
        }
        a[++top] = x;  // increase top and insert element
        System.out.println("Inserted element = " + x);
    }

    // Pop operation
    int pop() {
        if (top == -1) {   // if stack is empty
            System.out.println("STACK EMPTY");
            return -1; // return error value
        }
        return a[top--];   // return element and decrease top
    }

    // Display stack
    void display() {
        if (top == -1) {
            System.out.println("STACK EMPTY");
            return;
        }
        System.out.println("Remaining stack elements:");
        for (int i = 0; i <= top; i++) {
            System.out.println(a[i]);
        }
    }

    public static void main(String args[]) {
        Stack s = new Stack();

        // Push elements
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);   

        // Pop elements
        System.out.println("Popped element is " + s.pop());
        System.out.println("Popped element is " + s.pop());

        // Display remaining
        s.display();
    }
}
