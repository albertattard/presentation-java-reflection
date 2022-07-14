package demo;

import java.util.Objects;

public class ContactPojo {

    private final String name;
    private final String surname;

    public ContactPojo(final String name, final String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public boolean equals(final Object object) {
        if (this == object) {
            return true;
        }

        if (object == null || getClass() != object.getClass()) {
            return false;
        }

        final ContactPojo other = (ContactPojo) object;
        return Objects.equals(name, other.name) && Objects.equals(surname, other.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

    @Override
    public String toString() {
        return String.format("ContactPojo(name=%s, surname=%s)", name, surname);
    }
}
