package factoryMethod.example1.factory;

import factoryMethod.example1.buttons.Button;
import factoryMethod.example1.buttons.WindowsButton;

/**
 * Windows Dialog will produce Windows buttons.
 */
public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
