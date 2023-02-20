//completed
import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Dublilist{
    static Node createList(int a[])
    {Node head=null;
        for(int i=0;i<a.length;i++)
        {
            Node j=new Node(a[i]);
            if(head==null)
            head=j;
            else{
                Node link=head;
                while(link.next!=null)
                {
                    link=link.next;
                }
                link.next=j;
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
    static Node removeDuplicates(Node head){
        Node link=head;
        Node pre=link;
        ArrayList<Integer> hs=new ArrayList<>();
        while(link!=null)
        {
            if(!hs.contains(link.data)){
                hs.add(link.data);
                pre=link;
                link=link.next;
            }
            else
            {
                pre.next=link.next;
                link=link.next;
            }
        }
        return head;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]={2,5,6,9,8,5,6,2,4,8,3};
        Node head=createList(a);
        System.out.println("List Before Removing Duplicates");
        printList(head);
        System.out.println("List After Removing Duplicates:");
        head=removeDuplicates(head);
        printList(head);
        sc.close();
    }
}
