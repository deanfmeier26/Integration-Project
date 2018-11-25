public class GeneralFunctionality {
    public final static String actionList[] = { "User Information",
            "Generate List of Numbers", "To-Do List - *WIP*",
            "Basic Calculator", "Exit Program" };
    // Final is used to create constant variables, prevent method overriding,
    // and prevent inheritance

    // This method is just to print out the list of actions a user can choose
    // from
    public static void printActionList() {
        for (int i = 0; i < actionList.length; i++) {
            int listNumber = i + 1;
            String action = actionList[i];

            System.out.println(listNumber + ". " + action);

            /*
             * The .length method is a string method that returns the amount of
             * characters in any given string.
             */
        }
    }

    public static void printDashedLineBreak() {
        System.out.println("-----------------------------------------------\n");
    }
}
