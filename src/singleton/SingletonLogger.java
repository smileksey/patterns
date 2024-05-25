package singleton;

import java.time.LocalDate;

public class SingletonLogger {

    private static SingletonLogger instance;

    private SingletonLogger() {}

    public static SingletonLogger getLogger() {
        if (instance == null) {
            instance = new SingletonLogger();
        }
        return instance;
    }

    public void classLog(Object obj, String info) {
        System.out.println(LocalDate.now() + " - " + obj.getClass().getSimpleName() + " - " + info);
    }


}
