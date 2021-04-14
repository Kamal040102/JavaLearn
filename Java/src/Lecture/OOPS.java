package Lecture;

// Custom Class ==> Public "There is no need to write public access-modifer, it is by-default public."
class gulabo{               // Class : Noun (Name, place, thing, object, environment)
    String name;            // Attribute (Property) : Adjectives : Those words who tell the property                    or attribute of the noun.
    int age;
    String gender;
    int birthdate;
    String address;

    // Verb: wrods that tell about the action of noun. ==> Methods

    String get_name(String x){              // Action: Noun (Name)  ===> Print (Action)
        name = x;
        return name;
    }

    int get_age (int x){
        age = x;
        return age;
    }
}

public class OOPS{
    public static void main(String[] args) {
        gulabo obj = new gulabo();
        System.out.println(obj.get_name("Gulabo Sharma"));
        System.out.println(obj.get_age(19));
    }
}