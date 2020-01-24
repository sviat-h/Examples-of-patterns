package factoryMethod.example1;

import factoryMethod.example1.factory.Dialog;
import factoryMethod.example1.factory.HtmlDialog;
import factoryMethod.example1.factory.WindowsDialog;

public class Demo {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    private static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    /**
     * All of the client code should work with factories and products through
     * abstract interfaces. This way it does not care which factory it works
     * with and what kind of product it returns.
     */

    private static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
