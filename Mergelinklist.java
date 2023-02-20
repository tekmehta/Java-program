//completed
import java.util.*;
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class Mergelinklist{
    static Node createList(int a[])
    {Node head=null;
        for(int i=0;i<a.length;i++)
        {
            Node nod=new Node(a[i]);
            if(head==null)
                head=nod;
            else{
                Node link=head;
                while(link.next!=null)
                {
                    link=link.next;
                }
                link.next=nod;
            }
        }
        return head;
    }
    static void printList(Node head)
    {
        Node link=head;
        while(link.next!=null)
        {
            System.out.print(link.data+" ");
            link=link.next;
        }
        System.out.print(link.data+"\n");
        System.out.println();
    }
    static Node mergetwolist(Node head1,Node head2)
    {
        ArrayList<Integer> ar=new ArrayList<>();
        Node ptr=head1;
        while(ptr.next!=null)
        {
            ar.add(ptr.data);
            ptr=ptr.next;
        }
        ar.add(ptr.data);
        ptr.next=head2;
        ptr=ptr.next;
        while(ptr!=null)
        {
            ar.add(ptr.data);
            ptr=ptr.next;
        }
        ptr=head1;
        Collections.sort(ar);
        for(int i=0;i<ar.size();i++)
        {
            ptr.data=ar.get(i);
            ptr=ptr.next;
        }
        return head1;
    }
   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr1[]={5,80,9,20};
        int arr2[]={10,70,4,3};
        Node list1=createList(arr1);
        Node list2=createList(arr2);
       
        Node head=mergetwolist(list1, list2);
        printList(head);
        sc.close();
    }
}
