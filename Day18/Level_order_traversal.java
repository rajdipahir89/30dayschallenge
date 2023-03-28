class Solution
{
    //Function to return the level order traversal of a tree.
    static ArrayList <Integer> levelOrder(Node node) 
    {
        // Your code here
        ArrayList<Integer> res = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        
        q.add(node);
        
        while(!q.isEmpty()){
            Node cur = q.remove();
            res.add(cur.data);
            
            if(cur.left != null) q.add(cur.left);
            if(cur.right != null) q.add(cur.right);
        }
        return res;
    }
}
