package Cars;

import java.util.Objects;

public class Sponsor {

    private String name;
    private int supportSum;

    public Sponsor(String name, int supportSum) {
        this.name = name;
        this.supportSum = supportSum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSupportSum() {
        return supportSum;
    }

    public void setSupportSum(int supportSum) {
        this.supportSum = supportSum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sponsor sponsor = (Sponsor) o;
        return supportSum == sponsor.supportSum && name.equals(sponsor.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, supportSum);
    }

    @Override
    public String toString() {
        return name + " в размере " + supportSum + " рублей";
    }
}
