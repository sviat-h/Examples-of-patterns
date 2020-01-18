package factoryMethod.example1.factory;

import factoryMethod.example1.buttons.Button;
import factoryMethod.example1.buttons.HtmlButton;

/**
 * HTML Dialog will produce HTML buttons.
 */
public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
