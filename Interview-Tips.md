####Setting expectations:     
If this is your first time looking for a job, or you haven't had to interview in a number of years, expect to invest some effort in preparing for the interview. It's usually the industry professionals that completely ignore this step, but some college students do as well. You're essentially studying for a test, don't slack off - it's going to be work. All of those things that you've been telling yourself don't matter (maybe you're a bit fuzzy on how exactly the internet works - do you really know what happens after you hit enter on the URL bar?) that you don't know - now it's time to address those gaps head on. So, what matter.
For the sake of space, I'm going to focus on what a fresh grad needs to do to prepare and that's more consistent across companies (and it's a shorter list).      
**Data Structures**      
Go to wikipedia and read the whole page of each of these a few times, then write your own (for real, actually write the code and play with this stuff - that is the most important part)
* Array
* Linked List
* Stack/Queue
* Trees (Tree, Binary Tree, Binary Search Tree, Red-Black Tree, etc. Learn as many as you can)
* Heap
* Hash Table (this is really important - understand all of the different collision mitigation mechanisms, understand what amortized constant-time means)
* Directed/Undirected/Weighted Graphs
* Trie (pronounced "tree")
* Linked Hash Map (this is very specific, but comes up a LOT in interviews)

You should know the Big-O for insert, delete, lookup, etc. for each of these. Know how the mechanics work. It isn't a good interview questions, but you should be able to code every single one of these. Then, prepare real-world examples of when you'd want to use each of these and explain why it's the best choice. Data Structures come up in technical interviews in two way. The first is in coding questions where you're expected to use the right one at the right time. The second is on a comparison question - not connected to code - "why would you use X over Y in situation Z."   

**Algorithms**    
Again, make sure you actually code these for real when practicing. Simply reading code someone else wrote will not cut it. Open up your favorite IDE and start typing. This is critical because often times you actually have a gap in your knowledge, but your scumbag brain convinces you it's ok (this happens without you even realizing it). The only way to find these gaps is by writing code. Know all of the Big-O for this and how it's derived.

You don't have to go crazy here, but review a couple of:
- Sorting algorithms (both comparison sorting and non-comparison sorting)
- Tree traversals (just memorize all of these inorder, preorder, postorder, level order)
- Traversals - Dijkstra's, A*, BFS, DFS (know the difference between DFS and BFS when would you use one over the other and why hint, is usually matters when you don't have to search the whole space. Also make sure that you can code recursively and using your own stack/queue)
- All the prefix-tree searches

Great, you're about 60% done now. Now you need to practice applying this knowledge. Find a source of interview questions (random websites, glassdoor.com, cracking the coding interview, etc.) Code answers to those questions. I strongly recommend forcing yourself to pretend you're in an interview setting. Most of these questions should be solvable in ~10-15 minutes, some will be more like 20-25. Time yourself. Before you write a single line of code, organize your thoughts and figure out the entire solution, then start coding. The coding part should be boring and straightforward. In the actual interview, do the same thing. Before you write a single line of code, make sure that you validate with the interviewer that your approach is a good one. Practice practice practice this stuff.

**Fill Gaps**
- This is where you get to be honest with yourself. That long list of things you don't know that you keep telling yourself is ok because the stuff you don't know isn't actually important....well, it is. Even if it isn't, your interviewer might think it is and it's better to have a job than be right. Here's a list off the top of my head that I hear people say isn't important (but you really should know).

- Writing code - (I put this here half as a joke. I can't tell you how many people with 15+ years of experience lose their mind when I ask them tow write some code with me. These "architects" do not end up getting jobs. Same goes for managers and other support positions. I know that you're not going to write production code, that's fine - you should be able to write some code, though.)

- Bits and Bytes - Yes, you should understand how all that bitshifting stuff works in whatever language you're going to interview with. You should know what big and little endian are. Do a couple practice questions, even simple one. Try something like..."write a method to determine if the bit-wise representation of an integer is a palindrome."

- How the internet works. This applies more to companies....yeah....it applies to everything these days. You should know how sockets work, you should know what TCP/IP is. You should know what HTTP actually is. Learn your networking layers and what's responsible for what You don't need to know all of the details of the protocols, but you should know some of them and that they exist. This sounds daunting, it should only take a couple of hours.

- Databases. Learn some basic SQL and data modeling if the job you're applying for uses databases.

- Learn a bit about testing. Write some code and test it. What's TDD

- If you've only ever used Windows....consider using linux for a bit.
- Whatever else you can think of. A good mental exercise is to imagine yourself in an interview..."man, I hope they don't ask me about X." Figure out what X is and read about it.

The good news is, the things on this list usually are far easier to learn than you think they will be. These are usually scars from undergrad or gaps from a non-traditional route to CS that sound hard. They're all easier to tackle than you think.

**Behavioral**    
- Alright, almost done. Tech interviews aren't all about tech (they mostly are these days, but not completely). You need to come across as someone people want to work with. Smile, be energetic, be excited about the company, know what they do, have ideas about what they could be doing. You're almost certainly going to encounter some behavioral interview questions. You can prepare for these. I suggest coming up with 3 situations where you were working on a tech project and things went well, and 3 stories for when things didn't go well. Then practice telling the stories, make sure to include some setup information, what was the setting, what was the project, who was working with you, what was your role...then tell the story....then for the positive stories talk about the impact of your work, did you win, save the company money, what? For the negative stories, finish up by talking about what you learned and how you'd approach the problem differently in the future.

**Parting Words**

Get a good nights sleep and do the best you can. Expect to fail at some of these interviews, that's ok, treat it as a learning experience and recognize that there are both good and bad interviewers. It's possible for a terrific candidate to get thrown to a bunch of shitty interviewers and not end up with a job (happens more than people like to talk about). That isn't to say that you should use this as an excuse to not learn from the experience, but interviewing is a game. Don't try and fight the rules or think it's stupid. It is what it is and that's what's standing between you and the job you want. Learn to play the game and win by practicing :-)

Best of luck, sorry for the typos. For the people just getting started, you aren't a fraud, we all know how little fresh college grads know, we factor that in to the ramp-up process. Be prepared to work hard.
