package Implementation;

public class Main {
    public static void main(String[] args) {
        TreeNode a=new TreeNode(5);
        TreeNode b=new TreeNode(41);
        TreeNode c=new TreeNode(53);
        TreeNode d=new TreeNode(0);
        TreeNode e=new TreeNode(16);
        TreeNode f=new TreeNode(11);
        TreeNode g=new TreeNode(27);
        a.left=b;
        b.left=c;
        b.right=d;
        a.right=e;
        e.left=f;
        e.right=g;
        Display obj=new Display();
        obj.display(a);
        Sum s=new Sum();
        System.out.println();
        System.out.println(s.sum(a));

        Product p=new Product();
        System.out.println(p.product(a));

        Maximum m=new Maximum();
        System.out.println(m.max(a));

        Size size=new Size();
        System.out.println(size.size(a));

        Levels l=new Levels();
        System.out.println(l.lev(a));


}
}

