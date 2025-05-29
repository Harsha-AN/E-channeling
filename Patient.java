package Q2;

public class Patient {
    private String name;
    private int accno;

    public Patient(String name, int accno) {
        this.name = name;
        this.accno = accno;
        
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccno() {
        return accno;
    }

    public void setAccno(int accno) {
        this.accno = accno;
    }

      
}
