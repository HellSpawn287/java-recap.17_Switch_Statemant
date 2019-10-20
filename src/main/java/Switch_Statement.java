public class Switch_Statement {

    public static void main(String[] args) {

        char charValue = 'R';
        switch (charValue) {
            case 'A':
                System.out.println("A");
                break;
            case 'B':
                System.out.println("B");
                break;
            case 'C':
                System.out.println("C");
                break;
            case 'D':
                System.out.println("D");
                break;
            case 'E':
                System.out.println("E");
                break;
            default:
                System.out.println("Not found");
                break;
        }


        String month = "January";
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "february":
                System.out.println("Feb");
                break;
            case "march":
                System.out.println("March");
                break;
            default:
                System.out.println("THe name of month is " + month.toUpperCase());
        }

    }
}
