import java.time.LocalDate;
import java.util.Objects;

public class Passport {

    private int passportNumber;
    private String Surname;
    private String name;
    private String MiddleName;
    private final LocalDate birthDay;

    public Passport(int passportNumber, String surname, String name, String middleName, LocalDate birthDay) throws ValidationFieldErrorException {
        setPassportNumber(passportNumber);
        setSurname(surname);
        setName(name);
        MiddleName = middleName;
        this.birthDay = birthDay;
    }

    public Passport(int passportNumber, String surname, String name, LocalDate birthDay) throws ValidationFieldErrorException {
        setPassportNumber(passportNumber);
        setSurname(surname);
        setName(name);
        try {
            if (birthDay == null) {
                throw new NullPointerException("Введите дату рождения");
            }
        } catch (NullPointerException e) {
            throw new RuntimeException(e.getMessage());
        }
        this.birthDay = birthDay;
    }

    public int getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(int passportNumber) throws ValidationFieldErrorException {
            if (passportNumber <= 0) {
                throw new ValidationFieldErrorException("Введите корректный номер паспорта");
            }
        this.passportNumber = passportNumber;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) throws ValidationFieldErrorException {
            if (surname == null || surname.isEmpty() || surname.isBlank()) {
                throw new ValidationFieldErrorException("Введите фамилию");
            }
        Surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
            if (name == null || name.isEmpty() || name.isBlank()) {
                throw new NullPointerException("Введите Имя");
            }
        this.name = name;
    }

    public String getMiddleName() {
        return MiddleName;
    }

    public void setMiddleName(String middleName) {
        MiddleName = middleName;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return passportNumber == passport.passportNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(passportNumber);
    }

    @Override
    public String toString() {
        return passportNumber + " " + Surname + " " + name + " " + MiddleName + " " + birthDay + "\n";
    }
}
