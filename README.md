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
Open terminal(cmd) and navigate:</br>
`npx create-react-app my-app`</br>
`cd my-app`</br>
`npm start`</br>
Open source in Visual Studio Code.

## Available Scripts

In the project directory, you can run:

npm start</br>
npm test</br>
npm run build</br>
npm run eject</br>
npm run build

## Learn More

You can learn more in the [Create React App documentation](https://facebook.github.io/create-react-app/docs/getting-started).

To learn React, check out the [React documentation](https://reactjs.org/).

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

             `});`


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
