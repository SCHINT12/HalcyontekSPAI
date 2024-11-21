@device_windows10 @author_Halcyon-CSN
Feature: Halcyontek Speedline.AI --Combo Meals
@CMTest
Scenario: Creating basic order
Given user able to launch browser and select Place of service for "Beverages"
And I click on "Pink" color vehicle model "Car" with Lane "Lane1"
#When user able add to card food items
#Then user able to see total bill amount
When I click the product "4 Express Tenders Combo"
#And I navigate to "Side Choice"
#Then validate prices for products "french_fries-lg,french_fries-sm,cole_slaw-lg,mash_pot_w/_gravy-sm" for "Sides"
#Then validate prices for products "french_fries_-_sm,fried_okra_-_sm,mash_pot_w/_gravy_-_sm,mash_pot_w/o_gravy_-_sm,cole_slaw_-_sm,macaroni_&_cheese_-_sm,green_beans_-_sm,mini_poppers_(3),corn_on_cob_(1),cheesesticks_(2),corn_nuggets_(8),fried_pickle_slices_(8),apple_pie_(1),cherry_pie_(1),french_fries_-_lg,fried_okra_-_lg,mash_pot_w/_gravy_-_lg,mash_pot_w/o_gravy_-_lg,cole_slaw_-lg,macaroni_&_cheese_-_lg,green_beans_-_lg,mini_poppers_(9),corn_on_cob_(4),cheesesticks_(6),corn_nuggets_(24),fried_pickle_slices_(24),apple_pie_(4),cherry_pie_(4),chocolate_chip_cookie_(1),chocolate_chip_cookies_(6),chocolate_chip_cookies_(12)" for "Sides"
#And I navigate to "Side Choice"
#Then validate prices for products "mini_poppers_(9)" for "Side Choice"
#Then validate prices for products "french_fries,fried_okra,mash_pot_w/_gravy,mash_pot_w/o_gravy,cole_slaw,macaroni_&_cheese,green_beans,mini_poppers_(3),corn_on_cob,cheesesticks_(2),corn_nuggets_(8),fried_pickle_slices_(8),apple_pie,cherry_pie,french_fries_(fam_size),fried_okra_(fam_size),mash_pot_w/_gravy_(fam_size),mash_pot_w/o_gravy_(fam_size),cole_slaw_(fam_size),macaroni_&_cheese_(fam_size),green_beans_(fam_size),mini_poppers_(9),corn_on_cob_(4),cheesesticks_(6),corn_nuggets_(24),fried_pickle_slices_(24)" for "Side Choice"
#And I navigate to "Sauce Extras"
#Then validate prices for products "extra_bbq,extra_ranch" for "Sauce Extras"
#Then validate prices for products "extra_bbq,extra_ranch,extra_jalapeno_ranch,extra_honey_mustard,extra_buffalo_sauce,extra_chipotle_ranch,extra_marinara,extra_cocktail_sauce,extra_tartar_sauce,extra_gravy,extra_ketchup" for "Sauce Extras"
#And I navigate to "Drink Choice"
#Then validate prices for products "fruit_punch-44oz,lemonade-44oz,diet_coke-44oz" for "Drink Choice"
#Then validate prices for products "coke_-_32oz,diet_coke_-_32oz,sprite_-_32oz,dr._pepper_-_32oz,diet_dr._pepper_-_32oz,lemonade_-_32oz,fruit_punch_-_32oz,coca-cola_-_44oz,diet_coke_-_44oz,sprite_-_44oz,dr._pepper_-_44oz,diet_dr._pepper_-_44oz,lemonade_-_44oz,fruit_punch_-_44oz" for "Drink Choice"
And I navigate to "Beverages"
#Then validate prices for products "unsweet_iced_tea-med,unsweet_iced_tea-lg" for "Beverages"
Then validate prices for products "unsweet_iced_tea_-_med,unsweet_iced_tea_-_lg,unsweet_iced_tea_-_x-lg,unsweet_iced_tea_-_gal,sweet_iced_tea_-_med,sweet_iced_tea_-_lg,sweet_iced_tea_-_x-lg,sweet_iced_tea_-_gal,coke_-_16oz,coke_-_32oz,coke_-_44oz,diet_coke_-_16oz,diet_coke_-_32oz,diet_coke_-_44oz,sprite_-_16oz,sprite_-_32oz,sprite_-_44oz,dr._pepper_-_16oz,dr._pepper_-_32oz,dr._pepper_-_44oz,diet_dr._pepper_-_16oz,diet_dr._pepper_-_32oz,diet_dr._pepper_-_44oz,lemonade_-_16oz,lemonade_-_32oz,lemonade_-_44oz,fruit_punch_-_16oz,fruit_punch_-_32oz,fruit_punch_-_44oz,bottled_water" for "Beverages"

