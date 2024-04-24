This is a maven project. To execute it, please import it as a maven project in IDE.


###TIME AND SPACE COMPLEXITIES FOR THE METHODS###
### **withdrawCash**(Scanner scanner)
- *Time Complexity*: O(n) where n is the number of times the user provides invalid input before a valid input is received.
  - The getIntInput(Scanner scanner) method called within this method has a linear time complexity based on the number of times it loops to validate input.

- *Space Complexity*: O(1)
  - The space used is constant. It does not depend on the input size or any data structures.

### showRemainingDenominations()
- *Time Complexity*: O(n log n)
  - Sorting the available denominations using Java's sorted() method has a time complexity of O(n log n), where n is the number of available denominations.

- *Space Complexity*: O(n)
  - The space used is proportional to the number of available denominations. The sorted list of denominations is stored temporarily.

### getIntInput(Scanner scanner)
- *Time Complexity*: O(1) for each input attempt
  - The nextInt() method of Scanner has a time complexity of O(1) for each input attempt.
  
- *Space Complexity*: O(1)
  - The space used is constant. It does not depend on the input size.

### withdraw(int amount) (in ATMOperationsImpl)
- *Time Complexity*: O(m * log m), where m is the number of distinct denominations available.
  - The method iterates over the denominations (m times), sorts them (log m for sorting), and performs operations within the loop.
  - Within the loop, it performs constant-time operations like division, subtraction, and map lookups.
  - The overall time complexity is dominated by the sorting of denominations.

- *Space Complexity*: O(m)
  - The space used is proportional to the number of distinct denominations available.
  - It creates a result map of size proportional to the number of denominations used in the withdrawal.

### getAvailableDenominations() (in ATMOperationsImpl)
- *Time Complexity*: O(n log n)
  - Sorting the available denominations using Java's sorted() method has a time complexity of O(n log n), where n is the number of available denominations.

- *Space Complexity*: O(n)
  - The space used is proportional to the number of available denominations. The sorted list of denominations is stored temporarily.
