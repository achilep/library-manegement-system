public class Date {
   private int day;
    private int month;
    private int years;
    public Date(int day, int month, int years) {
        this.day = day;
        this.month = month;
        this.years = years;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    @Override
    public String toString() {
        return "Date{" + "day=" + day + ", month=" + month + ", years=" + years + '}';
    }
    
    
}