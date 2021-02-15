/*
 * Name: Hector
 * CSC2340 - Object-Oriented Programming (Java)
 * Prof. Fontanez
 * Assignment: [i.e. Homework #1, Problem 2.3]
 * Date/Time: Feb 11, 2021: 1:07:06 AM
 */
package demo;

import java.util.HashSet;
import java.util.Set;

public class SetSynchro implements Runnable{
  private Set<Integer> numSet;
  private int value = 1;
  public SetSynchro(Set<Integer> numSet){
    this.numSet = numSet;
  }
  
  public static void main(String[] args) {
    Set<Integer> numSet = new HashSet<>();
    /// 4 threads
    Thread t1 = new Thread(new SetSynchro(numSet));
    Thread t2 = new Thread(new SetSynchro(numSet));
    Thread t3 = new Thread(new SetSynchro(numSet));
    Thread t4 = new Thread(new SetSynchro(numSet));
    Thread t5 = new Thread(new SetSynchro(numSet));
    Thread t6 = new Thread(new SetSynchro(numSet));
    Thread t7 = new Thread(new SetSynchro(numSet));
    Thread t8 = new Thread(new SetSynchro(numSet));
    Thread t9 = new Thread(new SetSynchro(numSet));
    Thread t10 = new Thread(new SetSynchro(numSet));
        
    t1.start();
    t2.start();
    t3.start();
    t4.start();
    t5.start();
    t6.start();
    t7.start();
    t8.start();
    t9.start();
    t10.start();
        
    try {
      t1.join();
      t2.join();
      t3.join();
      t4.join();
      t5.join();
      t6.join();
      t7.join();
      t8.join();
      t9.join();
      t10.join();
    } catch (InterruptedException e) {    
      e.printStackTrace();
    }
    System.out.println("Size of Set is " + numSet.size());
  }

  @Override
  public void run() {
    System.out.println("in run method" + Thread.currentThread().getName());
    
    for(int i = 0; i < 10; i++){
      // adding thread name to make element unique
      numSet.add(value);
      System.out.println("set size: " + numSet.size());
      try {
        // delay to verify thread interference
        Thread.sleep(500);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}