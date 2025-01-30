package collection.link;

public class NodeMain1 {
    public static void main(String[] args) {
        // 노드 생성하고 연결하기: A -> B -> C
        Node first = new Node("A"); // x001.item = "A"
        first.next = new Node("B"); // x001.next = "x002", //x002.item = "B"
        first.next.next = new Node("C");// x002.next = "x003("C")

        System.out.println("모든 노드 탐색하기");
        Node x = first;
        while(x != null){
            System.out.println(x.item);
            x = x.next;
        }

    }
}