@CMTest 
Scenario Outline: All items checking 
Given user able to launch browser and select Place of service for "<product category>"
And I click on "Green" color vehicle model "Truck" with Lane "Lane1"
When I click Mixed Livers protuct
And I navigate to "<product category>"
Then validate prices for products "<addons>" for "<product category>"
Examples:
|product category|addons|
|Side Choice|french_fries,fried_okra,mash_pot_w/_gravy,mash_pot_w/o_gravy,cole_slaw,macaroni_&_cheese,green_beans,mini_poppers_(3),corn_on_cob,cheesesticks_(2),corn_nuggets_(8),fried_pickle_slices_(8),apple_pie,cherry_pie,french_fries_(fam_size),fried_okra_(fam_size),mash_pot_w/_gravy_(fam_size),mash_pot_w/o_gravy_(fam_size),cole_slaw_(fam_size),macaroni_&_cheese_(fam_size),green_beans_(fam_size),mini_poppers_(9),corn_on_cob_(4),cheesesticks_(6),corn_nuggets_(24),fried_pickle_slices_(24)|
|Beverages|unsweet_iced_tea_-_med,unsweet_iced_tea_-_lg,unsweet_iced_tea_-_x-lg,unsweet_iced_tea_-_gal,sweet_iced_tea_-_med,sweet_iced_tea_-_lg,sweet_iced_tea_-_x-lg,sweet_iced_tea_-_gal,coke_-_16oz,coke_-_32oz,coke_-_44oz,diet_coke_-_16oz,diet_coke_-_32oz,diet_coke_-_44oz,sprite_-_16oz,sprite_-_32oz,sprite_-_44oz,dr._pepper_-_16oz,dr._pepper_-_32oz,dr._pepper_-_44oz,diet_dr._pepper_-_16oz,diet_dr._pepper_-_32oz,diet_dr._pepper_-_44oz,lemonade_-_16oz,lemonade_-_32oz,lemonade_-_44oz,fruit_punch_-_16oz,fruit_punch_-_32oz,fruit_punch_-_44oz,bottled_water|
|Sides|french_fries_-_sm,fried_okra_-_sm,mash_pot_w/_gravy_-_sm,mash_pot_w/o_gravy_-_sm,cole_slaw_-_sm,macaroni_&_cheese_-_sm,green_beans_-_sm,mini_poppers_(3),corn_on_cob_(1),cheesesticks_(2),corn_nuggets_(8),fried_pickle_slices_(8),apple_pie_(1),cherry_pie_(1),french_fries_-_lg,fried_okra_-_lg,mash_pot_w/_gravy_-_lg,mash_pot_w/o_gravy_-_lg,cole_slaw_-lg,macaroni_&_cheese_-_lg,green_beans_-_lg,mini_poppers_(9),corn_on_cob_(4),cheesesticks_(6),corn_nuggets_(24),fried_pickle_slices_(24),apple_pie_(4),cherry_pie_(4),chocolate_chip_cookie_(1),chocolate_chip_cookies_(6),chocolate_chip_cookies_(12)|
|Sauce Extras|extra_bbq,extra_ranch,extra_jalapeno_ranch,extra_honey_mustard,extra_buffalo_sauce,extra_chipotle_ranch,extra_marinara,extra_cocktail_sauce,extra_tartar_sauce,extra_gravy,extra_ketchup|
|Drink Choice|coke_-_32oz,diet_coke_-_32oz,sprite_-_32oz,dr._pepper_-_32oz,diet_dr._pepper_-_32oz,lemonade_-_32oz,fruit_punch_-_32oz,coca-cola_-_44oz,diet_coke_-_44oz,sprite_-_44oz,dr._pepper_-_44oz,diet_dr._pepper_-_44oz,lemonade_-_44oz,fruit_punch_-_44oz|

