package Entities;

public class calculo {

        public double width;
        public double height;

        public double area() {
            return width * height;
        }

        public double perimetro(){
            return 2 * (width + height);
        }

        public double diagonal(){
            return Math.sqrt(Math.pow(width, 2) + (Math.pow(height, 2)));
        }
}
