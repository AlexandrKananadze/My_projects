package by.epam.inner.Exeption;

  public class OutOfRangeExeption extends IllegalArgumentException {

     public OutOfRangeExeption(int coins, String buisness) {
        super("Ваше поле " + coins + " " + "на действие " + buisness);
     }
     public OutOfRangeExeption(long value, String buisness) {
        super("Ваше поле " + value + " " + "на действие " + buisness);
     }

  }
