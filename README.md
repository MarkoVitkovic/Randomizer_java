# Hotel Resort
> Project made with react. Hotel resort app. 

## Table of contents
* [General info](#general-info)
* [Screenshots](#screenshots)
* [Technologies](#technologies)
* [Setup](#setup)
* [Features](#features)
* [Status](#status)
* [Inspiration](#inspiration)
* [Contact](#contact)

## General info
Site made with react, node.js and CSS3. On front page you will find three types of rooms, go and check, and when you open one of them, 
you will see info about that room, also in navbar you have "rooms" option, there are all rooms from hotel, you can search rooms by 
filters, see image below.

## Screenshots
![](https://github.com/MarkoVitkovic/react-hotelResort/blob/master/rooms.png)

## Technologies
* [React](https://reactjs.org/docs/getting-started.html) - version 16.13.1
* [Node.js](https://nodejs.org/en/docs/) - version 13
* [CSS](https://devdocs.io/css/) - version 3
* [React-dom](https://github.com/facebook/react) - version 16.13.1


## Setup
To create your new Android project, follow these steps:</br>

1.Install the latest version of Android Studio.</br>
2.In the Welcome to Android Studio window, click Start a new Android Studio project.</br>
[](https://developer.android.com/training/basics/firstapp/images/studio-welcome_2x.png)</br>
3.In the Select a Project Template window, select Empty Activity and click Next.</br>
4.In the Configure your project window, complete the following:</br>
*Enter "My First App" in the Name field.</br>
*Enter "com.example.myfirstapp" in the Package name field.</br>
*If you'd like to place the project in a different folder, change its Save location.</br>
*Select either Java or Kotlin from the Language drop-down menu.</br>
*Select the lowest version of Android your app will support in the Minimum SDK field.</br>
*If your app will require legacy library support, mark the Use legacy android.support libraries checkbox.</br>
*Leave the other options as they are.</br>
5.Click Finish.</br>




## Code Examples
Code:</br>
`protected void onCreate(Bundle savedInstanceState) {`</br>
 `       super.onCreate(savedInstanceState);`</br>
  `      setContentView(R.layout.activity_main);`</br>


   `      button = findViewById(R.id.button);`</br>
    `     textView = findViewById(R.id.textViewResult);`</br>
     `    editText = findViewById(R.id.editTexts);`</br>
 `       button.setOnClickListener(new View.OnClickListener() {`</br>
       `          @Override`</br>
        `         public void onClick(View v) {`</br>
  `            Random rand = new Random();`</br>
          `           text = Integer.parseInt(editText.getText().toString());`</br>
           `          random = rand.nextInt(text) + 1;`</br>
            `         textView.setText("" + random);`</br>
             `    }`
     `});`</br>


## Features
List of features ready and TODOs for future development
* Generate random number 

To-do list:
* none

## Status
Project is: _finished_

## Inspiration
As a project for my study.

## Contact
Created by [Marko Vitkovic](https://github.com/MarkoVitkovic) - feel free to contact me!








his randomizer will generate a random number. This is app for android.

Feel free to clone and upgrade app.


![](https://github.com/MarkoVitkovic/Randomizer_java/blob/master/random.png)
