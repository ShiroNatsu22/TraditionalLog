package Log;

import java.util.List;

/**
 * Created by Joshua on 13/12/2016.
 */


public class Main {

    public static void main(String[] args) {

        //Delegacio de responsabilitats
        LogFile.ThreadInstance();
        LogFile.ThreadInstance().setLogError(true);
        LogFile.ThreadInstance().setLogInfo(true);
        LogFile.ThreadInstance().setLogWarn(true);

        List<String> list = null;

        if (list == null) LogFile.ThreadInstance().logWarn("Llista nula");

        try {
            LogFile.ThreadInstance().logInfo("Anem a afegir un element.");
            list.add("Element");
        } catch (NullPointerException npe) {
            LogFile.ThreadInstance().logError(" excepcio:" + npe.getMessage());
        }

    }
}
