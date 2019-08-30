package p23_interpreter;

public class EasyPassword implements Password {
    @Override
    public void encryption(Context context) {
        if ("".equals(context.getSource())){
            System.out.println("明文为空，无法加密");
        }else {
            context.setTarget("简单加密");
        }
    }
}
