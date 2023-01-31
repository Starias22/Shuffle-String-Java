# Shuffle-String-Java

This repository is about **shuffling a characters string using java programming language**.

It contains one class file, *Shuffle.java* that contains the suffle function and the main one that call the shuffle one.

The algorithm  is:
 1. to create a list of char from the input char
 2. to create a string builder with the same length as the input string
 3. for each index of the list of char:
 * generate a random index from the size of this list minus 1 
 * remove the char at that index from  the list of char 
 * push it back to the string builder
 4. finaly return the string value of the string builder
     
