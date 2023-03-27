public class Person {
    private String name;
    private String lastName;
    private double heigth;
    private int age;
    private String email;
    private Adreess address;
    private String cpf;

    Person() {}

    Person(String name, String lastName, double heigth, int age, String email, Adreess adreess, String cpf) {
        this.name = name;
        this.lastName = lastName;
        this.heigth = heigth;
        this.age = age;
        this.email = email;
        this.address = adreess;
        this.cpf = cpf;
    } 

    void presentYourself(){
        System.out.println("Hello, my name is" + this.name);
    }

    void growUp(){
        this.heigth += 10.0;
    }

    void talkAbout(String text){
        System.out.println(text);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() < 5) {
            System.out.println("Escreva um caractere acima de 5 caracteres!");
            return;
        } 
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (this.age <= age) {
            System.out.println("A nova idade deve ser maior do que a idade atual!");
            return;
        }
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.endsWith("@gmail.com")) {
            System.out.println("Insira um email que finalize com @gmail.com");
            return;
        }
        this.email = email;
    }

    public Adreess getAddress() {
        return address;
    }

    public void setAddress(Adreess address) {
        this.address = address;
    }

    private String getCpf(){
        return this.cpf;
    }
 }
