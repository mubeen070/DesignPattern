package LabTask_1.Csharp;

public class PersonFactory {
    public IPerson GetPerson(PersonType type) {
        switch (type) {
            case PersonType.Rural:
                return new Villager();
            case PersonType.Urban:
                return new CityPerson();
            default:
                throw new UnsupportedOperationException();
        }
    }
}