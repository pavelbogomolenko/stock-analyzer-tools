package io.github.pavelbogomolenko.portfoliofrontier;

import java.time.YearMonth;
import java.util.ArrayList;

public class PortfolioReturnsPerformanceParams {
    private final ArrayList<String> symbols;
    private final YearMonth dateFrom;
    private final YearMonth dateTo;

    private PortfolioReturnsPerformanceParams(Builder builder) {
        this.symbols = builder.symbols;
        this.dateFrom = builder.dateFrom;
        this.dateTo = builder.dateTo;
    }

    public static class Builder {
        private ArrayList<String> symbols = new ArrayList<>();
        private YearMonth dateFrom;
        private YearMonth dateTo;

        public Builder symbol(String s) {
            this.symbols.add(s);
            return this;
        }

        public Builder symbols(ArrayList<String> s) {
            this.symbols = s;
            return this;
        }

        public Builder dateFrom(YearMonth d) {
            this.dateFrom = d;
            return this;
        }

        public Builder dateTo(YearMonth d) {
            this.dateTo = d;
            return this;
        }

        public PortfolioReturnsPerformanceParams build() {
            return new PortfolioReturnsPerformanceParams(this);
        }
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public ArrayList<String> getSymbols() {
        return symbols;
    }

    public YearMonth getDateFrom() {
        return dateFrom;
    }

    public YearMonth getDateTo() {
        return dateTo;
    }
}
