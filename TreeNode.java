public class TreeNode{
  private int val;
  private TreeNode left;
  private TreeNode right;

  public TreeNode(){}

  public TreeNode(int val){
    this.val = val;
  }

  public TreeNode(int val, TreeNode left, TreeNode right){
    this.val = val;
    this.left = left;
    this.right = right;
  }

  public TreeNode invertTree(TreeNode root){
    if (root == null){
      return root;
    }
    if (root.left != null || root.right != null){
      TreeNode tmp = root.left;
      root.left = root.right;
      root.right = tmp;

      invertTree(root.left);
      invertTree(root.right);
    }
    return root;
  }

  public int maxDepth(TreeNode root) {
    if (root == null){
      return 0;
    }
    return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
  }

  // this is identical to maxDepth except that this method name makes more sense to me
  public int findHeight(TreeNode root){
    if (root == null){
      return 0;
    }
    return 1 + Math.max(findHeight(root.left), findHeight(root.right));
  }

  public boolean isBalanced(TreeNode root){
    // base case
    if (root == null){
      return true;
    }

    // a tree is balanced at every node iff
    // the difference in height between the left subtree and the right subtree is at most once
    // the subtrees are balanced themselves
    int leftHeight = findHeight(root.left);
    int rightHeight = findHeight(root.right);

    return Math.abs(leftHeight - rightHeight) <= 1 && isBalanced(root.left) && isBalanced(root.right);
  }

  public boolean isSameTree(TreeNode p, TreeNode q){
    if (p == null && q == null){
      return true;
    }
    if (p != null && q != null && p.val == q.val){
      return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
    return false;
  }
}
