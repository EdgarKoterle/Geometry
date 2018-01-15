package sk.akademiasovy.geometry3D;

public class Cube implements Operations3D {
    private int a;

    public class cube implements  Operations3D{
        private double a;

        public cube(double a) {
            this.a = a;
        }


        @Override
        public double getSurface() {
            return 6*(a*a);
        }

        @Override
        public double getVolume() {
            return (a*a*a);
        }

    }