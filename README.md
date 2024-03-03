
– In this project, I contributed to the validation and enhancement of the AdactIn Hotel Application using Automation
Testing / Manual Testing . The primary objective was to ensure accurate order ID generation during hotel reservations.
– in Java using Selenium WebDriver, JUnit, and Cucumber for the AdactIn Hotel App.
– IDE and Dependency Management: Utilized Eclipse IDE and Maven to streamline development and ensure code
consistency.
– Validated login functionality, ensuring successful authentication.
– Verified that the check-out date field correctly accepts dates later than the check-in date.
– Calculated total prices accurately based on room rates, duration, and additional charges.
– Ensured alignment between booking confirmation details and user selections.
– This project honed my skills in test automation, Java programming, and collaboration within an Agile development
environment. It showcases my ability to contribute to quality assurance processes and enhance user experiences



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
