/*
Node class is as follows:

class Node {
    int data;
    Node next;
    
    public Node (int data){
        this.data = data;
        this.next = null;
    }
}
*/

class Solution {
    
    //Return the sum of last k nodes
    public int sum(Node head, int k){
      //write code here
      int n = 0;
        Node curr = head;
        while(curr!=null)
        {
            n++;
            curr = curr.next;
        }
        curr = head;
        int i = 1;
        
        while(i<(n-k+1))
        {
            curr = curr.next;
            i++;
        }
        int sum = 0;
        while(k-->0)
        {
            sum+=curr.data;
            curr = curr.next;
        }
        return sum;
    }
}