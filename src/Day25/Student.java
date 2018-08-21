package Day25;

public class Student {
    private String name;
    private int chnScore, mathScore, engScore, sumScore;

    public Student(String name, int chnScore, int mathScore, int engScore) {
        this.name = name;
        this.chnScore = chnScore;
        this.mathScore = mathScore;
        this.engScore = engScore;
        this.sumScore = chnScore + mathScore + engScore;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChnScore() {
        return chnScore;
    }

    public void setChnScore(int chnScore) {
        this.chnScore = chnScore;
    }


    public int getMathScore() {
        return mathScore;
    }

    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }

    public int getEngScore() {
        return engScore;
    }

    public void setEngScore(int engScore) {
        this.engScore = engScore;
    }

    public int getSumScore() {
        return sumScore;
    }

    public void setSumScore(int sumScore) {
        this.sumScore = sumScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", chnScore=" + chnScore +
                ", mathScore=" + mathScore +
                ", engScore=" + engScore +
                ", sumScore=" + sumScore +
                '}';
    }
}
