package ch.teko.prg2.tag01.input.reptition.demo4.switchcase.simple;

public class SwitchDemo {

    public String nameOfMonth(int numberOfMonth) {
        String monthString;
        switch (numberOfMonth) {
            case 1:
                monthString = "January";
                break;
            case 2:
                monthString = "February";
                break;
            case 3:
                monthString = "March";
                break;
            case 4:
                monthString = "April";
                break;
            case 5:
                monthString = "May";
                break;
            case 6:
                monthString = "June";
                break;
            case 7:
                monthString = "July";
                break;
            case 8:
                monthString = "August";
                break;
            case 9:
                monthString = "September";
                break;
            case 10:
                monthString = "October";
                break;
            case 11:
                monthString = "November";
                break;
            case 12:
                monthString = "December";
                break;
            default:
                monthString = "Invalid month";
                break;
        }
        return monthString;
    }

    /*
     * Jedes break; Statement terminiert das switch statement. Der Code geht mit dem ersten Code nach dem switch-Block.
     * Das break; Statement wird benötigt, weil ohne, alle Statements nach dem matching case sequentiell ausgeführt werden,
     * ohne erneute Überprüfung des nächsten cases. Dies geschieht, bis zum nächsten break statement.
     *
     * Um das zu sehen, könnt ihr folgendes Beispiel ansehen. Zeile 66 - 72. Mehrere cases, die schlussendlich den "gleichen"
     * Code ausführen.
     *
     * Was passiert, wenn man einen break; vergisst, kann man auch sehen, wenn man z.B. im oberen Beispiel ein break; auskommentiert.
     * Es wird einfach nach dem ersten case match, sequentiell code ausgeführt ohne erneute case Überprüfung.
     */
    public int numberOfDays(int numberOfMonth, int year) {
        int numDays = 0;

        switch (numberOfMonth) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numDays = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numDays = 30;
                break;
            case 2:
                if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0))
                    numDays = 29;
                else
                    numDays = 28;
                break;
            default:
                System.out.println("Invalid month.");
                break;
        }
        return numDays;
    }

    public static void main(String[] args) {
        SwitchDemo demo = new SwitchDemo();
        System.out.println(demo.nameOfMonth(4));
        System.out.println(demo.numberOfDays(2, 2000));
    }
}
