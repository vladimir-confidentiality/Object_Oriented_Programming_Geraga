public class Main{
    public static void main(String[] args){
        Subject a = new Subject(); 
        Subject sps = new Subject("Mark Steven Geraga" , 21, "Sciencemaniac");

        a.setName("Mark Steven Geraga");
        a.setAge(21);
        a.setProfile("Sciencemaniac");

        System.out.println("Name: " + a.getName() );
        System.out.println("Age: " + a.getAge() );
        System.out.println("Profile: " + a.getProfile() );

        System.out.println("Name: " + sps.name);
        System.out.println("Age: " + sps.age);
        System.out.println("Profile: " + sps.profile);

        Science s = new Science();
        System.out.println("My alma mater: " + s.schoolName);

        Subject p = new Subject();
        p.show();
        Subject p2 = new Science();
        p2.show();

    }
}