package proxy;

public class Main {

    public static void main(String[] args) {

        DbConnectionImpl dbConnectionImpl = new DbConnectionImpl();
        DbConnectionProxy proxy = new DbConnectionProxy(dbConnectionImpl);

        proxy.connect("clients");
    }
}
