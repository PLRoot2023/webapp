package com.pg.admin.config.dynamic;

public class DataSourceKeyHolder {

    private final static ThreadLocal<String> dataSourceKeyHolder = new ThreadLocal<>();

    static void set(String key) {
        dataSourceKeyHolder.set(key);
    }

    static String get() {
        return dataSourceKeyHolder.get();
    }

    static void clear() {
        dataSourceKeyHolder.remove();
    }
}
