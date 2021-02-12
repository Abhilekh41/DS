package LinkedList;


public class ReverseALinkedList
{
    public static void main(String args[])
    {
            Node head = new Node(45);
            head.next = new Node(46);
            head.next.next = new Node(47);
            head.next.next.next = new Node(48);
            head.next.next.next.next = new Node(49);

            Node newNode = reverse(head);

            Node node = newNode;

            while(newNode!=null)
            {
                System.out.println(newNode.value);
                newNode = newNode.next;
            }
    }

    public static Node reverse(Node head)
    {
        Node prev = null;
        Node curr = head;
        Node next = null;

        while(curr!=null)
        {
            next= curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return head;
    }
}
