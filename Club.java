class Static {
    static String Clubname = "Golf Club";
    String Member_name; 
    int Club_Record; 
    static void display() {
        System.out.println("The Club name is: " + Clubname);
    }
    void Record() {
        System.out.println("The member name is " + Member_name +  " and has a record of " + Club_Record +" in " + Clubname);
    }
}

public class Club {
    public static void main(String[] args) {
        
        Static.display();

        Static member1 = new Static();
        member1.Member_name = "Raj";
        member1.Club_Record = 10;
        member1.Record();
    }
}

