# new feature
# Tags: optional

Feature: A description

  Scenario: Create New user and login with new user
    Given User Navigate to "https://app-v2-staging.buildxact.com/"
    And User Enter username as "shanaka02@email.ghostinspector.com" and Password as "Test@1234"
    And click Login
    Then should display Dashboard title "Buildxact-stg: Dashboard"


    When Click My Business
    And Click Add Users
    Then New user form should display

  When user enter first name as "Sam"
  And last name as "Sha"
  And email as "sam@email.ghostinspector.com"
  And mobile number as "0430777777"
  And click create
  Then User should create

  When user Navigate "https://email.ghostinspector.com/sam"
  And Open Password Reset request email
  And Click ACTIVATE
  Then Fill Password Field should display
  And Confirm Password Field should display
  When User Enter username as “” and Password as “”
  And click Login
  Then User should display Dashboard
