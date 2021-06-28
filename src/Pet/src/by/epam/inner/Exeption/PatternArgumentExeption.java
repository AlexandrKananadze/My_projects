package by.epam.inner.Exeption;

  public class PatternArgumentExeption extends IllegalArgumentException {

    public PatternArgumentExeption(String string) {
            super("Неверный формат " + string);
    }

  }

