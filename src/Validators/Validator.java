package Validators;

import Exceptions.GreatherThanZeroException;

import java.util.List;

public abstract class Validator {
    public static boolean validateLengths(List<Integer> listOfNumbers) {
        boolean success = true;

        for (Integer number: listOfNumbers) {
            if (number <= 0) {
                success = false;
                break;
            }
        }

        return success;
    }

    public static void validateLengthsWithException(List<Integer> listOfLengths) throws GreatherThanZeroException {
        boolean success = validateLengths(listOfLengths);

        if (!success) {
            throw new GreatherThanZeroException();
        }
    }
}
