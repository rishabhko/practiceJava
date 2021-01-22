//import java.util.LinkedList;
//import java.util.Queue;
//
//public class TreePrac {
////    public static void main(String[] args) {
//
//    public static void main(String[] args) {
//        TreeNode<Integer> a=new TreeNode<>(10);
//        TreeNode<Integer> b=new TreeNode<>(20);
//        TreeNode<Integer> c=new TreeNode<>(30);
//        TreeNode<Integer> d=new TreeNode<>(40);
//        TreeNode<Integer> e=new TreeNode<>(50);
//        TreeNode<Integer> f=new TreeNode<>(60);
//        TreeNode<Integer> g=new TreeNode<>(70);
//        a.children.add(b);
//        a.children.add(c);
//        a.children.add(d);
//        b.children.add(e);
//        c.children.add(f);
//        c.children.add(g);
//
//        replaceWithDepthValue(a);
//        printTree(a);
//
//
////        System.out.println(countLeafNodes(a));
//
//
//    }
//    public static void printTree(TreeNode<Integer> root)
//    {
//        if (root==null)
//            return;
//        System.out.println(root.data);
//        for (int i=0; i<root.children.size();i++)
//        {
//            printTree(root.children.get(i));
//        }
//    }
//
//    public static void replaceWithDepthValue(TreeNode<Integer> root){
//
//        // Write your code here
//        Queue<TreeNode<Integer>> queue= new LinkedList<>();
//        Queue<TreeNode<Integer>> level= new LinkedList<>();
//
//
//        if (root==null)
//            return;
//
//        int i=0;
//
//        queue.add(root);
//        level.add(root);
//
//        while(queue.size()>0)
//        {
//            TreeNode<Integer> node=queue.poll();
//            node.data=i;
//            for(int j=0;j<node.children.size();j++)
//            {
//                queue.add(node.children.get(j));
//                if (j==node.children.size()-1)
//                {
//                    level.add(node.children.get(j));
//                }
//
//            }
//
//            if(level.peek()==node)
//            {i++;
//            level.poll();}
//        }
//
//
//    }
//
//
//
//
//    public static int countLeafNodes(TreeNode<Integer> root){
//
//        // Write your code here\
//
//        return count(root,0);
//
//
//
//    }
//
//
//    public static int count(TreeNode<Integer> root, int num)
//    {
//        if (root.children.size()<1)
//        {
//            return ++num;
//        }
//        for (int i=0; i<root.children.size();i++)
//        {
//            num = count(root.children.get(i),num);
//        }
//
//
//    }
//
//
//
//}
//
//
//
//
//
