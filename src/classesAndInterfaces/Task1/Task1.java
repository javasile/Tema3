package classesAndInterfaces.Task1;

public class Task1 {
    public static void main(String[] args) {

        Email cak = new Email("asas");
        System.out.println(cak);

    }

}

class Email{
    private String email;


    public Email(String email) {
        if (email == null || email.isEmpty()){
            this.email = "unknown";
        }else
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Email{" +
                "email='" + email + '\'' +
                '}';
    }
}