@CMTest 
Scenario Outline: All items checking
Given user able to launch browser and select Place of service for "<product category>"
And I click on "Pink" color vehicle model "Car" with Lane "Lane1"
When I click the product "4 Express Tenders Combo"
And I navigate to "<product category>"
Then validate prices for products "<addons>" for "<product category>"
Examples:
|product category|addons|
|Side Choice|french_fries,fried_okra,mash_pot_w/_gravy,mash_pot_w/o_gravy,cole_slaw,macaroni_&_cheese,green_beans,mini_poppers_(3),corn_on_cob,cheesesticks_(2),corn_nuggets_(8),fried_pickle_slices_(8),apple_pie,cherry_pie,french_fries_(fam_size),fried_okra_(fam_size),mash_pot_w/_gravy_(fam_size),mash_pot_w/o_gravy_(fam_size),cole_slaw_(fam_size),macaroni_&_cheese_(fam_size),green_beans_(fam_size),mini_poppers_(9),corn_on_cob_(4),cheesesticks_(6),corn_nuggets_(24),fried_pickle_slices_(24)|
|Beverages|unsweet_iced_tea_-_med,unsweet_iced_tea_-_lg,unsweet_iced_tea_-_x-lg,unsweet_iced_tea_-_gal,sweet_iced_tea_-_med,sweet_iced_tea_-_lg,sweet_iced_tea_-_x-lg,sweet_iced_tea_-_gal,coke_-_16oz,coke_-_32oz,coke_-_44oz,diet_coke_-_16oz,diet_coke_-_32oz,diet_coke_-_44oz,sprite_-_16oz,sprite_-_32oz,sprite_-_44oz,dr._pepper_-_16oz,dr._pepper_-_32oz,dr._pepper_-_44oz,diet_dr._pepper_-_16oz,diet_dr._pepper_-_32oz,diet_dr._pepper_-_44oz,lemonade_-_16oz,lemonade_-_32oz,lemonade_-_44oz,fruit_punch_-_16oz,fruit_punch_-_32oz,fruit_punch_-_44oz,bottled_water|
|Sides|french_fries_-_sm,fried_okra_-_sm,mash_pot_w/_gravy_-_sm,mash_pot_w/o_gravy_-_sm,cole_slaw_-_sm,macaroni_&_cheese_-_sm,green_beans_-_sm,mini_poppers_(3),corn_on_cob_(1),cheesesticks_(2),corn_nuggets_(8),fried_pickle_slices_(8),apple_pie_(1),cherry_pie_(1),french_fries_-_lg,fried_okra_-_lg,mash_pot_w/_gravy_-_lg,mash_pot_w/o_gravy_-_lg,cole_slaw_-lg,macaroni_&_cheese_-_lg,green_beans_-_lg,mini_poppers_(9),corn_on_cob_(4),cheesesticks_(6),corn_nuggets_(24),fried_pickle_slices_(24),apple_pie_(4),cherry_pie_(4),chocolate_chip_cookie_(1),chocolate_chip_cookies_(6),chocolate_chip_cookies_(12)|
|Sauce Extras|extra_bbq,extra_ranch,extra_jalapeno_ranch,extra_honey_mustard,extra_buffalo_sauce,extra_chipotle_ranch,extra_marinara,extra_cocktail_sauce,extra_tartar_sauce,extra_gravy,extra_ketchup|
|Drink Choice|coke_-_32oz,diet_coke_-_32oz,sprite_-_32oz,dr._pepper_-_32oz,diet_dr._pepper_-_32oz,lemonade_-_32oz,fruit_punch_-_32oz,coca-cola_-_44oz,diet_coke_-_44oz,sprite_-_44oz,dr._pepper_-_44oz,diet_dr._pepper_-_44oz,lemonade_-_44oz,fruit_punch_-_44oz|



