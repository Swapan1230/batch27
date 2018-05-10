package jrout.tutorial.corejava.arrays;

/**
 * java ArrayExample hello world
 * args[0] and args[1]
 */
public class ArrayExample {
    int a = 10;

    public static void main(String[] args) {
        String nameCh = "Chithra";
        String nameBi = "Bikram";
        String nameBa = "Balu";
        String nameA = "Adif";
        // Array Index always starts from 0
        String fnames[] = {nameCh,"Bikram","Balu",nameA,"Jay"};

        System.out.println(fnames);


        for(int i = 0; i < fnames.length ; i++) {
            System.out.println(fnames[i]);
        }

        System.out.println("=======while Loop======");
        int i = 0;
//        int i = 3;

        while(i < fnames.length){
            System.out.println(fnames[i]);
            i++;
        }

//        int i = 0;
//        do{
//            System.out.println(fnames[i++]);
//        }while (i < 4);


        System.out.println("Enhanced for loop.....");

        String firstnames[] = {nameCh,"Bikram","Balu",nameA,"Jay"};

        for(String str : firstnames) {
            System.out.println(str);
        }


        // Declaring but not initializing...
        int ages[] = new int[5];

        ages[3] = 30;
//        ages[5] = 40; // you cannot initializ a index which is not present...

        System.out.println(ages[2]);
        System.out.println(ages[3]);
//        System.out.println(ages[5]); // you cannot access a index out of bound...

    }


}
