class Solution
{
    public ArrayList<Integer> largestValues(Node root)
    {
       ArrayList<Integer> arr=new ArrayList<>();
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int max=0;
            int count=q.size();
            for(int i=0;i<count;i++){
                Node curr=q.remove();
                max=Math.max(curr.data,max);
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
            arr.add(max);
        }
        return arr;
    }
}