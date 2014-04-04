package com.liquidlab.javalab.defaultmethods;

/**
 * @Author tham
 */
public interface Pet {
    boolean canSleep();
    default boolean canBark() { return false; }
}
