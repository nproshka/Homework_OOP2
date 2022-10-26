import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class PassportList {

    private final Set<Passport> passportList = new HashSet<>();

    public PassportList(Set<Passport> passportList) {
        this.passportList.addAll(passportList);
    }

    public Set<Passport> getPassportList() {
        return passportList;
    }

    public void addPassport(Passport passport) {

            if (!passportList.contains(passport)) {
                passportList.add(passport);
            } else {
                throw new RuntimeException("Паспорт с номером " + passport.getPassportNumber() + " уже есть в базе данных");
            }
    }

    public Passport findPassportFromNumber(int passportNumber) {
        for (Passport passport: passportList) {
            if (passport.getPassportNumber() == passportNumber) {
                return passport;
            }
        }
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PassportList that = (PassportList) o;
        return passportList.equals(that.passportList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passportList);
    }

    @Override
    public String toString() {
        return passportList + "";
    }
}
