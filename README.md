# Notes-App

Notes App is used for making short text notes, update when we need them, and trash when we are done. It can be used for various functions as we can add your to-do list in this app, some important notes for future reference, etc. The app is very useful in some cases like when we want quick access to the notes

# Problem Statement:

One of the most used components in our daily life is paper. According to a survey, on an average, a human use 27kgs of paper annually and this thesis is about impact of usage of paper on our environment. Paper can easily be crumpled and messy and Easy to lose or misplace. Difficult to share and understand handwritten document. Also, Prone to spelling error. Piled up papers is unattractive to the eye.

# Proposed Solution: 

This Note-taking applications enable users to type or write on their devices just as they would on paper and allow to access, store and update a note anytime. On average typing is faster than handwriting. One can add links in your notes as references. Can erase or edit text without messing up the pages and has almost unlimited pages to write on

# Screenshots

![image](https://user-images.githubusercontent.com/75130949/148077016-da035c2e-e6ca-44a0-965a-438d2c4ea703.png)
![image](https://user-images.githubusercontent.com/75130949/148077099-fb5f541d-94c9-4280-a4bc-54748fa3d2a8.png)


<b> Functionality & Concepts used: </b>

I built a simple Notes Application in which I have displayed the list of notes in Recycler View which is added by the user. Along with that, I have also able to add a new note to the app. I have used Room Database for storing data in users’ devices. The App has a very simple and interactive interface which helps user to create their notes, also hint text are provided to guide them.

- Constraint Layout: Most of the activities in the app uses a flexible constraint layout, which is easy to handle for different screen sizes.
- Simple & Easy Views Design: Use of familiar audience EditText with hints and interactive buttons made it easier for user to create notes. Apps also uses App Navigation to switch between different screens.
- LiveData & Room Database: We are also using LiveData and Room Database to update & store data provided by user, any changes made by user is updated and shows the time when it was last updated .
- ViewModel : View Modal acts as a communication centre between repository and UI. The ViewModel instances survive Activity/Fragment recreation.
- Repository & Entity: a class that t is mainly used to manage multiple sources of data and an annotated class that is used to describe a database table when we are working with Room
- DAO: used for mapping SQL queries to functions.

<b> Application Link & Future Scope : </b>

To increase the knowledge and efficiency within organizations, sharing and tracking of information has become a priority. Note-taking applications have made a dent in the professional market, with most organizations committed to at least one application. Individually, business professionals may choose to use their own note-taking applications to track their roles within the company.
