package acme.enthuware.standard_tests.last_day_test.test69;

public class Switcher{

    public static void main(String[] args){
        switch(Integer.parseInt(args[1]))  //1
        {
            case 0 :
                var b = false; //2
                break;

            case 1 :
                b = true; // 3
                break;
        }

//        if(b) System.out.println(args[2]); //4
    }
}
