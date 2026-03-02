package eu.ase.ooparrays;

import java.util.Arrays;

public class Student {
    private String name;
    private short[] marks;
    private float avgMarks;
    private static int noStud;

    public Student() {

    }

    public Student(String name, short[] marks){
        this.name = name;
        this.marks = marks;
        Student.noStud++;
        this.avgMarks = calcAvgMarks();
    }

    public void setmarks(short[] marks) {
        this.marks = marks;
        avgMarks = calcAvgMarks();
    }

    public float getAvgMarks() { return avgMarks; }

    private float calcAvgMarks()
    {
        if(marks == null || marks.length == 0)
        {return 0.0f;}
        float result = 0.0f;

        for(int i = 0; i<marks.length; i++) {
            result = result + marks[i];
        }
        result /= marks.length;
        return result;
    }
    @Override
    public String toString() {
        return "Student " + name + ", marks: "+ Arrays.toString(marks) + ", avg: " + avgMarks;
    }
    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if(!name.equals(other.name))
            return false;
        if(!Arrays.equals(marks, other.marks))
            return false;
        if(Float.floatToIntBits(avgMarks) != Float.floatToIntBits(other.getAvgMarks()))
            return false;
        return true;
    }
    @Override
    public int hashCode() {
        int result = 0;
        if(name != null)
        {
            result = result + name.hashCode();
        }

        if(marks != null) {
            result = result + Arrays.hashCode(marks);
        }
        result = result + Float.floatToIntBits(avgMarks);
        return result;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        Student cloneObj = new Student();
        cloneObj.name = new String(this.name);
        cloneObj.marks = this.marks.clone();
        cloneObj.avgMarks = this.avgMarks;
        Student.noStud++;
        return cloneObj;
    }
}
