package relational;

public class RelationalOperator {
    public static void main(String[] args) {

        int ageBikram = 32;
        int heightBikram = 6;

        int ageTom = 20;
        int heightTom = 5;


//        if(ageBikram > 30 && heightBikram > 5) {
//            System.out.println("You are eligible for Volleyball");
//        }else {
//            System.out.println("You are Not eligible for Volleyball");
//        }
        // && : AND it check if both sides are true
        if ((ageBikram > 30 && heightBikram > 5) && (ageTom > 30 && heightTom > 5)) {
            System.out.println("You are eligible for Volleyball");
        } else {
            System.out.println("You are Not eligible for Volleyball");
        }


        // the rule for a group to qualify is :
        // TODO: I have to check on this complex logic again with Peter.
        // age > 30 || height >=5
        if ((ageBikram > 30 && heightBikram > 5) && (ageTom > 30 && heightTom > 5)) {
            System.out.println("You are eligible for Volleyball");
        } else {
            System.out.println("You are Not eligible for Volleyball");
        }


        // || : OR  if either side is true then the whole condition is TRUE
        // != : NOT Equals to

        if (ageBikram != 30) {
            System.out.println("Age is not 30");
        }


        int maxAge = 30;
        int maxHeight = 5;

        boolean isBikranEligible = (ageBikram > maxAge && heightBikram > maxHeight);
        boolean isTomEligible = (ageTom > maxAge && heightTom > maxHeight);

        if (isBikranEligible && isTomEligible) {
            System.out.println("You are eligible for Volleyball");
        } else {
            System.out.println("You are Not eligible for Volleyball");
        }

    }
}
