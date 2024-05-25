package proxy;

public class DbConnectionProxy implements DbConnection {

    private final DbConnectionImpl dbConnectionImpl;

    public DbConnectionProxy(DbConnectionImpl dbConnectionImpl) {
        this.dbConnectionImpl = dbConnectionImpl;
    }

    @Override
    public void connect(String dbName) {

        dbConnectionImpl.checkDbName(dbName);
        String url = "localhost:5432/" + dbName;

        dbConnectionImpl.connect(url);
    }
}
