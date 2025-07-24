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
}