@CMTest
Scenario Outline: All items checking
Given user able to launch browser and select Place of service for "<product category>"
And I click on "Pink" color vehicle model "Car" with Lane "Lane1"
When I click the product "7 Express Tenders Combo"
And I navigate to "<product category>"
Then validate prices for products "<addons>" for "<product category>"
Examples:
|product category|addons|
|Side Choice|french_fries,fried_okra,mash_pot_w/_gravy,mash_pot_w/o_gravy,cole_slaw,macaroni_&_cheese,green_beans,mini_poppers_(3),corn_on_cob,cheesesticks_(2),corn_nuggets_(8),fried_pickle_slices_(8),apple_pie,cherry_pie,french_fries_(fam_size),fried_okra_(fam_size),mash_pot_w/_gravy_(fam_size),mash_pot_w/o_gravy_(fam_size),cole_slaw_(fam_size),macaroni_&_cheese_(fam_size),green_beans_(fam_size),mini_poppers_(9),corn_on_cob_(4),cheesesticks_(6),corn_nuggets_(24),fried_pickle_slices_(24)|
|Beverages|unsweet_iced_tea_-_med,unsweet_iced_tea_-_lg,unsweet_iced_tea_-_x-lg,unsweet_iced_tea_-_gal,sweet_iced_tea_-_med,sweet_iced_tea_-_lg,sweet_iced_tea_-_x-lg,sweet_iced_tea_-_gal,coke_-_16oz,coke_-_32oz,coke_-_44oz,diet_coke_-_16oz,diet_coke_-_32oz,diet_coke_-_44oz,sprite_-_16oz,sprite_-_32oz,sprite_-_44oz,dr._pepper_-_16oz,dr._pepper_-_32oz,dr._pepper_-_44oz,diet_dr._pepper_-_16oz,diet_dr._pepper_-_32oz,diet_dr._pepper_-_44oz,lemonade_-_16oz,lemonade_-_32oz,lemonade_-_44oz,fruit_punch_-_16oz,fruit_punch_-_32oz,fruit_punch_-_44oz,bottled_water|
|Sides|french_fries_-_sm,fried_okra_-_sm,mash_pot_w/_gravy_-_sm,mash_pot_w/o_gravy_-_sm,cole_slaw_-_sm,macaroni_&_cheese_-_sm,green_beans_-_sm,mini_poppers_(3),corn_on_cob_(1),cheesesticks_(2),corn_nuggets_(8),fried_pickle_slices_(8),apple_pie_(1),cherry_pie_(1),french_fries_-_lg,fried_okra_-_lg,mash_pot_w/_gravy_-_lg,mash_pot_w/o_gravy_-_lg,cole_slaw_-lg,macaroni_&_cheese_-_lg,green_beans_-_lg,mini_poppers_(9),corn_on_cob_(4),cheesesticks_(6),corn_nuggets_(24),fried_pickle_slices_(24),apple_pie_(4),cherry_pie_(4),chocolate_chip_cookie_(1),chocolate_chip_cookies_(6),chocolate_chip_cookies_(12)|
|Sauce Extras|extra_bbq,extra_ranch,extra_jalapeno_ranch,extra_honey_mustard,extra_buffalo_sauce,extra_chipotle_ranch,extra_marinara,extra_cocktail_sauce,extra_tartar_sauce,extra_gravy,extra_ketchup|
|Drink Choice|coke_-_32oz,diet_coke_-_32oz,sprite_-_32oz,dr._pepper_-_32oz,diet_dr._pepper_-_32oz,lemonade_-_32oz,fruit_punch_-_32oz,coca-cola_-_44oz,diet_coke_-_44oz,sprite_-_44oz,dr._pepper_-_44oz,diet_dr._pepper_-_44oz,lemonade_-_44oz,fruit_punch_-_44oz|

