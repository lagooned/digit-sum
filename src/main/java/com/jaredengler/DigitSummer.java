
package com.jaredengler;

import java.util.ArrayList;
import java.util.List;

public class DigitSummer {

    public Integer reducedSum(final Integer n) {
        final List<String> chars = createArrayOfCharsFrom(n);
        final Integer totalSum = reducedDigitSum(chars);
        return totalSum;
    }

    Integer reducedDigitSum(final List<String> chars) {
        if (chars.size() == 1)
            return Integer.valueOf(chars.get(0));
        final Integer partialSum = reducedPartialSum(chars);
        return reducedDigitSum(createArrayOfCharsFrom(partialSum));
    }

    Integer reducedPartialSum(final List<String> chars) {
        final Integer partialSum = chars.stream()
            .map(Integer::valueOf)
            .reduce(0, (acc, next) -> acc + next);
        return partialSum;
    }

    List<String> createArrayOfCharsFrom(final Integer n) {
        final List<String> digits = new ArrayList<String>();
        for (final char c : n.toString().toCharArray()) digits.add(String.valueOf(c));
        return digits;
    }

}
