package com.us.improve.designpatterns.proxy.retry;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName RetrySupport
 * @Desciption TODO
 * @Author loren
 * @Date 2019/5/30 11:02 AM
 * @Version 1.0
 **/
public class RetrySupport implements InvocationHandler {

    private Object target;

    private int maxRetryTimes;

    private long retryInterval;

    private RetrySupport(Builder builder) {
        this.target = builder.target;
        this.maxRetryTimes = builder.maxRetryTimes;
        this.retryInterval = builder.retryInterval;
    }

    public Object getProxy() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        boolean success = false;
        int rt = 1;
        for (; rt <= this.maxRetryTimes; rt++) {
            try {
                Object returnValue = method.invoke(target, args);
                success = true;
                return returnValue;
            } catch (Exception e) {
                System.out.println("exception occur...");
                if (rt + 1 <= this.maxRetryTimes && this.retryInterval > 0) {
                    TimeUnit.MILLISECONDS.sleep(this.retryInterval);
                }
            }
        }

        if (!success) {
            throw new RuntimeException("all retry fail...");
        }

        return null;
    }

    public static class Builder {

        private static final int DEFAULT_MAX_RETRY_TIMES = 3;

        private static final int DEFAULT_RETRY_INTERVAL = 2000;

        private Object target;

        private int maxRetryTimes = DEFAULT_MAX_RETRY_TIMES;

        private long retryInterval = DEFAULT_RETRY_INTERVAL;

        public RetrySupport build() {
            return new RetrySupport(this);
        }

        public Builder target(Object target) {
            Class[] interfaces = target.getClass().getInterfaces();
            if (interfaces == null || interfaces.length <= 0) {
                throw new RuntimeException("retry target must implement an interface...");
            }
            this.target = target;
            return this;
        }

        public Builder maxRetryTimes(int maxRetryTimes) {
            this.maxRetryTimes = maxRetryTimes <= 0 ? DEFAULT_MAX_RETRY_TIMES : maxRetryTimes;
            return this;
        }

        public Builder retryInterval(long retryInterval) {
            this.retryInterval = retryInterval < 0 ? DEFAULT_RETRY_INTERVAL : retryInterval;
            return this;
        }

    }

}