@CMTest
Scenario Outline: All items checking
Given user able to launch browser and select Place of service for "<product category>"
And I click on "Pink" color vehicle model "Car" with Lane "Lane1"
When I click the product "9 Gizzards Combo"
And I navigate to "<product category>"
Then validate prices for products "<addons>" for "<product category>"
Examples:
|product category|addons|
|Side Choice|french_fries,fried_okra,mash_pot_w/_gravy,mash_pot_w/o_gravy,cole_slaw,macaroni_&_cheese,green_beans,mini_poppers_(3),corn_on_cob,cheesesticks_(2),corn_nuggets_(8),fried_pickle_slices_(8),apple_pie,cherry_pie,french_fries_(fam_size),fried_okra_(fam_size),mash_pot_w/_gravy_(fam_size),mash_pot_w/o_gravy_(fam_size),cole_slaw_(fam_size),macaroni_&_cheese_(fam_size),green_beans_(fam_size),mini_poppers_(9),corn_on_cob_(4),cheesesticks_(6),corn_nuggets_(24),fried_pickle_slices_(24)|
|Beverages|unsweet_iced_tea_-_med,unsweet_iced_tea_-_lg,unsweet_iced_tea_-_x-lg,unsweet_iced_tea_-_gal,sweet_iced_tea_-_med,sweet_iced_tea_-_lg,sweet_iced_tea_-_x-lg,sweet_iced_tea_-_gal,coke_-_16oz,coke_-_32oz,coke_-_44oz,diet_coke_-_16oz,diet_coke_-_32oz,diet_coke_-_44oz,sprite_-_16oz,sprite_-_32oz,sprite_-_44oz,dr._pepper_-_16oz,dr._pepper_-_32oz,dr._pepper_-_44oz,diet_dr._pepper_-_16oz,diet_dr._pepper_-_32oz,diet_dr._pepper_-_44oz,lemonade_-_16oz,lemonade_-_32oz,lemonade_-_44oz,fruit_punch_-_16oz,fruit_punch_-_32oz,fruit_punch_-_44oz,bottled_water|
|Sides|french_fries_-_sm,fried_okra_-_sm,mash_pot_w/_gravy_-_sm,mash_pot_w/o_gravy_-_sm,cole_slaw_-_sm,macaroni_&_cheese_-_sm,green_beans_-_sm,mini_poppers_(3),corn_on_cob_(1),cheesesticks_(2),corn_nuggets_(8),fried_pickle_slices_(8),apple_pie_(1),cherry_pie_(1),french_fries_-_lg,fried_okra_-_lg,mash_pot_w/_gravy_-_lg,mash_pot_w/o_gravy_-_lg,cole_slaw_-lg,macaroni_&_cheese_-_lg,green_beans_-_lg,mini_poppers_(9),corn_on_cob_(4),cheesesticks_(6),corn_nuggets_(24),fried_pickle_slices_(24),apple_pie_(4),cherry_pie_(4),chocolate_chip_cookie_(1),chocolate_chip_cookies_(6),chocolate_chip_cookies_(12)|
|Sauce Extras|extra_bbq,extra_ranch,extra_jalapeno_ranch,extra_honey_mustard,extra_buffalo_sauce,extra_chipotle_ranch,extra_marinara,extra_cocktail_sauce,extra_tartar_sauce,extra_gravy,extra_ketchup|
|Drink Choice|coke_-_32oz,diet_coke_-_32oz,sprite_-_32oz,dr._pepper_-_32oz,diet_dr._pepper_-_32oz,lemonade_-_32oz,fruit_punch_-_32oz,coca-cola_-_44oz,diet_coke_-_44oz,sprite_-_44oz,dr._pepper_-_44oz,diet_dr._pepper_-_44oz,lemonade_-_44oz,fruit_punch_-_44oz|

