-------------------------------------------------------------------------------------------------------------------------------
|                                                                                                                             |
|                                                Ryustem Shaban                                                               |
|                                                   rs223fx                                                                   |
|                                                                                                                             |
|                                    Object-oriented programming assignment 1                                                 |
|                                                                                                                             |
-------------------------------------------------------------------------------------------------------------------------------
|                                                                                                                             |
| The aim of this document is to describe key points within each of the asked programs to be done and state all the necesarry |
| references.                                                                                                                 |
|                                                                                                                             |
------------------------------------------------------------------------------------------------------------------------------
|                                                                                                                             |
| Task 1 --> Time                                                                                                             |
|                                                                                                                             |
| There isn't much to say about task 1, was done previously in the Introduction to programming course exactly the same        |
| program, therefore followed the same logic.                                                                                 |
|                                                                                                                             |
------------------------------------------------------------------------------------------------------------------------------
|                                                                                                                             |
| Task 2 --> Hit a nine                                                                                                       |
|                                                                                                                             |
| Tried to follow the instructions and implement all the possible outcomes respecting the conditions given within the         |
| assignment, very briefly the program takes input and regarding the if statements filters which lines to be executed.        |
| My drawback for that program was I used a lot of if statements and some may be redundant and there could be possible and    |
| simplier solution since the program that is written by me is hard to follow, however will consider that for the upcoming    |
| assignments.                                                                                                                |
|                                                                                                                             |
-------------------------------------------------------------------------------------------------------------------------------
|                                                                                                                             |
| Task 3 --> Dangerous Work                                                                                                   |
|                                                                                                                             |
| The program was quite simple compared to Hit a nine and with less redundancy which opens path to easy-to-follow structure.  |
| Took double "endvalue" since compounding starts with 0.02 and each time the while loop runs doubled the endvalue until it   |
| becomes more than or equal to the desired money input taken by the user.                                                    |
|                                                                                                                             |
-------------------------------------------------------------------------------------------------------------------------------
|                                                                                                                             |
| Task 4 --> Diamonds                                                                                                         |
|                                                                                                                             |
| Diamond printer was not that challenging neither since as previously stated, we were introduced to this kind of program on  |
| the previous courses. The program contains while loop which keeps asking for user input as an integer until negative number |
| is given however keeping the Scanner outside of the while loop, because if it is inside the program will ask one time and   |
| will never go out of the loop and ask for another input. Stopping loop with given negative number was basically just adding |
| an if statement within the loop. Rest of the logic was just try and fail printing the stars and spaces appropriately        |
| while keeping in mind that not only to left side should be included spaces, but thinking bothways.                          |
|                                                                                                                             |
-------------------------------------------------------------------------------------------------------------------------------
|                                                                                                                             |
| Task 5 --> Scissors, Rock, Paper                                                                                            |
|                                                                                                                             |
| Started with 3 empty variables to keep track of the scores followed with a while loop. Implemented all the possibilities for|
| both the bot and the user with simple if and else statements while incrementing the corresponding scores by one for each    |
| choice. Adittionally implemented the requirement that when the computer rolls more or equal to four it will not roll again  |
| which may caused a little redundancy, however tried to cover all the possibilities. Overall was easy program as an idea,    |
| however hard to follow from time to time, could be much better if used one or two additional methods by my side, however    |
| at that time we were not introduced with the methods so did not done that. Will consider using methods were applicable for  |
| the upcoming assignments.                                                                                                   |
|                                                                                                                             |
-------------------------------------------------------------------------------------------------------------------------------
|                                                                                                                             |
| Task 6 --> Day of week                                                                                                      |
|                                                                                                                             |
| This was easiest to write program in my case since the formula and everything was given, the only thing to be consider was  |
| the first and the second month, it was stated that if the month was January or February we was supposed to take the month as|
| thirteen and fourteen respectfully decrementing the year by one. Achieved that with just simple if statement giving a new   |
| value if the month input was equal to one or two and decrementing the year by one at the same time.                         |
|                                                                                                                             |
-------------------------------------------------------------------------------------------------------------------------------
|                                                                                                                             |
| Task 7 --> The ant                                                                                                          |
|                                                                                                                             |
| This program was a bit more challenging compared to the previous ones. Started with implementing the board by making 2D     |
| array with lenght eight for the rows and the collumns filled with zeroes. Zero within the array will stand for a square that|
| ant wasn't visited before, and one within the board will be stating that the ant had visited the current square before.     |
| Followed it with a while loop for ant to do random movements until it visits all the squares withing the 2D array by        |
| incrementing the value of steps by one each time the while loop executes. Then implemented the ant as a list with two       |
| random indexes which are objectively simulating where the ant drops within the board randomly. Index zero of the ant is     |
| the y axis and index one is the x axis. First statement is as folows:                                                       |
|                                                                                                                             |
| "if (board[ver][hor] == 0)  {                                                                                               |
|  counter++;                                                                                                                 |
|  board[ver][hor] = 1; "                                                                                                     |
|                                                                                                                             |
| Which briefly works as a checker if the ant was in the current given random x and y indexes before or not if it wasn't it   |
| increments the counter variable by one (end value of counter variable will be sixtyfour which stands for the whole board)   |
| and will follow with another if statement to check if the ant is near the wall or not, if the case is that the ant is going |
| out of the borders it will bring back the ant to the border again and decrease total steps by one each time ant tries to go |
| out of the border, the idea behind that is to make that specific loop instance neutral (As it never happened (I believe     |
| there may be a better way to do that since this will make a lot of more additional loops, however this was the only idea I  |
| managed to think about)) othervise it will move the ant to the corresponding direction incrementing x or y axis of the      |
| matrix. Same kind of checker exist for when the ant steps to a square where it was before, but the difference here is so    |
| simple, we are just not incrementing the counter rest of the operations are spammed as previously. Once the counter hits 64 |
| it will break the loop and when 10 simulations are done will project the results.                                           |
|                                                                                                                             |
-------------------------------------------------------------------------------------------------------------------------------
|                                                                                                                             |
| Task 8 --> HexToDecimal                                                                                                     |
|                                                                                                                             |
| This exercise wasn't challenging as well, started with checking the example and tried to come up with a simple algorithm    |
| and when found it basically applied for all the instances and executed the program as it was supposed to be respecting the  |
| given conditions. Started with iterating over the input and seperating the letters and numbers and used "isDigit" method    |
| and applied the algorithm for the numbers. The idea behind the algorith was to take the number and apply the formula raising|
| it the power (power part was the only thing that was trickier in that case, however doing i + 1 did solved it since the     |
| iteration starts with 0 (could have made "i = 1" and start from there as well, but did not tought about that idea before,   |
| thought of it at the time of writing the README file)) and adding the value returned to hex variable. For the numbers used  |
| switches listing the letters from a-f seperate formula for each of them since each of the letters corresponds to unique     |
| value. Finally used the method within the main and finished the program.                                                    |
|                                                                                                                             |
-------------------------------------------------------------------------------------------------------------------------------
|                                                                                                                             |
| Task 9 --> Calendar                                                                                                         |
|                                                                                                                             |
| No wonders that the last exercise was the most challenging one, some additional information for this task was found and     |
| taken from the internet, these resources will be referenced in the end of the README file. The program starts with          |
| checking the provided year by the user if it is Leap year or not since this may influence the calendar output as well.      |
| The method basically only contains a mathemtical condition for the year input and returns boolean value. Followed with      |
| another basic method to get the name of the month returning string. Then comes numOfDaty method which checks the month input|
| and returns corresponding day count value (this method happened to be too vague since we already know which month have how  |
| many days and just stated them on an if statement without any algorithm, however simplicity can be a key sometimes),        |
| Adittionally there is a special condition for February which uses the leap year method to identify correctly the February   |
| value, since it is dynamic month. Template which basically uses the previous MonthName method to print the corresponding    |
| month as a string as it was required. Then took the firstday of month to be able to appropriately know from which day the   |
| month starts (This will help us to identify from where to start the for loop and once the first day is found the rest of the|
| days will follow the same principle). start1800 = 3 refers that the 1800th year started on Wednesday and from there on does |
| uses modulo operation on the total number of days in a year plus three with 7, that way we always get the first day of the  |
| month. Finally using all the methods within the main method with appropriate for loops to print out the days adding empty   |
| three spaces if the month doesn't start from Monday and adding three empty spaces for one decimal numbers and two spaces    |
| for two decimal numbers of the month followed with plus "i". All the necesarry references for this exercise will be stated  |
| in the end of this file.                                                                                                    |
|                                                                                                                             |
| Adittional information                                                                                                      |
|                                                                                                                             |
| Firstly went for this program using the method from "Days of the week" exercise iterating with for loop to get each day of  |
| the month with switch cases to add string value to each of them using Hashmapping, however this did not worked out well     |
| since I was using the "i" value from the iteration to attach a numeric value for each of the days and it was either going   |
| out of the index or giving me one day back, and when I set the "i" value to one instead of zero it was popping up from      |
| another place, but I still strongly believe that this exercise could be done that way also, it was just me, that I do not   |
| have enough knowledge to be able to fulfill the requirements that way.                                                      |
|                                                                                                                             |
-------------------------------------------------------------------------------------------------------------------------------
|                                                                                                                             |
| REFERENCES                                                                                                                  |
|                                                                                                                             |
| LeapYear - https://www.programiz.com/java-programming/examples/leap-year                                                    |
|                                                                                                                             |
-------------------------------------------------------------------------------------------------------------------------------
