Feature: Agile Story:
  As a user I should be able to send messages by clicking on message tab under Active Stream


  Background:
    Given User is on the loginpage
    When User enter "<username>" and "<password>"
    Then user should be able to see "<expectedTitle>"
      | username                       | password | expectedTitle |
      | helpdesk1@cybertekschool.com   | UserUser | Portal        |
#      | marketing25@cybertekschool.com | UserUser | Portal        |
#      | marketing26@cybertekschool.com | UserUser | Portal        |


  Scenario: 1-User should be able to click on upload files icon to upload files and pictures from local disks,
  download from external drive, select documents from bixtrix24, and create files to upload.

    Given user is on the portal page
    When user click on upload files icon
    Then user select files from local disk
    Then user download files from external drive
    And user creates files to upload

  Scenario: 2-User should be able to add users from selecting contact from E-mail user,
  Employees and Departments and Recent contact lists.

    Given user is on the portal page
    When user click Add Persons button
    Then user able to see add users from "<list>"
      | <list>                    |
      | Recent                    |
      | Employees and Departments |
      | E-mails Users             |

    Scenario: 3.User should be able to attach link by clicking on the link icon.

      Given user is in the portal page
      When user clicking on the link icon
      Then user attachs link succesfully