package eu.ase.arrays;

public class ProgMainBidimensionalArrays {
    public static void main(String[] args) {
        int studNo = 2;
        int lectNo = 3;

        short[][] studentsMarks = new short[][] {{5,5,9}, {9,10,9}}; //studentsMarks.lenght = 2
        //Linia 0 -> student 0 -> {5,5,9}
        //Linia 1 -> student 1 -> {9,10,9}
        float[] avgStudentsMarks = new float[studNo];

        for(int i = 0; i < studNo; i++)
        {
            avgStudentsMarks[i] = 0;
            for(int j = 0; j < lectNo; j++)
            {
                avgStudentsMarks[i] += studentsMarks[i][j];
            }
            avgStudentsMarks[i] /= lectNo;
        }
        for(int i = 0; i < studNo; i++)
            System.out.println("Stud " + i + " avg: " + avgStudentsMarks[i]);
    }
}
