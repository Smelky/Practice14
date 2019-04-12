package abstractfactory.tabletfactory;

import abstractfactory.Factory;
import abstractfactory.notebookfactory.Notebook;

public class TabletFactory implements Factory {

    public Tablet createTablet(String typeOfNotebook) {
        switch (typeOfNotebook) {
            case "Apple":
                return new Apple();
            case "Samsung":
                return new Samsung();
            default:
                return null;
        }
    }

    @Override
    public Notebook createNotebook(String typeOfNotebook) {
        return null;
    }
}
