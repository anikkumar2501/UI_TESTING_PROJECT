package javaProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThreadLearning implements Runnable{
    @Override
    public void run() {
        for(int i =1; i <= 10; i++){
            System.out.println(Thread.currentThread().getName()  +" -- "+i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class MainClass{
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new ThreadLearning());
        Thread t2 = new Thread(new ThreadLearning());
        t1.start();
        t1.join();
        System.out.println("t1 is Alive ? -- "+t1.isAlive());
        t2.start();
        System.out.println("t2 is Alive ? -- "+t2.isAlive());
    }
}

class User {

List<String> userList = Collections.synchronizedList(new ArrayList<>());

public synchronized String getUSer(int index){
   return userList.get(index);
}

public synchronized void addUser(String s){
    userList.add(s);
}

}