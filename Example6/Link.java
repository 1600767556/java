package Example6;

public class Link {
    Node header;
public void add(Object data){
if (header == null){
    header = new Node(data,null);
}else{
    Node currentLastNode =findLsat(header);
    currentLastNode.next=new Node(data,null);
}
}

    private Node findLsat(Node node) {
    if (node.next == null){
        return  node;
    }
    return  findLsat(node.next);
    }

    public void remove(Object data){

    }

}
