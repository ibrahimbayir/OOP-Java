package Inheritance_6;
class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    // Constructors
    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point2D() {
        // Default constructor
    }

    // Getter and Setter methods for x and y
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    // Methods to set and get both x and y together
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        return new float[]{x, y};
    }

    // toString method to represent the Point2D as a String
    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}

// Point3D class, extending Point2D
class Point3D extends Point2D {
    private float z = 0.0f;

    // Constructors
    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {
        // Default constructor
    }

    // Getter and Setter method for z
    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    // Method to set and get all three coordinates together
    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }

    public float[] getXYZ() {
        float[] xy = super.getXY();
        return new float[]{xy[0], xy[1], z};
    }

    // toString method to represent the Point3D as a String
    @Override
    public String toString() {
        return "(" + super.getX() + "," + super.getY() + "," + z + ")";
    }
}

class Main{
            public static void main(String[] args) {
                // Point2D kullanımı
                Point2D point2D = new Point2D(1.0f, 2.0f);
                System.out.println("Point2D coordinates: " + point2D.getXY());
                System.out.println("Point2D as String: " + point2D.toString());

                // Point3D kullanımı
                Point3D point3D = new Point3D(3.0f, 4.0f, 5.0f);
                System.out.println("Point3D coordinates: " + point3D.getXYZ());
                System.out.println("Point3D as String: " + point3D.toString());

                // Point3D'nin Point2D'den miras aldığı için Point2D referansı ile kullanımı
                Point2D point3DAsPoint2D = new Point3D(6.0f, 7.0f, 8.0f);
                System.out.println("Point3D used as Point2D: " + point3DAsPoint2D.toString());
            }
        }

