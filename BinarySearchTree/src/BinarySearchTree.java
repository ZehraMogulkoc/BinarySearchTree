

public class BinarySearchTree {
	class BSTNode
	{
		int key;
		BSTNode left;
		BSTNode right;

		public BSTNode(int item)
		{
			key = item;
			left = null;
			right = null;
		}
	}

	static BSTNode root;

	BinarySearchTree(){ root = null;}
	
	 void insert(int key) {
		    root = insert(root, key);
		  }


	BSTNode insert(BSTNode root, int key)
	{
		if(root == null) {
			root = new BSTNode(key);
			return root;
		}
		
		if (key< root.key) {
			root.left = insert(root.left,key);
		}
		else if(key>root.key) {
			root.right = insert(root.right,key);
		}
		return root;
	}
	
	void inorder() {
	    inorderRec(root);
	  }
	
	  static void inorderRec(BSTNode root) {
	    if (root != null) {
	      inorderRec(root.left);
	      System.out.print(root.key + " -> ");
	      inorderRec(root.right);
	    }
	  }
    static void min(BSTNode root)  { 

        int minval = root.key; 
        while (root.left != null) {
        	  minval = root.left.key;
        	  root = root.left;
        	}
        System.out.println("Min value of BST: " + minval); 
    }    
    
   static void max(BSTNode root)  { 

        int maxval = root.key; 
        while (root.right != null) {
        	maxval = root.right.key;
      	  root = root.right;
      	}

        System.out.println("Max value of BST: " + maxval); 
    } 
   void print(BSTNode root)
	{System.out.print("BST Tree Values: ");
		printing(root);
	}
	void printing(BSTNode root)
   {
		
       if (root != null) {
       	printing(root.left);
           System.out.print(root.key + " ");
           printing(root.right);
       }
   }
	public static void main(String[] args)
	{
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(10);
		 tree.insert(30);
		 tree.insert(50);
		 tree.insert(40);
	      tree.insert(110);
	   tree.insert(90);
		 tree.insert(120);
		
		 tree.min(tree.root);
			tree.max(tree.root);
			
			
			tree.print(tree.root);
	}
}
