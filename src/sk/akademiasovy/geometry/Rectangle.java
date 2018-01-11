package sk.akademiasovy.geometry;

public class Rectangle {

        private double a;
        private double b;

        public rectangle(double a)
        {
            this.a=a;
            this.a=b;
        }

        public rectangle(double a, double b)
        {
            this.a=a;
            this.b=b;
        }

        public rectangle()
        {
        }

        public double getArea()
        {
            return a*b;
        }
        public double getPerimeter()
        {
            return 2*a + 2*b;
        }
        public double getDiagonal()
        {
            return  Math.sqrt(a*a+b*b);

        }
        public void transpuse()
        {
            double temp;
            temp=a;
        }
}
