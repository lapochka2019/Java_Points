import java.util.Scanner;

public class LabTwo {

    public static void main (String[] args){

        double x1;//инициализация координат
        double y1;//инициализация координат
        double z1;//инициализация координат
        double x2;//инициализация координат
        double y2;//инициализация координат
        double z2;//инициализация координат
        double x3;//инициализация координат
        double y3;//инициализация координат
        double z3;//инициализация координат

        Scanner in = new Scanner(System.in); //Клавиатура

        ///     Точка 1
        Point3D p1=new Point3D();//Создание точки с координатами по умолчанию
        System.out.print("Введите x1: ");
        x1=in.nextDouble(); // получаем значение x
        System.out.print("Введите y1: ");
        y1=in.nextDouble();//получаем значение y
        System.out.print("Введите z1: ");
        z1=in.nextDouble();//получаем значение z
        p1.setX(x1);//меняем значение x
        p1.setY(y1);//меняем значение y
        p1.setZ(z1);//меняем значение z

        ///     Точка 2
        Point3D p2=new Point3D();//Создание точки с координатами по умолчанию
        System.out.print("Введите x2: ");
        x2=in.nextDouble(); // получаем значение x
        System.out.print("Введите y2: ");
        y2=in.nextDouble();//получаем значение y
        System.out.print("Введите z2: ");
        z2=in.nextDouble();//получаем значение z
        p2.setX(x2);//меняем значение x
        p2.setY(y2);//меняем значение y
        p2.setZ(z2);//меняем значение z

        ///     Точка 3
        Point3D p3=new Point3D();//Создание точки с координатами по умолчанию
        System.out.print("Введите x3: ");
        x3=in.nextDouble(); // ввод x
        System.out.print("Введите y3: ");
        y3=in.nextDouble();//ввод  y
        System.out.print("Введите z3: ");
        z3=in.nextDouble();//ввод  z
        p3.setX(x3);//Изменение x
        p3.setY(y3);//Изменение y
        p3.setZ(z3);//Изменение z
        if (ComputeArea(p1,p2,p3)==-1){                         // вывод
            System.out.println("Невозможно определить площадь");// вывод
        }                                                       // вывод
        else {                                                  // вывод
            System.out.printf("Площадь треугольника:");         // вывод
            System.out.printf("%.2f", ComputeArea(p1, p2, p3)); // вывод
        }                                                       // вывод
    }                                                           // вывод


    public static double ComputeArea (Point3D t1, Point3D t2, Point3D t3){  //Расчет площади
        if (t1.equalsPoint(t2)|| t1.equalsPoint(t3)|| t2.equalsPoint(t3)){  //Совпадения точек
            return -1;
        }
        else {
            double pp=(t1.distanceTo(t2)+ t1.distanceTo(t3)+ t2.distanceTo(t3))/2;//Расчет полу-периметра
            return Math.sqrt(pp*(pp-t1.distanceTo(t2))*(pp-t1.distanceTo(t3))*(pp-t2.distanceTo(t3)));//Формула площади треугольника
        }
    }
}

