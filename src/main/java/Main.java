import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Simple.Person person = Simple.Person.newBuilder()
                .setId(1)
                .setName("Ruby")
                .setGender(Simple.Gender.FEMALE)
                .addAllHobbies(List.of(
                        Simple.Hobby.newBuilder()
                                .setId(1)
                                .setName("Painting")
                                .build(),
                        Simple.Hobby.newBuilder()
                                .setId(2)
                                .setName("Cycling")
                                .build()
                ))
                .putFamilyMembers(Simple.Relation.MOTHER_VALUE, "Ayesha")
                .putFamilyMembers(Simple.Relation.SPOUSE_VALUE, "Sulav")
                .putFamilyMembers(Simple.Relation.SON_VALUE, "Sayonto")
                .putFamilyMembers(Simple.Relation.DAUGHTER_VALUE, "Rodoshi")
                .build();
        System.out.println(person);
    }
}
