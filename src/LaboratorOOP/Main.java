package LaboratorOOP;

public class Main {
    public static void main(String[] args){
        Student FilieraFrancofona=new Student();
        FilieraFrancofona.afisare();
        Student FilieraAnglofona=new Student("FAF-211","Caterev Ana");
        FilieraAnglofona.afisare();

        Student grupaRomana=new Student("MI-211","Boboc Andrei","Managementul Informatiei" ,3);
        grupaRomana.afisare();;
    }
}