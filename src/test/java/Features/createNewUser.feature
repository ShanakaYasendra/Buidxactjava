# new feature
# Tags: optional

Feature: A description

  Scenario: Create New user and login with new user
    Given User Navigate to "https://app-v2-staging.buildxact.com/"
    And User Enter username as "shanaka02@email.ghostinspector.com" and Password as "Test@123"
    And click Login
    Then should display Dashboard title "Buildxact-stg: Dashboard"


    When Click My Business
    And Click Add Users
    And Click + button
    Then New user form should display

  When user enter first name as "sha2"
  And last name as "Sha2"
  And email as "sha2@email.ghostinspector.com"
  And mobile number as "0430777777"
  Then User should click create

  When User Navigate to "https://email.ghostinspector.com/sha2"
  And Open Activate email
  And Click "ACTIVATE"
  Then Fill Password Field should display
  And Confirm Password Field should display


    When User Enter New Password as "Test@123"
    And Confirm Password as "Test@123"
    And click Confirm
    Then should display Dashboard title "Buildxact-stg: Dashboard"
    And  user should able to click Logout

