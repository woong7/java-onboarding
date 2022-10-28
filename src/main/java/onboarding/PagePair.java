package onboarding;

public class PagePair {

    private final Page left;
    private final Page right;

    public PagePair(final Page left, final Page right) {
        this.left = left;
        this.right = right;
    }

    public boolean isValidPair() {

        return left.isValidPage()
            && right.isValidPage()
            && right.isRightSidePairOf(left);
    }

    public int findMaxPoint() {

        return Math.max(
            left.findMaxValue(),
            right.findMaxValue()
        );
    }
}
