package ie.gmit;

public class Passenger {

    private String Title;
    private String Name;
    private String ID;
    private String Phone;
    private int Age;

    public Passenger(String title, String name, String id, String phone, int age) {
        setTitle(title);
        setName(name);
        setId(id);
        setPhone(phone);
        setAge(age);
    }

    private void setTitle(String title) {
        if (title.equals("Mr") || title.equals("Mrs") || title.equals("Ms")) {
            this.Title = title;
        }
        else {
            throw new IllegalArgumentException("Title incorrect");
        }
    }

    private void setName(String name) {
        if (name.length() >= 3) {
            this.Name = name;
        }
        else {
            throw new IllegalArgumentException("Name too short");
        }
    }

    private void setId(String id) {
        if (id.length() >= 10) {
            this.ID = id;
        }
        else {
            throw new IllegalArgumentException("ID too short");
        }
    }

    private void setPhone(String phone) {
        if (phone.length() >= 10) {
            this.Phone = phone;
        }
        else {
            throw new IllegalArgumentException("Phone too short");
        }
    }

    private void setAge(int age) {
        if (age > 16) {
            this.Age = age;
        }
        else {
            throw new IllegalArgumentException("Passenger too young");
        }
    }



}
