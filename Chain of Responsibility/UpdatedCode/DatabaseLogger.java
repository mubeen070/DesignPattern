package UpdatedCode;


class DatabaseLogger extends AbstractLogger {

    public DatabaseLogger(int level){
       this.level = level;
    }
 
    @Override
    protected void write(String message) {
       System.out.println("Database::Logger: " + message);
    }
 }