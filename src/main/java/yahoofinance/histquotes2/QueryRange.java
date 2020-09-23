package yahoofinance.histquotes2;

/**
 *
 * @author SA
 */
public enum QueryRange {
    DAY("1d"),
    WEEK("5d"),
    MONTH("1mo"),
    SIXTY_DAYS("60d"),
    THREE_MONTHS("3mo"),
    SIX_MONTH("6mo"),
    YEAR("1y"),
    TWO_YEARS("2y"),
    FIVE_YEARS("5y"),
    TEN_YEARS("10y"),
    MAX("max");

    private final String tag;

    QueryRange(String tag) {
        this.tag = tag;
    }

    public String getTag() {
        return this.tag;
    }
}
