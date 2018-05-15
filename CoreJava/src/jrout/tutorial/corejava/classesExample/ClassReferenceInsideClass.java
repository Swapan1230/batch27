package jrout.tutorial.corejava.classesExample;

public class ClassReferenceInsideClass {

    public static void main(String[] args) {
        Student raj = new Student();
        String rajName = "Raj";
        raj.setName(rajName);
        raj.setAge(20);
        String[] courseTaken = {"Java",".Net","Testing"};
//        raj.setCourseTaken(courseTaken);
        raj.setCourseTaken(new String[]{"Java",".Net","Testing"});


        String[] courseTakenReturn = raj.getCourseTaken();
        for(String course : courseTakenReturn){
            System.out.println(course);
        }

        Address address = new Address();
        address.setAddress1("Peter St");
        address.setAddress2("Lincon Village");
        address.setAddressCity("Pond");
        address.setAddressZip(12345);

        raj.setAddress(address);


        PrintDetails pd = new PrintDetails();
//        raj or address ????


//        Student peter = new Student();
//        pd.printDetails(peter);

        pd.printDetails(raj);

//        System.out.println("    hello     ".trim());
    }
}
