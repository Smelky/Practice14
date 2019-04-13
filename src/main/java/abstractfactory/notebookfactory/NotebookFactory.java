package abstractfactory.notebookfactory;

import abstractfactory.Factory;
import abstractfactory.tabletfactory.Tablet;

public class NotebookFactory implements Factory {

    @Override
    public Notebook createNotebook(String typeOfNotebook) {
        if (typeOfNotebook != null) {
            switch (typeOfNotebook) {
                case "Apple":
                    return new Asus();
                case "Samsung":
                    return new Lenovo();
                default:
                    return null;
            }
        } else {
            return null;
        }
    }

    @Override
    public Tablet createTablet(String typeOfTablet) {
        return null;
    }
}
