package org.jboss.as.quickstarts.ejb.remote.stateful;
 
/**
 * @author Jaikiran Pai
 */
public interface RemoteCounter {
    void increment();
    void decrement();
    int getCount();
}