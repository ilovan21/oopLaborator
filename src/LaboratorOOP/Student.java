package LaboratorOOP;

public class Student {
    private String grupa="FI-211";
    private int anul=2;
    private String nume="Ilovan Maria";
    private String specialitate="Tehnologia Informatiei ";

    public Student(){
    }
    
    public Student(String grupa, String nume){
        this.grupa=grupa;
        this.nume=nume;
    }

    public Student(String grupa, String nume, String specialitate, int anul){
        this.grupa=grupa;
        this.nume=nume;
        this.specialitate=specialitate;
        this.anul=anul;
    }
    
    public void afisare(){
        System.out.println( "Nume: "+this.nume+" specialitatea : "+ this.specialitate+"  anul : "+ this.anul+" grupa : "+this.grupa);
    }
}
