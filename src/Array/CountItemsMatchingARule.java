package Array;

public class CountItemsMatchingARule {
    public static void main(String[] args) {
        String[][] items = {
                {"phone","blue","pixel"},
                {"computer","silver","lenovo"},
                {"phone","gold","iphone"}
        };
        String ruleKey = "color";
        String ruleValue = "silver";
        countItemsMatchingARule(items, ruleKey, ruleValue);
    }

    static int countItemsMatchingARule(String[][] items, String ruleKey, String ruleValue) {
        return 1;
    }
}
