@device_windows10 @author_Halcyon-CSN
Feature: Halcyontek Speedline.AI --Combo Meals

Scenario Outline: Sub items checking under - 4 Express Tenders Combo 
Given user able to launch browser and select Place of service for "<product category>"
And I click on "Green" color vehicle model "Truck" with Lane "Lane1"
When I click the product "4 Express Tenders Combo"
