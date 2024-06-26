package com.testdroid.api.model.enums;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.time.temporal.ChronoUnit;

/**
 * @author Adrian Zybala <adrian.zybala@bitbar.com>
 */
public enum Unit {
    MONTH(ChronoUnit.MONTHS),
    DAY(ChronoUnit.DAYS),
    YEAR(ChronoUnit.YEARS),
    HOUR(ChronoUnit.HOURS),
    RUN(null),
    PROJECT(null);

    private final ChronoUnit chronoUnit;

    Unit(ChronoUnit chronoUnit) {
        this.chronoUnit = chronoUnit;
    }

    @JsonIgnore
    public ChronoUnit getChronoUnit() {
        return chronoUnit;
    }

    @JsonIgnore
    public boolean isNotTimeUnit() {
        return this.chronoUnit == null;
    }

}
