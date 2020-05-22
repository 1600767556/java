package Example5;

public class ExceptionTest15 {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        try {
            myStack.push(new Object());
            myStack.push(new Object());
            myStack.push(new Object());
            myStack.push(new Object());
            myStack.push(new Object());
            myStack.push(new Object());
            myStack.push(new Object());
            myStack.push(new Object());
            myStack.push(new Object());
            myStack.push(new Object());
            myStack.push(new Object());

        } catch (StackOperactionException e) {
            System.out.println(e.getMessage());
        }
        try{
            myStack.pop();
            myStack.pop();
            myStack.pop();
            myStack.pop();
            myStack.pop();
            myStack.pop();
            myStack.pop();
            myStack.pop();
            myStack.pop();
            myStack.pop();
            myStack.pop();

        }catch (StackOperactionException e){
            System.out.println(e.getMessage());
        }

    }
}
