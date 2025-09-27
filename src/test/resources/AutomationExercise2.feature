Feature: Signup for Automation Exercise site

 
  Scenario: Signup site
    #Initial Signup
		And enter name
    And enter email address
    And click signup
    Then validate it entered to signup page
    #Enter Account Information
    And select title
    And enter password
    And select Date of Birth
    And click offers and preference
    #Address Information
    And enter First name
    And enter Last name
		And enter company
		And enter Address1
		And enter Address2
		And select country
		And enter state
  	And enter city
  	And enter zipcode
  	And enter mobileNumber
  	And clicks create account
  	Then verify the account is created