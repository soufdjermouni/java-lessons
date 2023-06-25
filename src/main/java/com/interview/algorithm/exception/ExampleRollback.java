package com.interview.algorithm.exception;


public class ExampleRollback {
}
class A {
    void  a(Service s, Connection c) throws Exception {
       try {
           s.setConnection(c);
           s.execute();
           c.commit();
        }catch (Exception e){
           c.rollback();
           throw e;
       }finally {
           c.close();
       }
    }
}
interface Service{
    void execute () throws Exception;
    void setConnection (Connection c);
}
interface Connection{
    void commit();
    void rollback();
    void close();
}