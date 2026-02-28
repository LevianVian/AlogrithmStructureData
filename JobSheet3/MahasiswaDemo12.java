package JobSheet3;

class Mahasiswa {
    public String nim;
    public String name;
    public String grade;
    public float gpa;
}

public class MahasiswaDemo12 {
    
    public static void main(String[] args) {
        Mahasiswa[] arrayOfMahasiswa = new Mahasiswa[3];

        arrayOfMahasiswa[0] = new Mahasiswa();
        arrayOfMahasiswa[0].nim = "244107060033";
        arrayOfMahasiswa[0].name = "AGNES TITANIA KINANTI";
        arrayOfMahasiswa[0].grade = "SIB-1E";
        arrayOfMahasiswa[0].gpa = (float) 3.75;

        arrayOfMahasiswa[1] = new Mahasiswa();
        arrayOfMahasiswa[1].nim = "2341720172";
        arrayOfMahasiswa[1].name = "ACHMAD MAULANA HAMZAH";
        arrayOfMahasiswa[1].grade = "TI-2A";
        arrayOfMahasiswa[1].gpa = (float) 3.36;

        arrayOfMahasiswa[2] = new Mahasiswa();
        arrayOfMahasiswa[2].nim = "244107023006";
        arrayOfMahasiswa[2].name = "DIRHAMAWAN PUTRANTO";
        arrayOfMahasiswa[2].grade = "TI-2E";
        arrayOfMahasiswa[2].gpa = (float) 3.80;
    
        System.out.println("NIM        : " + arrayOfMahasiswa[0].nim);
        System.out.println("Name       : " + arrayOfMahasiswa[0].name);
        System.out.println("Grade      : " + arrayOfMahasiswa[0].grade);
        System.out.println("GPA        : " + arrayOfMahasiswa[0].gpa);
        System.out.println("==================================");
        
        System.out.println("NIM        : " + arrayOfMahasiswa[1].nim);
        System.out.println("Name       : " + arrayOfMahasiswa[1].name);
        System.out.println("Grade      : " + arrayOfMahasiswa[1].grade);
        System.out.println("GPA        : " + arrayOfMahasiswa[1].gpa);
        System.out.println("==================================");
        
        System.out.println("NIM        : " + arrayOfMahasiswa[2].nim);
        System.out.println("Name       : " + arrayOfMahasiswa[2].name);
        System.out.println("Grade      : " + arrayOfMahasiswa[2].grade);
        System.out.println("GPA        : " + arrayOfMahasiswa[2].gpa);
        System.out.println("==================================");
    }
}