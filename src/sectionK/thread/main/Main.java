/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 23/10/20
 *  Time: 10:28 AM
 *  File Name : Main.java
 * */
package sectionK.thread.main;

public class Main {
    public static void main(String[] args) {
        RunnableThread thread1 = new RunnableThread();
        thread1.getThread().start();
    }
}
