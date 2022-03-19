package Landlords;

import java.util.Iterator;
import java.util.Objects;

public class Card implements Comparable<Card>,Iterator {
    private int num;
    private String pattern;
    public Card(){}
    public Card(String pattern, int num) {
        this.pattern = pattern;
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    @Override
    public int compareTo(Card o) {
        if (this.num != o.num) {
            return this.num - o.num;
        } else {
            return 1;
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Card card = (Card) o;

        if (num != card.num) {
            return false;
        }
        return Objects.equals(pattern, card.pattern);
    }

    @Override
    public int hashCode() {
        int result = num;
        result = 31 * result + (pattern != null ? pattern.hashCode() : 0);
        return result;
    }

    @Override
    public boolean hasNext() {
        return this.hasNext();
    }

    @Override
    public Object next() {
        return this.next();
    }
}
