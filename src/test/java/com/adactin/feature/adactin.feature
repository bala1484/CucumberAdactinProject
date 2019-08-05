Feature: Adacting End to End  Testing

Background: User ablet to launch the Browser
Given User is able to Launch the application
When User is able to enter the UserName in the Login page
And User is able to enter the Password in the Login page
And User is able to click the login button
Then User verify the account name


Scenario Outline: User is able to select the room details

When User able to select the location
And User able to select the hotel
And User able to select the room type
And User able to select number of rooms
And User able to select <checkin date> in checkin date box
And User able to select <checkout date> in checkout date box
Then User able to click the search button
And User able to logout the application

Examples:
|checkin date								|checkout date|
|04/08/19											|02/08/19				 |
