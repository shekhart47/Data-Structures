
public class LevelOrder {
	
	
	
	/* 
    
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/

    static ArrayList<LinkedList<Integer>> level;

    public static void createStructure(Node node)
    {
          int depth = maxDepth(node);
          level = new ArrayList<LinkedList<Integer>>();
        
        for(int i = 0; i< depth; i++)
        {
            level.add(new LinkedList<Integer>());
        }
        
        traverseLevel(node,0);
        printList(level);
        
    }
	public static void levelOrder(Node root) {
        if(root!=null){
        createStructure(root);
        }
    }

    public static void traverseLevel(Node node, int i){
        if(node == null)
        {
            return;
        }else{
        
        level.get(i).add(node.data);
      //  System.out.print(node.data +" ");
        traverseLevel(node.left,i+1);
        
        traverseLevel(node.right, i+1);
        
        }
        
        
        
    }

public static void printList(ArrayList<LinkedList<Integer>> list)
{
    
    for(LinkedList<Integer> l : list)
    {
        for(int i :  l)
        {
            System.out.print(i + " ");
        }
    }
    
}

    public static int maxDepth(Node node)
    {
        if(node == null)
        {
            return 0;
        }else{
            int left = maxDepth(node.left);
            int right = maxDepth(node.right);
            return Math.max(left,right)+1;
        }
    }

}
