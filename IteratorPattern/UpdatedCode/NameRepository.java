package UpdatedCode;

import java.util.Arrays;
import java.util.Comparator;

public class NameRepository implements Container {
   public Student students[] = {
         new Student("001", "Robert", "Male", "1234567890"),
         new Student("002", "John", "Male", "2345678901"),
         new Student("003", "Julie", "Female", "3456789012"),
         new Student("004", "Lora", "Female", "4567890123")
   };

   @Override
   public Iterator getIterator() {
      return new NameIterator();
   }

   private class NameIterator implements Iterator {
      int index;

      @Override
      public boolean hasNext() {
         return index < students.length;
      }

      @Override
      public Object next() {
         if (this.hasNext()) {
            return students[index++];
         }
         return null;
      }

      public boolean hasPrevious() {
         return index > 0;
      }

      public Object previous() {
         if (this.hasPrevious()) {
            return students[--index];
         }
         return null;
      }

      public void moveToLast() {
         index = students.length - 1;
      }

      public void moveToFirst() {
         index = 0;
      }
   }

   public void printStudentsWithNameStartingFrom(String anyStartingValue) {
      NameIterator iterator = new NameIterator();
      iterator.moveToLast();
      while (iterator.hasPrevious()) {
         Student student = (Student) iterator.previous();
         if (student.getName().startsWith(anyStartingValue)) {
            System.out.println(student);
         }
      }
   }

   public void printAllStudents() {
      Arrays.sort(students, Comparator.comparing(Student::getName));
      for (Student student : students) {
         System.out.println(student);
      }
   }
}
