package by.epam.inner.Exeption;

  public class NonPositiveArgumentExeption extends  IllegalArgumentException {

     public NonPositiveArgumentExeption(int field, String buisness) {
        super("Ваше поле " + field + " " + "на действие " + buisness);
     }
  }
