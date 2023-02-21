package com.hillel.service;

public interface Cache {

    void createCache ();

    boolean post(String cache, String key, Object o);

    Object get (String cache, String key);

    boolean clear();

    boolean clear(String cache);

    boolean isCacheExist(String cache);

}
