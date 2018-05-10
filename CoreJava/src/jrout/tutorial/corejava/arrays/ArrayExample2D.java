package jrout.tutorial.corejava.arrays;

/**
 * java ArrayExample hello world
 * args[0] and args[1]
 */
public class ArrayExample2D {

    public static void main(String ...args) {


        String nameA[] = {"Tom","Hank"};

        for(int j = 0 ; j < nameA.length; j++) {

        }


        String nameB[] = {"Raju","Singh"};
        String nameC[] = {"Black","Panther"};
        String nameD[] = {"Bill","Rod"};
        String nameE[] = {"Mohan","Taka"};
        String nameF[] = {"Rakesh","Lal","Pitambar","Something"};

        String names[][] = {nameA,nameB,nameC,nameD,nameE, nameF};

//        System.out.println("First Name :"+names[0][0] +" Last Name :" + names[0][1]);
//        System.out.println("First Name :"+names[1][0] +" Last Name :" + names[1][1]);
//        System.out.println("First Name :"+names[2][0] +" Last Name :" + names[2][1]);
//        System.out.println("First Name :"+names[3][0] +" Last Name :" + names[3][1]);


//        for (int i = 0 ; i < names.length ; i++) {
//            System.out.println(names[i][0] +"    "+names[i][1] +" " + names[i][2]);
//        }

        for(int i = 0; i < names.length; i++) {
            String[] name = names[i];
//            System.out.println(name[0] +" "+ name[1]);
            for(int j = 0 ; j < name.length; j++) {
                System.out.print(names[i][j] +" ");
            }
            System.out.println(" ");
        }


    }
}
