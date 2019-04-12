package abstractfactory.notebookfactory;

import abstractfactory.Factory;
import abstractfactory.tabletfactory.Tablet;

public class NotebookFactory implements Factory {
    public Notebook createNotebook(String typeOfNotebook) {
        switch (typeOfNotebook) {
            case "Apple":
                return new Asus();
            case "Samsung":
                return new Lenovo();
            default:
                return null;
        }
    }

    @Override
    public Tablet createTablet(String typeOfTablet) {
        return null;
    }
}
