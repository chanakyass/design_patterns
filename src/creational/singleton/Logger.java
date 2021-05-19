package creational.singleton;

import java.io.*;

/*
Singleton pattern is used when only single instance of a class is required to be used by all dependent instances to avoid resource burden.
It is helpful to act as global instance that has to be common for all dependent instances.
For making it thread safe we can use synchronized methods ot synchronized blocks as shown below.

1) Problem with Reflection - Using reflection we can get the constructor of a singleton class (Singleton.class.getConstructors())
and make it accessible even though it is private by using setAccessible and then we can create as many instances as we want

Solution: using enums. (Bad idea)

2) Problem with Serialization - If object is serialized and stored as text and then deserialized new instance is created.

Solution: Use readResolve() method
    protected Object readResolve()
    {
        return instance;
    }

3) Cloning is a concept to create duplicate objects. Using clone we can create copy of object. Suppose, we ceate clone of a singleton object,
then it wil create a copy that is there are two instances of a singleton class, hence the class is no more singleton.

Solution: Override clone method of object for that class and throw CloneNotSupportedException
@Override
  protected Object clone() throws CloneNotSupportedException
  {
    throw new CloneNotSupportedException();
  }
 */

public class Logger {
    private static Logger logger;
    private static DataOutputStream outputStream;
    private static ByteArrayOutputStream byteArrayOutputStream;
    private Logger(){

    }
    public synchronized static Logger getSingletonLogger(){
        if(logger == null){
            logger =  new Logger();
        }
        return logger;
    }

    public static Logger getSingletonUsingBlock(){
        if(logger == null){
            synchronized (Logger.class){
                if(logger == null) {
                    logger = new Logger();
                }
            }
        }
        return logger;
    }

    private static DataOutputStream getSingletonDataOutputStream(){
        if(outputStream == null){
            synchronized (Logger.class) {
                if(outputStream == null) {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    outputStream = new DataOutputStream(byteArrayOutputStream);
                }
            }
        }
        return outputStream;
    }

    public void logOutput(String content) {
        try {
            if(!content.endsWith("\n"))
            {
                content += "\n";
            }
            getSingletonDataOutputStream().writeBytes(content);
        }
        catch (IOException exception){
            exception.printStackTrace();
        }
    }

    public String getLogs(){
        if(byteArrayOutputStream != null)
            return byteArrayOutputStream.toString();
        return "No Logs";

    }
}


class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getSingletonLogger();
        logger.logOutput("Hello!");
        logger.logOutput("How are you");
        System.out.println(logger.getLogs());

    }
}
