public class second {
    static class MyCircle{

        private int radius;

     MyCircle(int radius) {
         this.radius = radius;
     }

        void square() {
            System.out.println("Радиус:" + radius);
            System.out.println("Площадь:" + radius*radius * 3.1415926);;
        }
    }

    public static void main(String[] args) {
        MyCircle circle1 = new MyCircle(12);
        circle1.square();
    }
}