@CMTest
Scenario Outline: All items checking
Given user able to launch browser and select Place of service for "<product category>"
And I click on "Pink" color vehicle model "Car" with Lane "Lane1"
When I click the product "8 Boneless Hot Wings Combo"
And I navigate to "<product category>"
Then validate prices for products "<addons>" for "<product category>"
Examples:
|product category|addons|
|Side Choice|french_fries,fried_okra,mash_pot_w/_gravy,mash_pot_w/o_gravy,cole_slaw,macaroni_&_cheese,green_beans,mini_poppers_(3),corn_on_cob,cheesesticks_(2),corn_nuggets_(8),fried_pickle_slices_(8),apple_pie,cherry_pie,french_fries_(fam_size),fried_okra_(fam_size),mash_pot_w/_gravy_(fam_size),mash_pot_w/o_gravy_(fam_size),cole_slaw_(fam_size),macaroni_&_cheese_(fam_size),green_beans_(fam_size),mini_poppers_(9),corn_on_cob_(4),cheesesticks_(6),corn_nuggets_(24),fried_pickle_slices_(24)|
|Beverages|unsweet_iced_tea_-_med,unsweet_iced_tea_-_lg,unsweet_iced_tea_-_x-lg,unsweet_iced_tea_-_gal,sweet_iced_tea_-_med,sweet_iced_tea_-_lg,sweet_iced_tea_-_x-lg,sweet_iced_tea_-_gal,coke_-_16oz,coke_-_32oz,coke_-_44oz,diet_coke_-_16oz,diet_coke_-_32oz,diet_coke_-_44oz,sprite_-_16oz,sprite_-_32oz,sprite_-_44oz,dr._pepper_-_16oz,dr._pepper_-_32oz,dr._pepper_-_44oz,diet_dr._pepper_-_16oz,diet_dr._pepper_-_32oz,diet_dr._pepper_-_44oz,lemonade_-_16oz,lemonade_-_32oz,lemonade_-_44oz,fruit_punch_-_16oz,fruit_punch_-_32oz,fruit_punch_-_44oz,bottled_water|
|Sides|french_fries_-_sm,fried_okra_-_sm,mash_pot_w/_gravy_-_sm,mash_pot_w/o_gravy_-_sm,cole_slaw_-_sm,macaroni_&_cheese_-_sm,green_beans_-_sm,mini_poppers_(3),corn_on_cob_(1),cheesesticks_(2),corn_nuggets_(8),fried_pickle_slices_(8),apple_pie_(1),cherry_pie_(1),french_fries_-_lg,fried_okra_-_lg,mash_pot_w/_gravy_-_lg,mash_pot_w/o_gravy_-_lg,cole_slaw_-lg,macaroni_&_cheese_-_lg,green_beans_-_lg,mini_poppers_(9),corn_on_cob_(4),cheesesticks_(6),corn_nuggets_(24),fried_pickle_slices_(24),apple_pie_(4),cherry_pie_(4),chocolate_chip_cookie_(1),chocolate_chip_cookies_(6),chocolate_chip_cookies_(12)|
|Sauce Extras|extra_bbq,extra_ranch,extra_jalapeno_ranch,extra_honey_mustard,extra_buffalo_sauce,extra_chipotle_ranch,extra_marinara,extra_cocktail_sauce,extra_tartar_sauce,extra_gravy,extra_ketchup|
|Drink Choice|coke_-_32oz,diet_coke_-_32oz,sprite_-_32oz,dr._pepper_-_32oz,diet_dr._pepper_-_32oz,lemonade_-_32oz,fruit_punch_-_32oz,coca-cola_-_44oz,diet_coke_-_44oz,sprite_-_44oz,dr._pepper_-_44oz,diet_dr._pepper_-_44oz,lemonade_-_44oz,fruit_punch_-_44oz|


