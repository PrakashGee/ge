public class Numeric {

    public static void main(String[] args) {

        String s = "123";
        boolean n = true;

        try {
            Double num = Double.parseDouble(s);
        } catch (NumberFormatException e) {
            n = false;
        }

        if(n)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
