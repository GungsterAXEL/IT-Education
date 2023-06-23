package Examples.Webinar_03.Homework.Entry;

import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Entry {
    private String surname, name, patronymic;
    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
    private Date birthday;
    private BigInteger phone;
    private Character gender;

    public Entry() {
    }

    public Entry(String surname, String name, String patronymic, Date birthday, BigInteger phone, Character gender) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.birthday = birthday;
        this.phone = phone;
        this.gender = gender;
    }

    public Entry(String surname, String name, String patronymic, SimpleDateFormat dateFormat, Date birthday, BigInteger phone, Character gender) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.dateFormat = dateFormat;
        this.birthday = birthday;
        this.phone = phone;
        this.gender = gender;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getDateFormat() {
        return this.dateFormat.toString();
    }

    public void setDateFormat(String dateFormat) {
        this.dateFormat = new SimpleDateFormat(dateFormat);
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public BigInteger getPhone() {
        return phone;
    }

    public void setPhone(BigInteger phone) {
        this.phone = phone;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }


    public boolean equals(Record record) {
        if (this.toString().equals(record.toString()))
            return true;
        return false;
    }

    @Override
    public String toString() {
        String format = "<" + surname + "><" + name + "><" + patronymic + "><" + dateFormat.format(birthday) + "><" + phone + "><" + gender + ">";
        return format;
    }
}
