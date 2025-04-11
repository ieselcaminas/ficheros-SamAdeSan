package EstructurasJSONconGSON;

public class Empleado {
    private int num;
    private String nombre;
    private int departamento;
    private int edad;
    private double salario;

    public Empleado(int num, String nombre, int departamento, int edad, double salario) {
        this.num = num;
        this.nombre = nombre;
        this.departamento = departamento;
        this.edad = edad;
        this.salario = salario;
    }

    public void display() {
        System.out.println(
                "{\"num\":" + this.num +
                ",\"nombre\":\"" + this.nombre +
                "\",\"departamento\":" + this.departamento +
                ",\"edad\":" + this.edad + ",\"sueldo\":" + this.salario + "}\n"
        );
    }
}