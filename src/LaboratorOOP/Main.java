package LaboratorOOP;

public class Main {
    public static void main(String[] args){
        Student filieraFrancofona=new Student();
        filieraFrancofona.afisare();
        Student filieraAnglofona=new Student("FAF-211","Caterev Ana");
        filieraAnglofona.afisare();
        Student grupaRomana=new Student("MI-211","Boboc Andrei","Managementul Informatiei" ,3);
        grupaRomana.afisare();
    }
}
