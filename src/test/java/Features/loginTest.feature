# new feature
# Tags: optional

Feature: A description

  Scenario: Login to the Buildxact app with valid username and password
    Given User Navigate to "https://app-v2-staging.buildxact.com/"
    When User Enter username as "shanaka01@email.ghostinspector.com" and Password as "Test@1234"
    And click Login
    Then should display Dashboard title "Buildxact-stg: Dashboard"

  When User Click Logout
  Then Login page title should display as "Buildxact-stg: Login"
