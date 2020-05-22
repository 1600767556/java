package Example3;

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
    public void push(Object object){
if (index>=elements.length-1){
    System.out.println("压栈失败,栈已满");
    return;
}
index++;

        System.out.println("压栈"+elements[index]+"元素成功,栈帧指向:"+index);
    }
//弹栈
public void pop(){
        if (index<0){
            System.out.println("弹栈失败,没有了");
            return;
        }


    System.out.print("弹栈"+elements[index]+"成功");
    index--;
    System.out.println("栈帧指向:"+index);
}
}
