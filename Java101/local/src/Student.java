public class Student extends Human {
    String stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;



    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        this.isPass = false;
        this.age = 15;
    }


    public void addBulkExamNote(int mat,int verbalNoteMat ,int fizik, int verbalNoteFzk, int kimya, int verbalNoteKmy) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
            this.mat.verbalNote = verbalNoteMat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
            this.fizik.verbalNote = verbalNoteFzk;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
            this.kimya.verbalNote = verbalNoteKmy;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = (((this.fizik.note * 0.80) +(fizik.verbalNote * 0.20)) +  ((this.kimya.note * 0.80) +(kimya.verbalNote * 0.20)) + ((this.mat.note * 0.80) +(mat.verbalNote * 0.20))) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Öğrenci Yaş : " + this.age);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Matematik Sözlü Notu : " + mat.verbalNote);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Fizik Sözlü Notu : " + fizik.verbalNote);
        System.out.println("Kimya Notu : " + this.kimya.note);
        System.out.println("Kimya sözlü Notu : " + kimya.verbalNote);
    }

}