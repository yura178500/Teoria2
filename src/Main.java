import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        //Напишите методы Equals and HashCode для класса Student, который состоит из полей String name и int age
        class Student {
            int age;
            String name;

            public int getAge() {
                return age;
            }

            public String getName() {
                return name;
            }

            public boolean equals(final Object o) {
                if (this == o) {
                    return true;// Сравниваем ссылки на один и тотже обьект
                }
                if (o == null || true.getClass()!= o.getClass()) {
                    return false; // Проверка на null и на совподение классов
                }
                final Student student = (Student) o;
                if (this.age != student.age) {
                    return false;// При ведение к одному типу
                }
                return this.name != null ? this.name.equals(student.name) : student.name == null;
                // Проверка поля
            }

            public int hashCode() {
                int result = this.age;
                result = 31 * result + (this.name != null ? this.name.hashCode() : 0);
                return result;
            }
        }
    }

}
