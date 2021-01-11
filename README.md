# Android App Development Integrating UX/UI Design
As a graphic artist, I was so entralled to the beauty of designs. May it be posters, typography, logos, and even how softwares were designed. This field taught me how to look at problems and provide solution that are deemed necessary to communicate with other people or the end-user through graphics. With that being said, for how many years now, I've immeresed myself to various principles and fields that interests me, but I still go back to my favorite and this completely lies within the scope of UX/UI design.

The month of August was a hectic month for the team. We brainstormed a solution that will impact the sustainable development goals of the United Nations and minimize the inequality that every individuals is currently facing admist the onset of COVID-19 pandemic. We came up with a solution that will alleviate the students' adversity during these times - develop an SMS-based education platform to facilitate feedback both in modular and online learning.

Not to mention, this solution was hailed second place to a hackathon event [(Youth Co:Lab)](https://www.facebook.com/undp.ph/posts/3580525985336017) sposored by the United Nations Development Program Philippines. This project was given a startup fund to make this aspiration come to life. Not only that, on the international hackathon [(Covergence.tech: Digital Inclusion)](https://drive.google.com/file/d/1GRnalWs-g3-fixTQcqy3pgx9Q4daMdkU/view?usp=sharing) we are completely shocked as we are included to the Top 10 solutions globally with the countries like Canada, USA, Nigeria, India and so many more.

*For more details about the project resources are available for an in-depth idea of the solution* [Demo video](https://www.youtube.com/watch?v=5VZv7o7UUl0&feature=youtu.be), [pitch video](https://drive.google.com/file/d/1rNbLFswEMwGXKCVd7Cbl_LMib8R2XJQD/view?usp=sharing), [mockup](https://drive.google.com/file/d/1Ng7uVhtFaZ64ibE-0vkJkKFkNMHcJ2Kt/view?usp=sharing), [slides](https://drive.google.com/file/d/1wvfytuz3aLI7IqcouSS85nMs4521nFxS/view?usp=sharing) *DISCLAIMER: I am the lead creative of this project. I created the UX/UI design, and the demo video for much detailed visualization of the project*


## Installation
Setting up the necessary environment and prerequisites for the project. Download the installers provided.

#### Prerequisites
- [IntelliJ IDEA](https://www.jetbrains.com/idea/download/#section=windows)
- [Android Studio SDK](https://developer.android.com/studio?authuser=1)
- [Java 15 JDK](https://www.oracle.com/java/technologies/javase-jdk15-downloads.html)

#### Instructions
*For more detailed installation instructions can be found here.*
- [IntelliJ IDEA](https://www.jetbrains.com/help/idea/installation-guide.html)
- [Android Studio SDK](https://guides.codepath.com/android/Installing-Android-SDK-Tools)
- [Java 15 JDK](https://docs.oracle.com/en/java/javase/15/install/overview-jdk-installation.html#GUID-8677A77F-231A-40F7-98B9-1FD0B48C346A)

## Design

### Design Patterns
1. **Creational**

**Builder** - During the development of the app, builder pattern is evidently crucial to building a complex object using simple objects and approaching this on a step-by-step process. The graphical representation which is the UI design classes set to be created first and the flow proceeds.

2. **Structural**

**Bridge** - The overall structure of android development completely relies to this design pattern which cultivates a decoupled abstraction from the actual implementation, hence, providing a bridge structure between these two entities in order to seamlessly work. For instance, the xml classes (graphical representation) needs decouple from with java code of the project in order to grasp the design of the user interface.

3. **Behavioral**

**Mediator** - This pattern is used to decipher complex communications between multiple objects and classes. Not only has that, mediator classes normally handled these complex transmissions between classes. Consequently, maintenance eases for the code and algorithm by loose coupling. Android development is inherently dependent to this behavioral design pattern because of classes being linked with each other. Not to mention, user interface is necessary for the app, so it’s essential to have a mediator class to grasp the complex communications that is happening in the algorithm.

### Design Architecture
1. **Model-View-ViewModel Architectute(MVVM)**

Android development adapts this design architecture because it allows a fast-paced reaction to the design changes. Not only that, it is also easy to test when test-driven-development comes in action. MVVM combines the advantages of separation of conrerns while leveraging the advantages of data bindings.

Basically the MVVM architecture has three components at play and these are: View, ViewModel, and Model. The first component View is solely responsible for the overall structure of the layout displayed on the user’s end. Also, UI logic is mostly executed in this part. Second, ViewModel is the data implementation and commands linked to the View to notify the changes in current state. Consequently, the View receives the message and applies the change. Lastly, Model is more of a non-visual component that has data that is executable.

### UX/UI Design
*The designs are in the Edubuddy Visuals folder*
- [Design](https://drive.google.com/file/d/1PccyYLVzHZxm3GJ8LHilgtDDQRSFljLi/view?usp=sharing)
- [Prototype](https://drive.google.com/file/d/1xJyggVdY3h7j_IfKaVPFiCuGmqhtR558/view?usp=sharing)
- [Mockup Design](https://drive.google.com/file/d/1Ng7uVhtFaZ64ibE-0vkJkKFkNMHcJ2Kt/view?usp=sharing)

## Test-driven Development
The development solely focused on instrumented unit tests where it builds and runs through a physical device in order to check the responsiveness of the user interface. However, this test is slow compared to local unit test but it does give a significant evaluation of the app’s behavior in the long run against actual device hardware. Basically, it emulates the actions of the end user using the app to further test what might not work, hence, failed test and configuring the code. In other words, instrumentation test provides a functional test approach, in effect; more user-oriented especially it deals with a real device to run tests.

Espresso and JUnit4 frameworks were the main player to TDD of the android app. specifically; Espresso tests the state expectations, interactions, and assertions in a cohesive manner alienating the messy implementations in the background. Not to mention, it runs the UI test optimally fast with ease. Consequently, it simulates the test of the app’s behavior through interactions between the view and view model. Basically, it performs UI test in order to grasp the logic, configurations, and limitations behind it.

## Best Practices 
Here's the breakdown of the best practices I've observed throughout the development of this project. Proceed to this [link](https://drive.google.com/file/d/19kbzJT7yA-YBBryQoIfamAriXGP892vd/view?usp=sharing)

## Case Study Research
I made a comprehensive research about the project with regards to the solution. Check out this [paper](https://drive.google.com/file/d/12O708BrfVdLXF07z49t4bjnO2FDxx-Xu/view?usp=sharing)

## YouTube Demo Video
This is a walkthrough process or demo video of the android application software development using the Java programming language. Proceed to the [playlist](https://youtube.com/playlist?list=PL0kq_HLCMKPkUenvoOIrlWuA6qlhD_Q-b)

## API Documentation (JavaDoc)
For more details about the API documentation proceed to this [link](https://drive.google.com/drive/folders/1HXifZVwPhdBfY0wyrJrYm12Wg7KeJNrh?usp=sharing).

## Executable APK File
Install this [APK file](https://drive.google.com/file/d/1zUcZ2S9vp1UCr_bkNgsDOc_QI-H1mhnw/view?usp=sharing) on any Android device. 

## Source Code/Files
*The sources code/files can be seen in the 'master' branch of this repository*

## Softwares
This project would not be possible without these softwares coming to aid the whole process and seamless visualizations.

#### Creative and Front-end Softwares
- Adobe XD CC 2020
- Adobe Illustrator CC 2020
- Adobe Photoshop CC 2020
- Adobe After Effects CC 2020
- Adobe Premiere Pro CC 2020

#### Development and Back-end Softwares
- Android Studio
- IntelliJ Idea 2020
