# CS305

1. Briefly summarize your client, Artemis Financial, and its software requirements. Who was the client? What issue did the company want you to address?
   Artemis Finacial was a financial company that provided retirement and long term investment planning to its customers. Artemis wanted to ensure that they were not only storing data securely but requiring a secure connection to access its information.

3. What did you do well when you found your client’s software security vulnerabilities? Why is it important to code securely? What value does software security add to a company’s overall well-being?
   I believe that I addressed the issues that I found well. It is important to code securely because it provides the client/user with peace of mind when interacting with the program. Without trust, the company would not last.

5. Which part of the vulnerability assessment was challenging or helpful to you?
   I believe that the vulnerability assessment was helpful when doing code reviews. It gave a starting point and a direction to move in. Instead of trying to randomly find things that were wrong.

7. How did you increase layers of security? In the future, what would you use to assess vulnerabilities and decide which mitigation techniques to use?
   For Artemis Finacial, I added a hashing algorithm to provide certificates that would be used to ensure a secure connection to the data.

9. How did you make certain the code and software application were functional and secure? After refactoring the code, how did you check to see whether you introduced new vulnerabilities?
    I ran a second maven dependency check and wrote a test for the ServerController to check functionality. 

11. What resources, tools, or coding practices did you use that might be helpful in future assignments or tasks?
    I think that the secure coding practices I learned in this course will be useful for future assignments and tasks. I will continue to use OWASP and NIST to follow best practices when creating any web-based project.

13. Employers sometimes ask for examples of work that you have successfully completed to show your skills, knowledge, and experience. What might you show future employers from this assignment?
    The implementation of a server controller and the conversion of a site from HTTP to HTTPS.
