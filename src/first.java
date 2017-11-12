public class first {

    static class Student {
        // создаем поля класса//
        private String name;
        private String surname;
        private int birthYear;
        private String group;

        // создаем конструкторы для каждого набора вводимых параметров. ( они могут быть неполными )

         Student(String name) {
             this.name = name;
         }

          Student(String name, String surname) {
             this.name = name;
             this.surname = surname;
          }
          Student(String name, String surname, int birthYear){
             this.name = name;
             this.surname = surname;
             this.birthYear = birthYear;
          }

          Student(String name,String surname, int birthYear, String group) {
            this.name = name;
            this.surname = surname;
            this.birthYear = birthYear;
            this.group = group;
        }

        // метод,выводящий всю информацию о студенте//

                void information() {
                 System.out.println(this.name + " " + this.surname);
                 System.out.println("Год рождения: " + this.birthYear);
                 System.out.println("Группа: " + this.group);
            }

    }

    public static void main(String[] args) {
        Student student = new Student("Mr", "Nobody", 1978,"БИ-231");
        student.information();
    }
}
