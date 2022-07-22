public class TestElseIf {
    public static void main(String[] args) {
        int age = 16;
        if (age < 15){
            System.out.println("Is still a child");
        } else if ((age >= 15) && (age <= 17) ){
            System.out.println("Is still a teenager");

        } else if ((age >= 18) && (age <36)) {
            System.out.println("It's young");

        } else{
            System.out.println("Is already an adult");
        }


    }


}
