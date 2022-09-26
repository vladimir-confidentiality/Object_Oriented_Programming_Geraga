public class Subject implements interFace{


    String name, profile;
    int age;
    String schoolName = "Guihulngan National High School - Poblacion"; 

    
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }
    public String getProfile() {
        return profile;
    }

    public Subject(){
        System.out.println("Zup!! I love science since Elementary.");
    }

    public Subject(String name, int age, String profile){
        this.name=name;
        this.age=age;
        this.profile=profile;
    }
    
    public void show(){
        System.out.println("Yeah I can say that I am a Sciencemaniac.");
        System.out.println("If you love Science, I love you too.");
    }
}
