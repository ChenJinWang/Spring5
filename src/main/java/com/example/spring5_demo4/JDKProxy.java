package com.example.spring5_demo4;

import com.example.spring5_demo4.dao.UserDao;
import com.example.spring5_demo4.dao.UserDaoImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class JDKProxy {
//    public static void main(String[] args) {
//        //创建接口实现类代理对象
//        Class[] interfaces = {UserDao.class};
//        // @Override
//        // public Object invoke(Object proxy, Method method, Object[] args)throws Throwable {
//        // return null;
//        // }
//        // });
//        UserDaoImpl userDao = new UserDaoImpl();
//        UserDao dao = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UserDaoProxy(userDao));
//        int result = dao.add(1, 2);
//        System.out.println("result:" + result);
//    }
    public static void main(String[] args) {
        //创建接口实现类代理对象
        Class[] interfaces = {UserDao.class};

        UserDaoImpl userDao = new UserDaoImpl();
        UserDao dao = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UserDaoProxy(userDao)); //返回接口的代理类实例
        int result = dao.add(1,1);
        System.out.println(result);
    }

}

    //创建代理对象
    class UserDaoProxy implements InvocationHandler{

        //1 把创建的是谁的代理对象，把谁传递过来
        //有参数构造传递
        private Object obj;

        public UserDaoProxy(Object obj) {
            this.obj = obj;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("原方法执行之前" + method.getName() + "传递的参数" + Arrays.toString(args));
            //原方法增强
            Object res = method.invoke(obj, args);
            System.out.println("原方法执行之后" + obj);
            return res;
        }
    }

//    //创建代理对象代码
//    class UserDaoProxy implements InvocationHandler {
//        //1 把创建的是谁的代理对象，把谁传递过来
//        //有参数构造传递
//        private Object obj;
//
//        public UserDaoProxy(Object obj) {
//            this.obj = obj;
//        }
//
//        //增强的逻辑
//        @Override
//        public Object invoke(Object proxy, Method method, Object[] args) throws
//                Throwable {
//            //方法之前
//            System.out.println("方法之前执行...." + method.getName() + " :传递的参 数..." + Arrays.toString(args));
//            //被增强的方法执行
//            Object res = method.invoke(obj, args);
//            //方法之后
//            System.out.println("方法之后执行...." + obj);
//            return res;
//        }
//    }

