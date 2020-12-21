# new feature
# Tags: optional

Feature: A description

  Scenario: User login with valid username and pass word and reset the password
    Given User Navigate to "https://app-v2-staging.buildxact.com/"
    And User Enter username as "shanaka02@email.ghostinspector.com" and Password as "Test@1234"
    And click Login
    Then should display Dashboard title "Buildxact-stg: Dashboard"

    When Click My Profile
    And  Click Reset Password
    Then Confirmation massage should display
    And  user should able to click Logout
    And Close the browser

  When User Navigate to "https://email.ghostinspector.com/shanaka02"
  And Open Password Reset request email
  And Click RESET
  Then Fill Password Field should display
  And Confirm Password Field should display
  When User Enter New Password as "Test@123"
  And Confirm Password as "Test@123"
  And click Confirm
  Then should display Dashboard title "Buildxact-stg: Dashboard"
    And  user should able to click Logout

  When User Enter username as "shanaka02@email.ghostinspector.com" and Password as "Test@1234"
  And click Login
  Then Error Message should display
    And Close the browser