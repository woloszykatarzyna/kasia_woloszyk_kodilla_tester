package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String stampMark;
    private String stampName;
    private double stampWeight;
    private double stampHeight;

    public Stamp(String stampMark, String stampName, double stampWeight, double stampHeight) {
        this.stampMark = stampMark;
        this.stampName = stampName;
        this.stampWeight = stampWeight;
        this.stampHeight = stampHeight;
    }

    public String getStampMark() {
        return stampMark;
    }

    public String getStampName() {
        return stampName;
    }

    public double getStampWeight() {
        return stampWeight;
    }

    public double getStampHeight() {
        return stampHeight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Double.compare(stamp.stampWeight, stampWeight) == 0 && Double.compare(stamp.stampHeight, stampHeight) == 0 && Objects.equals(stampMark, stamp.stampMark) && Objects.equals(stampName, stamp.stampName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stampMark, stampName, stampWeight, stampHeight);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "stampMark='" + stampMark + '\'' +
                ", stampName='" + stampName + '\'' +
                ", stampWeight=" + stampWeight +
                ", stampHeight=" + stampHeight +
                '}';
    }
}
