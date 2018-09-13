package org.apache.catalina.startup.myLearn;

import com.alibaba.fastjson.JSON;
import org.apache.catalina.startup.Bootstrap;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class MyThread extends Thread {

    public static List<Object> infos = new ArrayList<>();

    public static void addInfo(Object info) {
        infos.add(info);
    }

    int count = 0;

    @Override
    public void run() {
        System.err.printf("my thread start .... [%d]\n" , count++);
        try {
            this.sleep(10000L);
            if (infos.size() > 0) {
               // infos.forEach(e -> getObjToString(e));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    //打印所有属性
    public static Object getObjToString(Object obj) {
        if (obj != null) {
            try {
                Class cls = obj.getClass();
                if (cls.getPackage().getName().startsWith("org.apache")) {
                    //如果,在包 "org.apache下的类",方法返回不为空,递归调用
                    Field[] fields = cls.getDeclaredFields();
                    if (fields != null) {
                        for (Field field : fields) {
                            try {
                                System.err.printf("%s\n" , JSON.toJSONString(field));
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    }
                } else {
                    //否则直接打印
                    System.err.printf("info:%s\n" , JSON.toJSONString(obj));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }


}
