Feature: validation of Adactin Hotel Web Application of Order Id Generation 
    Background:
		Given User should launch the Adactin Hotel Web Application Url 
    
     Scenario: validate login page with valid credentials
     
     When User should enter valid username and password
     And Click login Button
    
     
    
    
     When User should select location from dropdown
     And User should select Hotel from dropdown
     And User should select Room Type from dropdown
     And User should select No of Rooms from dropdown
     And User should Enter Checkin Date as per the Format mentioned
     And User should Enter Checkout Date as per the Format mentioned
		 And User should select Adults per Room from dropdown
     And User should select Children per Room from dropdown
		 And click Search button
		
		 
		
		 When user should select the checklist 
		 And click Continue button
		 
		 When User should Enter First Name in the TextBox
		 And User should Enter Last Name in the TextBox
		 And User should Enter Billing Address in the TextBox
		 And User should Enter Credit Card No as per the Format mentioned in the TextBox
		 And User should select Credit Card Type from dropdown
		 And User should select  Month and Year from Expiry Date dropdown
		 And User should Enter CVV Number in the CVV Number TextBox
		 And click BookNow button
		 Then verify and Order id should be displayed to the User
		 Scenario Outline: validation login page with valid and invalid credentials 
		 
		 When User should enter valid "<username>" and "<password>"
     And Click login Button
     Then user able view error message
		 Examples:
		 |username|password|
		|Harsha73|6A3334|
		|Harsha73|Harish123|
		|Harish123|Harsha73|
