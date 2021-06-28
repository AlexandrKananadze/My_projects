package by.epam.inner.Exeption;

  public class NegativeArgumentException extends  IllegalArgumentException {

     public NegativeArgumentException(int exeption) {
        super("byn.value < 0 you value is " + exeption);
     }

  }
