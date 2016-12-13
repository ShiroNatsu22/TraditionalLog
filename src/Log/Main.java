package Log;

import java.util.List;

/**
 * Created by Joshua on 13/12/2016.
 */


public class Main {
    public static Log log = new LogFile();

    public static void main(String[] args) {

        //Delegacio de responsabilitats
        LogFile.getInstance();
        LogFile.getInstance().setLogError(true);
        LogFile.getInstance().setLogInfo(true);
        LogFile.getInstance().setLogWarn(true);

        List<String> list = null;

        if (list == null) LogFile.getInstance().logWarn("LLista nula");

        try {
            LogFile.getInstance().logInfo("Anem a afegir un element.");
            list.add("Element");
        } catch (NullPointerException npe) {
            LogFile.getInstance().logError(" excepcio:" + npe.getMessage());
        }

    }
}
