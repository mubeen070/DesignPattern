public class Configuration {
    private static Configuration instance;
    private String config;

    private Configuration() {
        config = "Default Configuration";
    }

    public static Configuration getInstance() {
        if (instance == null) {
            instance = new Configuration();
        }
        return instance;
    }

    public String getConfig() {
        return config;
    }
}
