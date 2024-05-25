package proxy;

import java.util.Arrays;
import java.util.List;

public class DbConnectionImpl implements DbConnection {

    private final List<String> dbNames = Arrays.asList("clients", "employees", "contractors");

    public void checkDbName(String dbName) {

        if (!dbNames.contains(dbName)) {
            throw new IllegalArgumentException("Invalid db name: " + dbName);
        }
    }

    @Override
    public void connect(String dbUrl) {
        System.out.println("Connecting to " + dbUrl);
    }
}
