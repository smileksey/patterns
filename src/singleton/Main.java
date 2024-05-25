package singleton;

public class Main {

    public static void main(String[] args) {
        SingletonLogger logger = SingletonLogger.getLogger();
        SingletonLogger logger2 = SingletonLogger.getLogger();

        logger.classLog(new String(), "новый объект String");

    }
}
