package Log;

/**
 * Created by Joshua on 14/12/2016.
 */
public class Singleton {

        private static Singleton instancia = new Singleton();

        public static Singleton getInstance() {
            if (instancia == null) createInstance();
            return instancia;
        }

        private synchronized static void createInstance(){
            if (instancia == null){
                instancia = new Singleton();
            }
        }
    }

