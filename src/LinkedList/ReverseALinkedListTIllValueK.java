package LinkedList;

public class ReverseALinkedListTIllValueK
{
    public static void main(String args[])
    {
        Node head = new Node(45);
        head.next = new Node(46);
        head.next.next = new Node(47);
        head.next.next.next = new Node(48);
        head.next.next.next.next = new Node(49);
        head.next.next.next.next.next = new Node(50);
        head.next.next.next.next.next.next = new Node(51);
        head.next.next.next.next.next.next.next = new Node(52);

        Node newNode = reverseTill(head,4);

        while(newNode!=null)
        {
            System.out.println(newNode.value);
            newNode = newNode.next;
        }
    }

    public static Node reverseTill(Node node, int value)
    {
        Node prev = null;
        Node curr = node;
        Node next = null;
        Node head = node;
        int counter = 0;
        while(curr!=null && counter<value)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            counter++;
        }
        int count = counter;
        while(counter>0)
        {
            counter--;
            head = head.next;
        }
        return node;
    }
}
