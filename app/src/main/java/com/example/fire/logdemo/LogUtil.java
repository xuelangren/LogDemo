package com.example.fire.logdemo;

/**
 * Created by fire on 2017/10/17.
 */

public class LogUtil {
    private LogUtil logUtil;
      public  static final int DUBUG = 0;
      public  static final int INFO = 0;
      public  static final int ERROR = 0;
      public  static final int NOTHING = 0;
    private LogUtil(){};
    private LogUtil getInstance(){
        if(logUtil ==null){
        synchronized (LogUtil.class) {
            if (logUtil == null) {
                logUtil = new LogUtil();
            }
        }}
        return logUtil;
    }

     public int level = DUBUG;
    public void debug(String msg){
        if(level>=DUBUG){
            System.out.print(msg);
        }

    }


    public void info(String msg){
        if(level>=INFO){
            System.out.print(msg);
        }

    }
    public void error(String msg){
        if(level>=ERROR){
            System.out.print(msg);
        }

    }
    public void nothing(String msg){
        if(level>=NOTHING){
            System.out.print(msg);
        }

    }

}
