public class Treinning {
    public static void main(String[] args) {
        int yearOfBirth = 2002;
        int currentMonth = 7;
        int currentDay = 3;
        int monthBirth = 1;
        int dayBirth = 10;
        int age = 2022 - yearOfBirth;
        int currentAge = age - 1;
        int yearDays = age/4;
        int currentYearDays = currentAge/4;
        int daysLives = (age * 365)+yearDays;


        if ((currentMonth < monthBirth) && (currentDay < dayBirth)){
            System.out.println("You are "+currentAge+" years old, and approximately : "+ daysLives+" days on earth");
            System.out.println("leap years sum "+ yearDays);
        }else if ((currentMonth >= monthBirth) || (currentDay >= dayBirth)){
            System.out.println("You are "+age+" years old, and approximately : "+ daysLives+" days on earth");
            System.out.println("leap years sum "+ yearDays);
        }







    }

}
