package baobao.Shangke.day6y10;

public class ScoreCalc {
    float java = 98f;
    float C = 99f;
    float db = 97f;

    public float suan() {
        return (java + C + db) / 3;
    }

    public void show() {
        System.out.println(suan());
    }

    public float sum() {
        return java + C + db;
    }

    public void showSum() {
        System.out.println(sum());
    }


}
