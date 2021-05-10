class User {
    public String first_name;
    public String last_name;

    //Constructor
    public User(String first_name, String last_name){
        this.first_name = first_name;
        this.last_name = last_name;
    }
    public void fullname(){
        System.out.println(first_name + " " + last_name);

    }
}

class Example{

     public static void main(String[] args) {
    User usuario_1 = new User ("Alonso", "Najera");
    User usuario_2 = new User("Jair", "Rodríguez");

    usuario_1.fullname();
    usuario_2.fullname();
   }
}
