public class Point3D extends Point2D {

    //инициализация кординат
    private double z;

    //присваивает значения переменной
    public Point3D (double x, double y, double z) {
            super(x,y);
            this.z = z;
    }

    //конструктор по умолчанию
    public Point3D() {
        super();
        this.z = 0.0;
    }

    public double getZ () {//возвращает значение координаты
            return z;
    }

    public void setZ ( double val) {//устанавливает значение координаты
            z = val;
    }

    public boolean equalsPoint(Point3D p) {//Сравнение для точек
        return (this.getX() == p.getX()) && (this.getY() == p.getY()) && (this.getZ() == p.getZ());
    }

    public double distanceTo (Point3D tt){//Растояние между точками
        return Math.sqrt((this.getX()-tt.getX())*(this.getX()-tt.getX())+(this.getY()-tt.getY())*(this.getY()-
                tt.getY())+(this.getZ()-tt.getZ())*(this.getZ()-tt.getZ()));
    }
}