package p15_composite;

public class App {
    public static void main(String[] args) {
        double a = 5.0;
        double b = 2.5;
        Branch root = new Branch("算法根节点");
//        设置加减法运算的树枝节点和具体算法的树叶节点
        Branch addMinusBranch = new Branch("加减法运算");
        addMinusBranch.add(new AddLeaf());
        addMinusBranch.add(new MinusLeaf());
        root.add(addMinusBranch);
//        设置乘除法法运算的树枝节点和具体算法的树叶节点
        Branch multiDivisionBranch = new Branch("乘除法运算");
        multiDivisionBranch.add(new MultyLeaf());
        multiDivisionBranch.add(new DivisionLeaf());
        root.add(multiDivisionBranch);
//        从根开始执行（遍历所有的算法）
        root.operation(a, b);

        System.out.println("----");
//        从加减法树枝开始执行（只有加减法
        addMinusBranch.operation(a, b);
    }

}
