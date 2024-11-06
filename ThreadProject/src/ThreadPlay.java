//ThreadPlay.java

import java.lang.Thread;
import java.lang.System;
import java.lang.Math;
import java.lang.InterruptedException;
import javax.swing.*;

class ThreadPlay {
    
    
 private static JTextArea ta;
 private static JFrame fr;
 
 
 public static void main(String args[]) {
  fr = new JFrame("Synchronized Thread");
	fr.setBounds(120,120,300,300);
	JPanel jp = new JPanel();
	ta = new JTextArea(9,15);
	jp.add(ta);
	fr.setContentPane(jp);
	fr.setVisible(true);
  MyThread thread1 = new MyThread("thread1: ");
  MyThread thread2 = new MyThread("thread2: ");
  thread1.start();
  thread2.start();
  boolean t1Alive = true;
  boolean t2Alive = true;
  do {
   if(t1Alive && !thread1.isAlive()){
    t1Alive = false;
    ta.append("Thread 1 is dead.\n");
   }
   if(t2Alive && !thread2.isAlive()){
    t2Alive = false;
    ta.append("Thread 2 is dead.\n");
   }
  }while(t1Alive || t2Alive);
 }

 static class MyThread extends Thread {
 static String message[] = {"First\n","Second\n","Third\n","Fourth\n",
  "Fifth\n","Sixth\n"};
 public MyThread(String id) {
  super(id);
 }
 
 
 
 public void run() {
  SynchronizedOutput.displayList(getName(),message);
 }
 void randomWait(){
  try {
   sleep((long)(3000*Math.random()));
  }catch (InterruptedException x){
   ta.append("Interrupted!\n");
  }
 }
}
static class SynchronizedOutput {
 public static  void displayList(String name,String list[]) {
  for(int i=0;i<list.length;++i) {
   MyThread t = (MyThread) Thread.currentThread();
   t.randomWait();
   ta.append(name+list[i]);
  }
 }
}
}