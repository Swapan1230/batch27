package datatype;

public class CharDataTypes {
    public static void main(String[] args) {
//        char symbol = '\u01F8';
//        System.out.println(" Unicode Character : "+symbol);
//
//
//        System.out.println('\u0120');
//
//        String sym = "\\u0120";
//
//        System.out.println(sym);
//        byte[] bytes = sym.getBytes(Charset.forName("UTF-8"));
//        System.out.println(bytes);
//
//        for(int index=0;index<256; index++)
//            System.out.println((char)index    +" "+ index);
//
//
//
//
//
        for (int i = 0; i <= 1000; i++) {
            if (Character.isDefined(i)) {
                System.out.println(Integer.toHexString(i) + ": " +
                        new String(Character.toChars(i)));
            }
        }

        for (int i = 0; i <= 1000; i++) {
            if (Character.isDefined(i)) {
                System.out.print(new String(Character.toChars(i)) +"\t");
                if(i % 15 == 0)
                    System.out.println();
            }
        }
    }
}