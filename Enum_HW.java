package prof_160223;

public enum Enum_HW {


    PLANE(1.10),

    TRAIN(4.54),
    CAR(6.04),
    BICYCLE(37.0),
    AFOOT(118.0);


    private final double hour;

    Enum_HW(double hour) {
        this.hour = hour;
    }

    public double getHour() {
        return hour;
    }

        public static void getDay() {
            double day;
            for (int i = 0; i < Enum_HW.values().length; i++) {
                day = Enum_HW.values()[i].getHour() / 24;
                String day1 = String.format("%.2f", day);
                System.out.println( "your trip to Munich by " +  Enum_HW.values()[i] + " will last" + day1 + " days");
            }

        }

        public static void getHourMethod() {
            for (int i = 0; i < Enum_HW.values().length; i++) {
                System.out.println("your trip to Munich by " + Enum_HW.values()[i] + " will last " + Enum_HW.values()[i].getHour() + "  hours");
            }

    }
    public static void getMinute() {
        int minute;
        for (int i = 0; i < Enum_HW.values().length; i++) {
            minute = (int) ((Enum_HW.values()[i].getHour() *100) % 60 + ((int)Enum_HW.values()[i].getHour() * 60));
            System.out.println("your trip to Munich by " + Enum_HW.values()[i] + " will last  " + minute + " minutes");
        }

    }
    public static void getTravelTime() {
        int day;
        int hour;
        int minute;
        for (int i = 0; i < Enum_HW.values().length; i++) {
            day = (int)Enum_HW.values()[i].getHour() / 24;
            hour = (int) (Enum_HW.values()[i].getHour() % 24);
            minute =(int) (((Enum_HW.values()[i].getHour() *100) % 60 + ((int)Enum_HW.values()[i].getHour() * 60)) % 60);

            System.out.println("your trip to Munich by " + Enum_HW.values()[i] + " will last  " + day + " day " + hour + " hours " + minute + " minutes ");
        }

    }


    public static void main(String[] args) {
        getDay();
        getHourMethod();
        getMinute();
        getTravelTime();

    }


}







