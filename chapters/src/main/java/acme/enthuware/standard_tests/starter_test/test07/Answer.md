# Explanation

C.

(A. Invalid answer)

    `..\\..\\..\\..\\index.html`
This would have been the correct answer in Java 8. But implemention of relativize has changed in Java 11.

(C. Valid answer)

    `..\\index.html`
In Java 11, relativize normalizes the paths before computation. Thus, you need to work it out after assuming p1 to be c:\\personal\\readme.txt and p2 to be: c:\\personal\\index.html.

Now, if you append "..\index.html" to p1, you will get p2. Therefore, this is the right answer.  

c:\personal\readme.txt + ..\index.html  
=>c:\personal + \index.html  
=>c:\personal\index.html

A ".." implies parent folder, therefore imagine that you are taking off one ".." from the right side of the plus sign and removing the last name of the path on the left side of the plus sign.
