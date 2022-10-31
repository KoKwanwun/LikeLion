package com.springboot.springbootcoreguide.parser;

public interface Parser<T> {
    T parse(String str);
}
