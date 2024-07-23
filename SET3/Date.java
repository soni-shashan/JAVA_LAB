public class Date {
    private int month;
    private int date;
    private int year;
    Date(int date,int month,int year){
        this.date=date;
        this.month=month;
        this.year=year;
    }
    public void displayDate(){
        System.out.println(date+"/"+month+"/"+year);
    }
    public int getDate(){
        return date;
    }
    public int getMonth(){
        return month;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int x){
        year=x;
    }
    public void setMonth(int x){
        month=x;
    }
    public void setDate(int x){
        date=x;
    }
}
