package p15_composite;

import java.util.ArrayList;
import java.util.List;

public class Branch implements Tree {

    private List<Tree> trees = new ArrayList<Tree>();

    private String name;

    public Branch(String name) {
        this.name = name;
    }

    @Override
    public void add(Tree tree) {
        trees.add(tree);
    }

    @Override
    public void remove(Tree tree) {
        trees.remove(tree);
    }

    @Override
    public void operation(double a, double b) {
        System.out.println("运行："+name);
        for (Tree tree:trees){
            tree.operation(a,b);
        }
    }
}
