# Uncommon Java Error Handling Bug
This repository demonstrates a scenario where an ArrayIndexOutOfBoundsException is caught but then re-thrown as a RuntimeException, potentially masking the root cause.  The solution shows how to handle the exception more effectively.

## Bug Description
The `UncommonBug.java` file contains a `main` method that attempts to access an element outside the bounds of an array.  A `try-catch` block handles the `ArrayIndexOutOfBoundsException`, but instead of providing informative logging or recovery, it throws a `RuntimeException`, wrapping the original exception. This makes debugging more difficult as the root cause is obscured.

## Solution
The `UncommonBugSolution.java` file provides a corrected version. Instead of re-throwing a `RuntimeException`, it logs the original exception's message and stack trace, providing more context for debugging and error analysis.