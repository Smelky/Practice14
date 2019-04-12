package abstractfactory;

import abstractfactory.notebookfactory.NotebookFactory;
import abstractfactory.tabletfactory.TabletFactory;

public class AbstractFactory {
    public Factory createFactory(String typeOfFactory) {
        switch (typeOfFactory) {
            case "Notebook":
                return new NotebookFactory();
            case "Tablet":
                return new TabletFactory();
            default:
                return null;
        }
    }
}
