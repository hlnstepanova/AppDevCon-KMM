# Getting Ready

Install latest [Android Studio version](https://developer.android.com/studio/preview) (I’m using Flamingo 2022.2.1). 

Make sure your Kotlin Plugin has 1.8.x version.

<img width="583" alt="Screenshot 2022-09-04 at 19 21 46" src="https://user-images.githubusercontent.com/12126043/188325696-21f7f738-90f6-499d-9aec-74587fec3aa9.png">

Make sure you have Ruby gem installed.
`gem list`

Make sure you have Java JDK installed.
`java --version`

To use the Android KMM Wizard Template, first you need to install a KMM plugin and restart AS.

<img width="508" alt="Screenshot 2022-09-03 at 11 53 31" src="https://user-images.githubusercontent.com/12126043/188325535-67ef7142-5a8e-4e07-a7ce-454774f36ff4.png">


Clone the repository and try opening the starter project. 
Sync the dependencies:

<img width="338" alt="Screenshot 2022-09-03 at 13 26 34" src="https://user-images.githubusercontent.com/12126043/188325603-26d97612-a295-4111-afc2-5bd36cb10f72.png">

Build and run the app.

<img width="461" alt="Screenshot 2022-09-03 at 13 27 11" src="https://user-images.githubusercontent.com/12126043/188325610-64cf4d94-9eee-4a71-b7b8-958de8e84dd9.png">


If the emulators starts, then everything is fine.

<img width="264" alt="Screenshot 2022-09-03 at 13 29 33" src="https://user-images.githubusercontent.com/12126043/188325562-494b83e2-42d1-4a08-86e0-0e3dff6627ad.png">

## If you run into a problem, it may be one of these:

### If you have a Apple M1 Chip and the next command in terminal returns empty:

`echo $LANG`

Then in terminal:

`open -e ~/.zshrc`

And add this line to the opened file:

<b>export LANG=en_US.UTF-8</b>

After saving your .zshrc file, you must run next command:

`source ~/.zshrc`

### If you’re running into Java JDK problem, do the following:
 1) `/usr/libexec/java_home -V`
 
 Your output should be something like:
 
18 (arm64) "Oracle Corporation" - "OpenJDK 18" …/Library/Java/JavaVirtualMachines/openjdk-18/Contents/Home
    1.8.0_292 (x86_64) "AdoptOpenJDK" - "AdoptOpenJDK 8" /Library/Java/JavaVirtualMachines/adoptopenjdk-8.jdk/Contents/Home

 2) `brew install openjdk@11`
 
`sudo ln -sfn /opt/homebrew/opt/openjdk@11/libexec/openjdk.jdk /Library/Java/JavaVirtualMachines/openjdk-11.jdk`

 3) `/usr/libexec/java_home -V`
 
  Your output should be something like:
 
18 (arm64) "Oracle Corporation" - "OpenJDK 18" …/Library/Java/JavaVirtualMachines/openjdk-18/Contents/Home
    11.0.15 (arm64) "Homebrew" - "OpenJDK 11.0.15" /opt/homebrew/Cellar/openjdk@11/11.0.14.1/libexec/openjdk.jdk/Contents/Home
    1.8.0_292 (x86_64) "AdoptOpenJDK" - "AdoptOpenJDK 8" /Library/Java/JavaVirtualMachines/adoptopenjdk-8.jdk/Contents/Home

 4) `open ~/.zshrc`
 
In zshrc add and save: <b>export JAVA_HOME=$(/usr/libexec/java_home -v 11.0.15)</b>

 5) `export JAVA_HOME='/usr/libexec/java_home -v 11.0.15\'`

