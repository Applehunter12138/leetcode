package package2;

public class LinkList<T> {

    //头结点
    public Node<T> head;
    //尾结点
    public Node<T> tail;
    //链表长度
    public int size;

    public LinkList(){
        this.head = new Node<>(null,null);
        size = 0;
    }

    public Node<T> get(int index) {
        if (index <0 || index >=this.size){
            return null;
        }else{
            Node<T> temp = this.head;
            for(int i =1; i <= index; i++){
                temp = temp.next;
            }
            return temp;
        }
    }

    public void insert(int index ,T data) throws Exception{
        if(index <0 ||index > this.size){
            throw new Exception("插入超出范围");
        }else{
            Node<T> newNode = new Node<>(data);
            //在头结点插入元素
            if (index ==0){
                if(this.size >0){
                    newNode.next = head;
                }
                head = newNode;
            }
            //在尾结点插入元素
            else if(index == this.size){
                Node<T> temp = tail;
                temp.next = newNode;
                this.tail  = newNode;

            }else{
                //在中间插入元素
                Node<T> preNode = get(index-1);
                newNode.next = preNode.next;
                preNode.next = newNode;

            }

        }
        this.size ++;

        if(size == 1){
            tail = head;
        }
    }

    public void del(int index )throws Exception{
        if (index <0 ||index >=this.size){
            throw new Exception("删除超出范围");
        }else{
            //删除头结点
            if (index == 0){
                this.head = this.head.next;

            }else if(index == this.size-1){    //删除尾结点
                Node<T> preNode = get(index -1);
                this.tail = preNode;
                preNode.next = null;
            }else{
                //删除中间结点
                Node<T> preNode = get(index -1);
                preNode.next = preNode.next.next;
            }

        }
        this.size --;

    }
}
