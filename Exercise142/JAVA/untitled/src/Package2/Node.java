package Package2;

public class Node<T> {
    //数据
    public T item;
    //指向下一个结点
    public Node<T> next;

    //构造器
    public Node(T item, Node<T> next) {
        this.item = item;
        this.next = next;
    }
    public Node(T item){
        this.item = item;
    }
}
