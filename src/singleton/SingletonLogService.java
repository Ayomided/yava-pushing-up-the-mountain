package singleton;

public class SingletonLogService {
    private static SingletonLogService instance;
    private String message;

//    private SingletonLogService() {}

    private SingletonLogService(String message){
        this.message = message;
    }

    public static SingletonLogService getInstance(){
        if (instance == null){
            synchronized (SingletonLogService.class){
                if (instance == null){
                    instance = new SingletonLogService("Default Message");
                }
            }
        }
        return instance;
    }

    public void setInstance(String message){
        this.message = message;
    }

    public void getMessage(){
        System.out.println(message);
    }

    public static void main(String[] args) {
        SingletonLogService log = SingletonLogService.getInstance();
        log.setInstance("Hello World");
        SingletonLogService log2 = SingletonLogService.getInstance();
        log.getMessage();
        log2.getMessage();
        System.out.println(log == log2);
    }
}
