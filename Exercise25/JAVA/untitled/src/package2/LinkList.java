package package2;

public class LinkList<T> {
    public class Node {
        //数据
        public T item;
        //指向下一个结点
        public Node next;

        //构造器
        public Node(T item, Node next) {
            this.item = item;
            this.next = next;
        }
        public Node(T item){
            this.item = item;
        }
    }
    //头结点
    public Node head;
    //尾结点
    public Node tail;
    //链表长度
    public int size;

    public LinkList(){
        this.head = new Node(null,null);
        size = 0;
    }

    public Node get(int index) {
        if (index <0 || index >=this.size){
            return null;
        }else{
            Node temp = this.head;
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
            Node newNode = new Node(data);
            //在头结点插入元素
            if (index ==0){
                if(this.size >0){
                    newNode.next = head;
                }
                head = newNode;
            }
            //在尾结点插入元素
            else if(index == this.size){
                Node temp = tail;
                temp.next = newNode;
                this.tail  = newNode;

            }else{
                //在中间插入元素
                Node preNode = get(index-1);
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
                Node preNode = get(index -1);
                this.tail = preNode;
                preNode.next = null;
            }else{
                //删除中间结点
                Node preNode = get(index -1);
                preNode.next = preNode.next.next;
            }

        }
        this.size --;

    }
}

/*
————————————————
        版权声明：本文为CSDN博主「梧桐叶123」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
        原文链接：https://blog.csdn.net/u011723409/article/details/125456921
 */