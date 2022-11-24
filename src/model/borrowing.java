package model;

public class borrowing {

    int b_id;
    int s_id;
    int extra_days;
    int fine_rate;


    public int getB_id() {
        return b_id;
    }

    public void setB_id(int b_id) {
        this.b_id = b_id;
    }

    public int getS_id() {
        return s_id;
    }

    public void setS_id(int s_id) {
        this.s_id = s_id;
    }

    public void setExtra_days(int extra_days) {
        this.extra_days = extra_days;
    }

    public int getExtra_days() {
        return extra_days;
    }

    public int getFine_rate() {
        return fine_rate;
    }

    public void setFine_rate(int fine_rate) {
        this.fine_rate = fine_rate;
    }


    public borrowing(int b_id, int s_id, int extra_days, int fine_rate) {
        this.b_id = b_id;
        this.s_id = s_id;
        this.extra_days = extra_days;
        this.fine_rate = fine_rate;
    }

    public void fine_rate() {
        double fine_rate = (this.fine_rate * this.extra_days);
        System.out.println("the fine is " + fine_rate + " of studentId " + this.s_id);
    }
}







