public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;
    int verbalnotemat;
    int verbalnotekmy;
    int verbalnotefzk;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya, int verbalnotemat, int verbalnotefzk, int verbalnotekmy) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        this.verbalnotekmy = verbalnotekmy;
        this.verbalnotefzk = verbalnotefzk;
        this.verbalnotemat = verbalnotemat;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat,int verbalnotemat ,int fizik, int verbalnotefzk, int kimya, int verbalnotekmy) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
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
        this.avarage = (((this.fizik.note * 0.80) +(fizik.verbalnotefzk * 0.20)) +  ((this.kimya.note * 0.80) +(kimya.verbalnotekmy * 0.20)) + ((this.mat.note * 0.80) +(mat.verbalnotemat * 0.20))) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Matematik Sözlü Notu : " + mat.verbalnotemat);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Fizik Sözlü Notu : " + fizik.verbalnotefzk);
        System.out.println("Kimya Notu : " + this.kimya.note);
        System.out.println("Kimya sözlü Notu : " + kimya.verbalnotekmy);
    }

}