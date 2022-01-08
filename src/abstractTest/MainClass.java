package abstractTest;

public class MainClass {
    public static void main(String[] atgs) {
       /* ExampleAbstract x = new ExampleAbstract();
        x.method2();*/

        String[] x = new String[4];
        x[0] ="!@312";
        x[3] ="asdasd";

        String[] y = sortByNull(x);
        y.toString();
    }

    private static String[] sortByNull(String[] urls) {
        String[] newArray = new String[urls.length];
        for (int i = 0; i < urls.length; i++) {
            if (urls[i] == null) {
                for (int j = i; j < urls.length; j++) {
                    if (urls[j] != null) {
                        newArray[i] = urls[i];
                        break;
                    }

                }
            } else {
                newArray[i] = urls[i];
            }

        }
        return newArray;
    }
}