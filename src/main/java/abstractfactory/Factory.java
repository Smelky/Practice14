package abstractfactory;

import abstractfactory.notebookfactory.Notebook;
import abstractfactory.tabletfactory.Tablet;

public interface Factory {
    Notebook createNotebook(String typeOfNotebook);

    Tablet createTablet(String typeOfTablet);
}