@CMTest
Scenario Outline: All items checking
Given user able to launch browser and select Place of service for "<product category>"
And I click on "Pink" color vehicle model "Car" with Lane "Lane1"
When I click the product "4 Express Tenders Dinner"
And I navigate to "<product category>"
Then validate prices for products "<addons>" for "<product category>"
Examples:
|product category|addons|
|Side Choice|french_fries,fried_okra,mash_pot_w/_gravy,mash_pot_w/o_gravy,cole_slaw,macaroni_&_cheese,green_beans,mini_poppers_(3),corn_on_cob,cheesesticks_(2),corn_nuggets_(8),fried_pickle_slices_(8),apple_pie,cherry_pie,french_fries_(fam_size),fried_okra_(fam_size),mash_pot_w/_gravy_(fam_size),mash_pot_w/o_gravy_(fam_size),cole_slaw_(fam_size),macaroni_&_cheese_(fam_size),green_beans_(fam_size),mini_poppers_(9),corn_on_cob_(4),cheesesticks_(6),corn_nuggets_(24),fried_pickle_slices_(24)|
|Beverages|unsweet_iced_tea_-_med,unsweet_iced_tea_-_lg,unsweet_iced_tea_-_x-lg,unsweet_iced_tea_-_gal,sweet_iced_tea_-_med,sweet_iced_tea_-_lg,sweet_iced_tea_-_x-lg,sweet_iced_tea_-_gal,coke_-_16oz,coke_-_32oz,coke_-_44oz,diet_coke_-_16oz,diet_coke_-_32oz,diet_coke_-_44oz,sprite_-_16oz,sprite_-_32oz,sprite_-_44oz,dr._pepper_-_16oz,dr._pepper_-_32oz,dr._pepper_-_44oz,diet_dr._pepper_-_16oz,diet_dr._pepper_-_32oz,diet_dr._pepper_-_44oz,lemonade_-_16oz,lemonade_-_32oz,lemonade_-_44oz,fruit_punch_-_16oz,fruit_punch_-_32oz,fruit_punch_-_44oz,bottled_water|
|Sides|french_fries_-_sm,fried_okra_-_sm,mash_pot_w/_gravy_-_sm,mash_pot_w/o_gravy_-_sm,cole_slaw_-_sm,macaroni_&_cheese_-_sm,green_beans_-_sm,mini_poppers_(3),corn_on_cob_(1),cheesesticks_(2),corn_nuggets_(8),fried_pickle_slices_(8),apple_pie_(1),cherry_pie_(1),french_fries_-_lg,fried_okra_-_lg,mash_pot_w/_gravy_-_lg,mash_pot_w/o_gravy_-_lg,cole_slaw_-lg,macaroni_&_cheese_-_lg,green_beans_-_lg,mini_poppers_(9),corn_on_cob_(4),cheesesticks_(6),corn_nuggets_(24),fried_pickle_slices_(24),apple_pie_(4),cherry_pie_(4),chocolate_chip_cookie_(1),chocolate_chip_cookies_(6),chocolate_chip_cookies_(12)|
|Sauce Extras|extra_bbq,extra_ranch,extra_jalapeno_ranch,extra_honey_mustard,extra_buffalo_sauce,extra_chipotle_ranch,extra_marinara,extra_cocktail_sauce,extra_tartar_sauce,extra_gravy,extra_ketchup|



















#Scenario: Creating order of Four Express Tenders Combo
#Given user able to launch browser and select Place of service
#When user ordering Four Express Tenders Combo with add ons
#Then bill payment
#
#Scenario: Price Comparison under Four Express Tenders Combo add ons 
#Given user able to launch browser and select Place of service
#When user able add to card food items
#Then user able to see total bill amount




