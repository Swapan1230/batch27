package datatype;

public class IntegerExample {
    public static void main(String[] args) {
//        byte
//                short
//                        int
//                                long
        byte romaAge = 10;
        System.out.println(romaAge);
        short romaAgeDuplicate = romaAge;

        System.out.println(romaAgeDuplicate);

        int height = 6;

        byte heightDuplicate = (byte)height;

        System.out.println("heightDuplicate "+heightDuplicate);

    }
}
