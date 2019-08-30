package p23_interpreter;

public class NormalPassword implements Password {
    @Override
    public void encryption(Context context) {
        if ("".equals(context.getSource())){
            System.out.println("明文为空，无法加密");
        }else {
            context.setTarget("常规加密");
        }
    }
}
