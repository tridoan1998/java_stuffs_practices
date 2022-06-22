# Clone the repo into anyone local machine to get the laest code in Java to use for development purpose or debugging or just play around!
Instruction:
1. run the command 'cd <directory>' to go to the directory we want our remote repo to clone into
2. run the command 'git clone https://github.com/tridoan1998/java_stuffs_practices.git' to make a local copy of all the files in remote
Note: origin/HEAD represents the default branch on the remote, which is defined automatically when you clone a repository from the internet.
Every time we commit, Git updates both master and the HEAD pointers to point to the last commit by default.
HEAD is a reference to the last commit in the currently checked out branch. The commit with HEAD->master is what the local master branch is pointing to. origin/master refers to the remote master branch. Once you push the commit to the remote must branch, Git will indicate that origin/master has the commit

# Build a java file:
1. run 'javac <filename>.java' (doing this will build a .class file, which is the binary code that computer understand and run)
2. run 'java <filename>'


