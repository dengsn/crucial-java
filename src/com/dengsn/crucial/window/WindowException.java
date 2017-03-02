package com.dengsn.crucial.window;

import com.dengsn.crucial.GameException;

public class WindowException extends GameException
{
  public WindowException(String message) { 
    super(message); 
  }
  public WindowException(String message, Throwable cause) {
    super(message,cause); 
  }
}
