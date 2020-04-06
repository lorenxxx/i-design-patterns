package com.us.improve.designpatterns.builder;

import lombok.Getter;

/**
 * @ClassName ResourcePoolConfig
 * @Desciption 建造者模式实现
 * @Author loren
 * @Date 2020/4/6 7:47 PM
 * @Version 1.0
 **/
@Getter
public class ResourcePoolConfig {

    private String name;

    private int maxTotal;

    private int maxIdle;

    private int minIdle;

    private ResourcePoolConfig(Builder builder) {
        this.name = builder.name;
        this.maxTotal = builder.maxTotal;
        this.maxIdle = builder.maxIdle;
        this.minIdle = builder.minIdle;
    }

    public static class Builder {

        private static final int DEFAULT_MAX_TOTAL = 8;

        private static final int DEFAULT_MAX_IDLE = 8;

        private static final int DEFAULT_MIN_IDLE = 0;

        private String name;

        private int maxTotal = DEFAULT_MAX_TOTAL;

        private int maxIdle = DEFAULT_MAX_IDLE;

        private int minIdle = DEFAULT_MIN_IDLE;

        public ResourcePoolConfig build() {
            // 校验逻辑放到这里来做，包括必填项校验、依赖关系校验、约束条件校验等

            if (name == null || name.length() <= 0) {
                throw new IllegalArgumentException("...");
            }
            if (maxIdle > maxTotal) {
                throw new IllegalArgumentException("...");
            }
            if (minIdle > maxTotal || minIdle > maxIdle) {
                throw new IllegalArgumentException("...");
            }

            return new ResourcePoolConfig(this);
        }

        public Builder name(String name) {
            if (name == null || name.length() <= 0) {
                throw new IllegalArgumentException("...");
            }
            this.name = name;
            return this;
        }

        public Builder maxTotal(int maxTotal) {
            if (maxTotal <= 0) {
                throw new IllegalArgumentException("...");
            }
            this.maxTotal = maxTotal;
            return this;
        }

        public Builder maxIdle(int maxIdle) {
            if (maxIdle < 0) {
                throw new IllegalArgumentException("...");
            }
            this.maxIdle = maxIdle;
            return this;
        }

        public Builder minIdle(int minIdle) {
            if (minIdle < 0) {
                throw new IllegalArgumentException("...");
            }
            this.minIdle = minIdle;
            return this;
        }
    }

}
