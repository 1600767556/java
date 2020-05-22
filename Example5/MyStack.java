package Example5;

public class MyStack {
    private Object [] elements;
    private int index;

    public MyStack() {
this.elements=new Object[10];
this.index = -1;
    }

    public Object[] getElements() {
        return elements;
    }

    public void setElements(Object[] elements) {
        this.elements = elements;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
//压栈
    public void push(Object object) throws StackOperactionException {
if (index>=elements.length-1){
   StackOperactionException stackOperactionException = new StackOperactionException("栈已满！");
   throw stackOperactionException;
   // throw new StackOperactionException("栈已满");

}
index++;

        System.out.println("压栈"+elements[index]+"元素成功,栈帧指向:"+index);
    }
//弹栈
public void pop() throws StackOperactionException {
        if (index<0){
           StackOperactionException stackOperactionException = new StackOperactionException("弹栈失败");
           throw stackOperactionException;
        }


    System.out.print("弹栈"+elements[index]+"成功");
    index--;
    System.out.println("栈帧指向:"+index);
}
}
