package P20_chain_of_responsibility;

public class ErrorStateApp {
    public static void main(String[] args) {
        ErrorStateApp errorStateApp = new ErrorStateApp();
        int grade = 55;
        errorStateApp.checkGrade(grade);
    }

    private void checkGrade(int grade){
        if (grade>=40){
            System.out.println("结果大于等于40");
        }else if (grade>=60){
            System.out.println("结果大于等于60");
        }else if(grade>=50){
            System.out.println("结果大于等于50");
        }
    }
}
