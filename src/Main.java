//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int result = getDaysInMonth(2,2020);
        System.out.println(result);
    }

    public static int getDaysInMonth(int month,int year){
        if(year < 1 || year > 9_999){
            return -1;
        }

        return switch (month) {
            case 1,3,5,7,8,10,12 -> 31;
            case 2 -> isLeapYear(year) ? 29 : 28;
            case 4,6,9,11 -> 30;
            default -> -1;
        };
    }

    public static boolean isLeapYear(int year){
        if(year < 1 || year > 9_999){
            return false;
        }

        if(year % 4 == 0 ){
            if(year % 100 !=0){
                return true;
            }else{
                return year % 400 == 0;
            }
        } else {
            return false;
        }
    }
}