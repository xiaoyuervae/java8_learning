package com.xiaoyuervae.java8_learning.responsebilityChainMode;

/**
 * User: guanchun.yu
 * Date: 2018/5/6
 * Time: 下午5:44
 */
public abstract class ProcessingObject<T> {

    protected ProcessingObject<T> successor;

    public void setSuccessor(ProcessingObject<T> successor) {
        this.successor = successor;
    }

    public T handle(T input) {
        T r = handleWork(input);
        if (successor != null) {
            return successor.handle(r);
        }
        return r;
    }

    abstract protected T handleWork(T input);
}
