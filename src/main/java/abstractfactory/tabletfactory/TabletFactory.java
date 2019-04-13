package abstractfactory.tabletfactory;

import abstractfactory.Factory;
import abstractfactory.notebookfactory.Notebook;

public class TabletFactory implements Factory {

    @Override
    public Tablet createTablet(String typeOfNotebook) {
        if (typeOfNotebook != null) {
            switch (typeOfNotebook) {
                case "Apple":
                    return new Apple();
                case "Samsung":
                    return new Samsung();
                default:
                    return null;
            }
        } else {
            return null;
        }
    }

    @Override
    public Notebook createNotebook(String typeOfNotebook) {
        return null;
    }
}
