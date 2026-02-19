# CSCI160-CH10-EXERCISES
Programming Exercises From Java Illuminated Book by Anderson and Franceschi  
## Before You Begin:  
**Do not make any changes to any files with Client in the file name.  These are essential for the auto grader to work properly.  If you do make changes to these files, your code will be flagged, and I will replace your code with the originals before running the auto grader again to determine your final grade.**
## Q10_36 Instructions  
For this problem, the *Game.java* class and the *PCBasedGameClient.java* client are included to test your code.  
Within the *PCBasedGame.java* file, write a class encapsulating a PC-based game, which inherits from *Game*.  A PC-based game has the following additional attributes: the minimum megabytest of RAM needed to play the game, the number of megabytes needed on the hard drive to install the game, and the minimum GHz performance of the CPU.  Code the constructor and the *toString* method of the new class.  
### Q10_36 Test  
**Input:**  
*none*  
**Output:**  
```
Creating and printing Game 1: Counterstrike, requiring 256MB ram, 3000MB hd, and 1.8Ghz cpu
description: CounterStrike
Minimum Configuration: RAM: 256 MB; hard disk: 3000 MB; CPU: 1.8 Ghz

Creating and printing Game 1: NFL, requiring 128MB ram, 1500MB hd, and 1.5Ghz cpu
description: NFL
Minimum Configuration: RAM: 128 MB; hard disk: 1500 MB; CPU: 1.5 Ghz

Updating Game 2 to require 256MB ram, 3000MB hd, and 1.8 Ghz cpu
Checking if the two games are equal.
pcbg1 and pcbg2 are not equal

Updating Game 2 description to CounterStrike

Checking if the two games are equal.
pcbg1 and pcbg2 are now equal
```
## Q10_38 Instructions  
For this problem, the *Game.java* class and the *SportsGameClient.java* client are included to test your code.  
Within the *SportsGame.java* file, write a class encapsulating a sports game, which inherits from *Game*.  A sports game has the following additional attributes: whether the game is a team or individual game, and whether the game can end in a tie.  Code the constructor and the *toString* method of the new class.  
### Q10_38 Test  
**Input:**  
*none*  
**Output:**  
```
Generating sg1 with description Soccer, a team sport, a tie is possible.
Generating sg2 with description 100 yards, not a team sport, a tie is not possible.

Printing sg1 and sg2: 
Description: Soccer; Is a team game: true; Can end in a tie: true
Description: 100 yards; Is a team game: false; Can end in a tie: true

Setting sg2 as a team sport
Checking if the two games are equal
sg1 and sg2 are not equal

Setting sg2 description to Soccer

Checking if the two games are equal:
sg1 and sg2 are now equal
```
## Q10_39 Instructions  
For this problem, the *Game.java* class and the *TriviaGameClient.java* client are included to test your code.  
Within the *TriviaGame.java* file, write a class encapsulating a trivia game, which inherits from *Game*.  A trivia game has the following additional attributes: the ultimate money prize and the number of questions that must be answered to win the ultimate money.  Code the constructor and the *toString* method of the new class.  
### Q10_39 Test  
**Input:**  
*none*  
**Output:**  
```
Generating tg1 with description Millionaire, prize of 1000000, 10 questions
Generating tg2 with description Jeopardy, prize of 10000, 50 questions

Printing both games: 
Description: Millionaire
Prize money: $1,000,000.00; Number of questions to answer: 10
Description: Jeopardy
Prize money: $10,000.00; Number of questions to answer: 50

Setting tg2 prize to 1000000 and number of questions to 10
Checking if the games are equal
tg1 and tg2 are not equal

Updating tg2 description to millionaire.
Checking if the games are equal
tg1 and tg2 are now equal
```
## Q10_41 Instructions  
For this problem, the *Store.java* class and the *WebStoreClient.java* client are included to test your code.  
Within the *WebStore.java* file, write a class encapsulating a web store, which inherits from *Store*.  A web store has the following additional attributes: an Internet address and the programming language in which the website was written.  Code the constructor and the *toString* method of the new class.  
### Q10_41 Test  
**Input:**  
*none*  
**Output:**  
```
Generating new WebStore ws1 named Computer Books, Inc. at domain name www.cbi.inc written in java
Generating new Webstore ws2 named Bikes Unlimited at domain name www.bikeshop.com written in perl

Printing both WebStores
name: Computer Books, Inc.; Domain name: www.cbi.inc; Language: java
name: Bikes Unlimited; Domain name: www.bikeshop.com; Language: perl

Setting ws2 domain to www.cbi.inc and language to JAVA
Checking if the two stores are equal
ws1 and ws2 are not equal

Updating ws2 name to Computer Books, Inc.
Checking if the two stores are equal
ws1 and ws2 are now equal
```
## Q10_42 Instructions  
For this problem, the *Store.java* class and the *MusicStoreclient.java* client are included to test your code.  
Within the *MusicStore.java* file, write a class encapsulating a music store, which inherits from *Store*.  A music store has the following additional attributes:  the number of titles it offers and its address.  Code the constructor and the *toString* method of the new class.  
### Q10_42 Test  
**Input:**  
*none*  
**Output:**  
```
Generating new store ms1 named Records, Inc. with 1000 titles located at 123 Elm Street
Generating new store ms2 named All Records Unlimited with 1200 titles located at 999 Green Street

Printing both music stores:
name: Records, Inc.; number of titles: 1000; address: 123 Elm Street
name: All Records Unlimited; number of titles: 1200; address: 999 Green Street

Setting ms2 to have 1000 titles and be located at 123 Elm Street
Checking if the two stores are equal: 
ms1 and ms2 are not equal

Setting the name of ms2 to Records, Inc
Checking if the two stores are equal
ms1 and ms2 are now equal
```
