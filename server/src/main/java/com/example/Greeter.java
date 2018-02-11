/**
 * This is package name.
 */
package com.example;

/**
 * This is a class.
 * @author HP
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
   * This method format a string.
   * @param someone name of the person
   * @return greeting string
   */
  public final String greet(final String someone) {
    return String.format("la vie est belle- Hello, %s!", someone);
  }
}

