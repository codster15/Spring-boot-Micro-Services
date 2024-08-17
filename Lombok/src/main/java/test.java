import in.deepak.Dto.Person;

public class test {

    public static void main(String[] args) {
        Person p = new Person();
        p.setId(101);
        p.setName("Ashok Sir");
        p.setGender("Male");

        System.out.println(p);


        Person p1 = new Person(102,"Rani","female");

        System.out.println(p1);
    }

}