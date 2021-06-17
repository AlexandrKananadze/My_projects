package LIST;

import java.util.*;

public  class MyArrayList { // конструктор
    private int size; // значение не присваивается чтобы не забивать память
    private int[] mass;
    private int m=2;

    public MyArrayList() {
        size = 0; // размер списка
        mass = new int[10]; // количество памяти
    }

    // реализация методов ArrayList
    public void add(int value) {
        if(size>=mass.length){
            skleika();
        }
        mass[size] = value;
        size++;
    }

    public int get(int index) {

        if (!(index < 0) && !(index > size)) {
            return mass[index];
        }
        else return 0;
    }

    //  @Override
    //  public Object set(int index, Object element) {
    //      return null;
    //  }


    // HW 1
    public void remove(int index) {
        if (index < 0 && index > size) {
            System.out.println("элемент вне диапазона");
        }
        for (int i = index; i < size; i++) {
            mass[i] = mass[i + 1];
        }
        size--;


    }

    //hw2
    public int indexOf(int value) {

        for (int i = 0; i < size; i++) {
            if (mass[i] == value) {
                return i;
            }
        }
       return 0;
    }
//
  //  hw 3
   public int lastIndexOf(int value) {
        int temp=0;
        for (int i=0; i<size;i++) {
            if(mass[i] == value) {
                temp=i;

            }
        }
       if(temp>0){
           return temp;
       }
      else return -1;
   }
//
  //  @Override
  //  public ListIterator listIterator() {
  //      return null;
  //  }
//
  //  @Override
  //  public ListIterator listIterator(int index) {
  //      return null;
  //  }
//
  //  hw4
    public int[] subList(int fromIndex, int toIndex) {
        int[] temp = new int[toIndex-fromIndex];
        int temp1=0;
        for (int i=fromIndex; i<toIndex; i++){
            temp[temp1]=mass[i];
                    temp1++;
        }
       return temp;
    }
//hw5
   public  int size () {
   return size;
  }
//
  //  hw6
    public boolean isEmpty() {
       return size ==0;
   }
//
  //
  //  public Iterator iterator() {
  //      return null;
  //  }
//
  //  @Override
  //  public Object[] toArray() {
  //      return new Object[0];
  //  }
//
  //  @Override
  //  public boolean add(Object o) {
  //      return false;
  //  }
//
  //  @Override
  //  public boolean remove(Object o) {
  //      return false;
  //  }
//
  //  @Override
  //  public boolean addAll(Collection c) {
  //      return false;
  //  }
//
  //  @Override
  //  public boolean addAll(int index, Collection c) {
  //      return false;
  //  }
//
  //  hw7
    public void clear() {

        for (int i=0; i<size; i++){
            mass[i]=0;

        }
        size=0;

    }
    public void skleika (){
        int [] tem = new int[mass.length*m];
        m++;
        System.arraycopy(mass,0,tem,0,10);
        mass=tem;


    }
//
  //  @Override
  //  public boolean retainAll(Collection c) {
  //      return false;
  //  }
//
  //  @Override
  //  public boolean removeAll(Collection c) {
  //      return false;
  //  }
//
  //  @Override
  //  public boolean containsAll(Collection c) {
  //      return false;
  //  }
//
  //  @Override
  //  public Object[] toArray(Object[] a) {
  //      return new Object[0];
  //  }

    public boolean contains(int value){
      for (int i=0; i< size; i++) {
          if (mass[i] == value) {
              return true;
          }
       }
      return false;

   }
   public void delete (int value) {

       for (int i=0; i<size; i++)  {
           if (i >value) {
               mass[i] = mass[i + 1];

           }
       }
       size--;
   }
}



