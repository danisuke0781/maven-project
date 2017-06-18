package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
    * @param someone placeholder for a persons name
    * @return greeting string
    */
  public final String greet(final String someone) {
    return String.format("Hello, and welcome to this demo %s!", someone);
  }
}
