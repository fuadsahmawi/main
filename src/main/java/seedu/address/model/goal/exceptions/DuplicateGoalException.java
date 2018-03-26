package seedu.address.model.goal.exceptions;

import seedu.address.commons.exceptions.DuplicateDataException;

/**
 * Signals that the operation will result in duplicate Goal objects.
 */
public class DuplicateGoalException extends DuplicateDataException {
    public DuplicateGoalException() {
        super("Operation would result in duplicate goals");
    }
}
