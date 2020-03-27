$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/feature/test.feature");
formatter.feature({
  "line": 2,
  "name": "SoftPedia Application",
  "description": "",
  "id": "softpedia-application",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@softpedia"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Register into softpedia web application",
  "description": "",
  "id": "softpedia-application;register-into-softpedia-web-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@tc_01_Register"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "The user launch and register the application with valid and invalid details",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "Definition_Register.the_user_launch_and_register_the_application_with_valid_and_invalid_details()"
});
formatter.result({
  "duration": 297511008200,
  "status": "passed"
});
formatter.match({
  "location": "Definition_Register.close_the_browser()"
});
formatter.result({
  "duration": 5459837300,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Login into softpedia web applications",
  "description": "",
  "id": "softpedia-application;login-into-softpedia-web-applications",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@tc_02_Login"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "The user launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "clicking on the user icon and enter username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "clicking on the login button",
  "keyword": "And "
});
formatter.match({
  "location": "Definition_Login.the_user_launch_the_application()"
});
formatter.result({
  "duration": 34901197100,
  "status": "passed"
});
formatter.match({
  "location": "Definition_Login.clicking_on_the_user_icon_and_enter_username_and_password()"
});
formatter.result({
  "duration": 1699061900,
  "status": "passed"
});
formatter.match({
  "location": "Definition_Login.clicking_on_the_login_button()"
});
formatter.result({
  "duration": 13973540001,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Search for application",
  "description": "",
  "id": "softpedia-application;search-for-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@tc_03_Search"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "The user launch the softpedia application",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "The User enter the word for search",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "Click go button",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "Download the application in the list",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "Check file is exist or not",
  "keyword": "And "
});
formatter.match({
  "location": "Definition_Search.the_user_launch_the_softpedia_application()"
});
formatter.result({
  "duration": 32161917700,
  "status": "passed"
});
formatter.match({
  "location": "Definition_Search.the_User_enter_the_word_for_search()"
});
formatter.result({
  "duration": 642119400,
  "status": "passed"
});
formatter.match({
  "location": "Definition_Search.click_go_button()"
});
formatter.result({
  "duration": 9797872700,
  "status": "passed"
});
formatter.match({
  "location": "Definition_Search.download_the_application_in_the_list()"
});
formatter.result({
  "duration": 39633871500,
  "status": "passed"
});
formatter.match({
  "location": "Definition_Search.Check_file_is_exist_or_not()"
});
formatter.result({
  "duration": 12033160000,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 24,
  "name": "Send feedback through contact us",
  "description": "",
  "id": "softpedia-application;send-feedback-through-contact-us",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 23,
      "name": "@tc_04_Contactus"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "The user launch the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "click on i named icon and contact us",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "click radio button from the list",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "The user enter \"\u003cmsg\u003e\" and \"\u003cemailid\u003e\" for contactus page",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "clicking on send button",
  "keyword": "And "
});
formatter.examples({
  "line": 31,
  "name": "",
  "description": "",
  "id": "softpedia-application;send-feedback-through-contact-us;",
  "rows": [
    {
      "cells": [
        "msg",
        "emailid"
      ],
      "line": 33,
      "id": "softpedia-application;send-feedback-through-contact-us;;1"
    },
    {
      "cells": [
        "hello",
        "malarvizhimarie@gmail.com"
      ],
      "line": 34,
      "id": "softpedia-application;send-feedback-through-contact-us;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 34,
  "name": "Send feedback through contact us",
  "description": "",
  "id": "softpedia-application;send-feedback-through-contact-us;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@softpedia"
    },
    {
      "line": 23,
      "name": "@tc_04_Contactus"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "The user launch the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "click on i named icon and contact us",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "click radio button from the list",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "The user enter \"hello\" and \"malarvizhimarie@gmail.com\" for contactus page",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "clicking on send button",
  "keyword": "And "
});
formatter.match({
  "location": "Definition_ContactUs.the_user_launch_the_browser()"
});
formatter.result({
  "duration": 23903225800,
  "status": "passed"
});
formatter.match({
  "location": "Definition_ContactUs.click_on_i_named_icon_and_contact_us()"
});
formatter.result({
  "duration": 22969693800,
  "status": "passed"
});
formatter.match({
  "location": "Definition_ContactUs.click_radio_button_from_the_list()"
});
formatter.result({
  "duration": 3670600800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "hello",
      "offset": 16
    },
    {
      "val": "malarvizhimarie@gmail.com",
      "offset": 28
    }
  ],
  "location": "Definition_ContactUs.The_user_enter_and_for_contactus_page(String,String)"
});
formatter.result({
  "duration": 5986998500,
  "status": "passed"
});
formatter.match({
  "location": "Definition_ContactUs.clicking_on_send_button()"
});
formatter.result({
  "duration": 8971574799,
  "status": "passed"
});
formatter.scenario({
  "line": 37,
  "name": "Softpedia News Calendar",
  "description": "",
  "id": "softpedia-application;softpedia-news-calendar",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 36,
      "name": "@tc_05_Calender"
    }
  ]
});
formatter.step({
  "line": 39,
  "name": "Launch the browser for calendar",
  "keyword": "Given "
});
formatter.step({
  "line": 40,
  "name": "Select month and year",
  "keyword": "Then "
});
formatter.step({
  "line": 41,
  "name": "Select the date",
  "keyword": "Then "
});
formatter.step({
  "line": 42,
  "name": "Scroll and click any news",
  "keyword": "And "
});
formatter.match({
  "location": "Definition_Calendar.launch_the_browser_for_calendar()"
});
formatter.result({
  "duration": 28900706701,
  "status": "passed"
});
formatter.match({
  "location": "Definition_Calendar.select_month_and_year()"
});
formatter.result({
  "duration": 3269664000,
  "status": "passed"
});
formatter.match({
  "location": "Definition_Calendar.select_the_date()"
});
formatter.result({
  "duration": 9339375000,
  "status": "passed"
});
formatter.match({
  "location": "Definition_Calendar.scroll_and_click_any_news()"
});
formatter.result({
  "duration": 13554810000,
  "status": "passed"
});
formatter.scenario({
  "line": 45,
  "name": "Navigation to the next page",
  "description": "",
  "id": "softpedia-application;navigation-to-the-next-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 44,
      "name": "@tc_6_NextPage"
    }
  ]
});
formatter.step({
  "line": 47,
  "name": "The user Launch the application for nextpage",
  "keyword": "Given "
});
formatter.step({
  "line": 48,
  "name": "Scroll Down and click next page",
  "keyword": "Then "
});
formatter.match({
  "location": "Definition_NextPage.the_user_Launch_the_application_for_nextpage()"
});
formatter.result({
  "duration": 28877421600,
  "status": "passed"
});
formatter.match({
  "location": "Definition_NextPage.scroll_Down_and_click_next_page()"
});
formatter.result({
  "duration": 15724717100,
  "status": "passed"
});
});