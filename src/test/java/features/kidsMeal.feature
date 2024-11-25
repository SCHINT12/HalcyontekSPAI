@device_windows10 @author_Halcyon-CSN
Feature: Halcyontek Speedline.AI --KidsMeal
@KidsMealTest
Scenario Outline: All items checking under Kids Meal
Given user able to launch browser and select Place of service for "<product category>"
And I click on "Red" color vehicle model "Van" with Lane "Lane3"
When I click the product Kids Meal
And I navigate to "<product category>"
Then validate prices for products "<addons>" for "<product category>"
Examples:
|product category|addons|
|Beverages|unsweet_iced_tea_-_med,unsweet_iced_tea_-_lg,unsweet_iced_tea_-_x-lg,unsweet_iced_tea_-_gal,sweet_iced_tea_-_med,sweet_iced_tea_-_lg,sweet_iced_tea_-_x-lg,sweet_iced_tea_-_gal,coke_-_16oz,coke_-_32oz,coke_-_44oz,diet_coke_-_16oz,diet_coke_-_32oz,diet_coke_-_44oz,sprite_-_16oz,sprite_-_32oz,sprite_-_44oz,dr._pepper_-_16oz,dr._pepper_-_32oz,dr._pepper_-_44oz,diet_dr._pepper_-_16oz,diet_dr._pepper_-_32oz,diet_dr._pepper_-_44oz,lemonade_-_16oz,lemonade_-_32oz,lemonade_-_44oz,fruit_punch_-_16oz,fruit_punch_-_32oz,fruit_punch_-_44oz,bottled_water|
|Sides|french_fries_-_sm,fried_okra_-_sm,mash_pot_w/_gravy_-_sm,mash_pot_w/o_gravy_-_sm,cole_slaw_-_sm,macaroni_&_cheese_-_sm,green_beans_-_sm,mini_poppers_(3),corn_on_cob_(1),cheesesticks_(2),corn_nuggets_(8),fried_pickle_slices_(8),apple_pie_(1),cherry_pie_(1),french_fries_-_lg,fried_okra_-_lg,mash_pot_w/_gravy_-_lg,mash_pot_w/o_gravy_-_lg,cole_slaw_-lg,macaroni_&_cheese_-_lg,green_beans_-_lg,mini_poppers_(9),corn_on_cob_(4),cheesesticks_(6),corn_nuggets_(24),fried_pickle_slices_(24),apple_pie_(4),cherry_pie_(4),chocolate_chip_cookie_(1),chocolate_chip_cookies_(6),chocolate_chip_cookies_(12)|
|Side Choice|french_fries,fried_okra,mash_pot_w/_gravy,mash_pot_w/o_gravy,cole_slaw,macaroni_&_cheese,green_beans,corn_on_cob,french_fries_(fam_size),fried_okra_(fam_size),mash_pot_w/_gravy_(fam_size),mash_pot_w/o_gravy_(fam_size),cole_slaw_(fam_size),macaroni_&_cheese_(fam_size),green_beans_(fam_size),mini_poppers_(9),corn_on_cob_(4),cheesesticks_(6),corn_nuggets_(24),fried_pickle_slices_(24)|

