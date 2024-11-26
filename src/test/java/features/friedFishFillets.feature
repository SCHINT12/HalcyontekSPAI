@device_windows10 @author_Halcyon-CSN
Feature: Halcyontek Speedline.AI --FRIED FISH FILLETS

@FFF_2FC @FFF
Scenario Outline: Sub items checking under - 2 Fillets Combo in Fried Fish Fillets
Given user able to launch browser and select Place of service for "<product category>"
And I click on "Green" color vehicle model "Car" with Lane "Lane3"
When I click the product "2 Fillets Combo"
And I navigate to "<product category>"
Then validate prices for products "<addons>" for "<product category>"
Examples:
|product category|addons|
#|Beverages|unsweet_iced_tea_-_med,unsweet_iced_tea_-_lg,unsweet_iced_tea_-_x-lg,unsweet_iced_tea_-_gal,sweet_iced_tea_-_med,sweet_iced_tea_-_lg,sweet_iced_tea_-_x-lg,sweet_iced_tea_-_gal,coke_-_16oz,coke_-_32oz,coke_-_44oz,diet_coke_-_16oz,diet_coke_-_32oz,diet_coke_-_44oz,sprite_-_16oz,sprite_-_32oz,sprite_-_44oz,dr._pepper_-_16oz,dr._pepper_-_32oz,dr._pepper_-_44oz,diet_dr._pepper_-_16oz,diet_dr._pepper_-_32oz,diet_dr._pepper_-_44oz,lemonade_-_16oz,lemonade_-_32oz,lemonade_-_44oz,fruit_punch_-_16oz,fruit_punch_-_32oz,fruit_punch_-_44oz,bottled_water|
#|Sides|french_fries_-_sm,fried_okra_-_sm,mash_pot_w/_gravy_-_sm,mash_pot_w/o_gravy_-_sm,cole_slaw_-_sm,macaroni_&_cheese_-_sm,green_beans_-_sm,mini_poppers_(3),corn_on_cob_(1),cheesesticks_(2),corn_nuggets_(8),fried_pickle_slices_(8),apple_pie_(1),cherry_pie_(1),french_fries_-_lg,fried_okra_-_lg,mash_pot_w/_gravy_-_lg,mash_pot_w/o_gravy_-_lg,cole_slaw_-lg,macaroni_&_cheese_-_lg,green_beans_-_lg,mini_poppers_(9),corn_on_cob_(4),cheesesticks_(6),corn_nuggets_(24),fried_pickle_slices_(24),apple_pie_(4),cherry_pie_(4),chocolate_chip_cookie_(1),chocolate_chip_cookies_(6),chocolate_chip_cookies_(12)|
#|Drink Choice|coke_-_32oz,diet_coke_-_32oz,sprite_-_32oz,dr._pepper_-_32oz,diet_dr._pepper_-_32oz,lemonade_-_32oz,fruit_punch_-_32oz,coca-cola_-_44oz,diet_coke_-_44oz,sprite_-_44oz,dr._pepper_-_44oz,diet_dr._pepper_-_44oz,lemonade_-_44oz,fruit_punch_-_44oz|
|Side Choice|french_fries,fried_okra,mash_pot_w/_gravy,mash_pot_w/o_gravy,cole_slaw,macaroni_&_cheese,green_beans,mini_poppers_(3),corn_on_cob,cheesesticks_(2),corn_nuggets_(8),fried_pickle_slices_(8),apple_pie,cherry_pie,french_fries_(fam_size),fried_okra_(fam_size),mash_pot_w/_gravy_(fam_size),mash_pot_w/o_gravy_(fam_size),cole_slaw_(fam_size),macaroni_&_cheese_(fam_size),green_beans_(fam_size),mini_poppers_(9),corn_on_cob_(4),cheesesticks_(6),corn_nuggets_(24),fried_pickle_slices_(24)|


@FFF_3FC @FFF  
Scenario Outline: Sub items checking under 3 Fillets Combo in Fried Fish Fillets
Given user able to launch browser and select Place of service for "<product category>"
And I click on "Green" color vehicle model "Car" with Lane "Lane3"
When I click the product "3 Fillets Combo"
And I navigate to "<product category>"
Then validate prices for products "<addons>" for "<product category>"
Examples:
|product category|addons|
#|Beverages|unsweet_iced_tea_-_med,unsweet_iced_tea_-_lg,unsweet_iced_tea_-_x-lg,unsweet_iced_tea_-_gal,sweet_iced_tea_-_med,sweet_iced_tea_-_lg,sweet_iced_tea_-_x-lg,sweet_iced_tea_-_gal,coke_-_16oz,coke_-_32oz,coke_-_44oz,diet_coke_-_16oz,diet_coke_-_32oz,diet_coke_-_44oz,sprite_-_16oz,sprite_-_32oz,sprite_-_44oz,dr._pepper_-_16oz,dr._pepper_-_32oz,dr._pepper_-_44oz,diet_dr._pepper_-_16oz,diet_dr._pepper_-_32oz,diet_dr._pepper_-_44oz,lemonade_-_16oz,lemonade_-_32oz,lemonade_-_44oz,fruit_punch_-_16oz,fruit_punch_-_32oz,fruit_punch_-_44oz,bottled_water|
#|Sides|french_fries_-_sm,fried_okra_-_sm,mash_pot_w/_gravy_-_sm,mash_pot_w/o_gravy_-_sm,cole_slaw_-_sm,macaroni_&_cheese_-_sm,green_beans_-_sm,mini_poppers_(3),corn_on_cob_(1),cheesesticks_(2),corn_nuggets_(8),fried_pickle_slices_(8),apple_pie_(1),cherry_pie_(1),french_fries_-_lg,fried_okra_-_lg,mash_pot_w/_gravy_-_lg,mash_pot_w/o_gravy_-_lg,cole_slaw_-lg,macaroni_&_cheese_-_lg,green_beans_-_lg,mini_poppers_(9),corn_on_cob_(4),cheesesticks_(6),corn_nuggets_(24),fried_pickle_slices_(24),apple_pie_(4),cherry_pie_(4),chocolate_chip_cookie_(1),chocolate_chip_cookies_(6),chocolate_chip_cookies_(12)|
#|Drink Choice|coke_-_32oz,diet_coke_-_32oz,sprite_-_32oz,dr._pepper_-_32oz,diet_dr._pepper_-_32oz,lemonade_-_32oz,fruit_punch_-_32oz,coca-cola_-_44oz,diet_coke_-_44oz,sprite_-_44oz,dr._pepper_-_44oz,diet_dr._pepper_-_44oz,lemonade_-_44oz,fruit_punch_-_44oz|
|Side Choice|french_fries,fried_okra,mash_pot_w/_gravy,mash_pot_w/o_gravy,cole_slaw,macaroni_&_cheese,green_beans,mini_poppers_(3),corn_on_cob,cheesesticks_(2),corn_nuggets_(8),fried_pickle_slices_(8),apple_pie,cherry_pie,french_fries_(fam_size),fried_okra_(fam_size),mash_pot_w/_gravy_(fam_size),mash_pot_w/o_gravy_(fam_size),cole_slaw_(fam_size),macaroni_&_cheese_(fam_size),green_beans_(fam_size),mini_poppers_(9),corn_on_cob_(4),cheesesticks_(6),corn_nuggets_(24),fried_pickle_slices_(24)|




@FFF_2FD @FFF
Scenario Outline: Sub items checking under 2 Fillets Dinner in Fried Fish Fillets
Given user able to launch browser and select Place of service for "<product category>"
And I click on "Green" color vehicle model "Car" with Lane "Lane3"
When I click the product "2 Fillets Dinner"
And I navigate to "<product category>"
Then validate prices for products "<addons>" for "<product category>"
Examples:
|product category|addons|
|Beverages|unsweet_iced_tea_-_med,unsweet_iced_tea_-_lg,unsweet_iced_tea_-_x-lg,unsweet_iced_tea_-_gal,sweet_iced_tea_-_med,sweet_iced_tea_-_lg,sweet_iced_tea_-_x-lg,sweet_iced_tea_-_gal,coke_-_16oz,coke_-_32oz,coke_-_44oz,diet_coke_-_16oz,diet_coke_-_32oz,diet_coke_-_44oz,sprite_-_16oz,sprite_-_32oz,sprite_-_44oz,dr._pepper_-_16oz,dr._pepper_-_32oz,dr._pepper_-_44oz,diet_dr._pepper_-_16oz,diet_dr._pepper_-_32oz,diet_dr._pepper_-_44oz,lemonade_-_16oz,lemonade_-_32oz,lemonade_-_44oz,fruit_punch_-_16oz,fruit_punch_-_32oz,fruit_punch_-_44oz,bottled_water|
|Sides|french_fries_-_sm,fried_okra_-_sm,mash_pot_w/_gravy_-_sm,mash_pot_w/o_gravy_-_sm,cole_slaw_-_sm,macaroni_&_cheese_-_sm,green_beans_-_sm,mini_poppers_(3),corn_on_cob_(1),cheesesticks_(2),corn_nuggets_(8),fried_pickle_slices_(8),apple_pie_(1),cherry_pie_(1),french_fries_-_lg,fried_okra_-_lg,mash_pot_w/_gravy_-_lg,mash_pot_w/o_gravy_-_lg,cole_slaw_-lg,macaroni_&_cheese_-_lg,green_beans_-_lg,mini_poppers_(9),corn_on_cob_(4),cheesesticks_(6),corn_nuggets_(24),fried_pickle_slices_(24),apple_pie_(4),cherry_pie_(4),chocolate_chip_cookie_(1),chocolate_chip_cookies_(6),chocolate_chip_cookies_(12)|
#side choice different 


@FFF_3FD @FFF
Scenario Outline: Sub items checking under 3 Fillets Dinner in Fried Fish Fillets
Given user able to launch browser and select Place of service for "<product category>"
And I click on "Green" color vehicle model "Car" with Lane "Lane3"
When I click the product 3 Fillets Dinner in Fried Fish Fillets
And I navigate to "<product category>"
Then validate prices for products "<addons>" for "<product category>"
Examples:
|product category|addons|
#|Beverages|unsweet_iced_tea_-_med,unsweet_iced_tea_-_lg,unsweet_iced_tea_-_x-lg,unsweet_iced_tea_-_gal,sweet_iced_tea_-_med,sweet_iced_tea_-_lg,sweet_iced_tea_-_x-lg,sweet_iced_tea_-_gal,coke_-_16oz,coke_-_32oz,coke_-_44oz,diet_coke_-_16oz,diet_coke_-_32oz,diet_coke_-_44oz,sprite_-_16oz,sprite_-_32oz,sprite_-_44oz,dr._pepper_-_16oz,dr._pepper_-_32oz,dr._pepper_-_44oz,diet_dr._pepper_-_16oz,diet_dr._pepper_-_32oz,diet_dr._pepper_-_44oz,lemonade_-_16oz,lemonade_-_32oz,lemonade_-_44oz,fruit_punch_-_16oz,fruit_punch_-_32oz,fruit_punch_-_44oz,bottled_water|
|Sides|french_fries_-_sm,fried_okra_-_sm,mash_pot_w/_gravy_-_sm,mash_pot_w/o_gravy_-_sm,cole_slaw_-_sm,macaroni_&_cheese_-_sm,green_beans_-_sm,mini_poppers_(3),corn_on_cob_(1),cheesesticks_(2),corn_nuggets_(8),fried_pickle_slices_(8),apple_pie_(1),cherry_pie_(1),french_fries_-_lg,fried_okra_-_lg,mash_pot_w/_gravy_-_lg,mash_pot_w/o_gravy_-_lg,cole_slaw_-lg,macaroni_&_cheese_-_lg,green_beans_-_lg,mini_poppers_(9),corn_on_cob_(4),cheesesticks_(6),corn_nuggets_(24),fried_pickle_slices_(24),apple_pie_(4),cherry_pie_(4),chocolate_chip_cookie_(1),chocolate_chip_cookies_(6),chocolate_chip_cookies_(12)|
#side choice different 

@FFF_FFD @FFF
Scenario Outline: Sub items checking under Fillet Family Dinner in Fried Fish Fillets
Given user able to launch browser and select Place of service for "<product category>"
And I click on "Green" color vehicle model "Car" with Lane "Lane3"
When I click the product "Fillet Family Dinner"
And I navigate to "<product category>"
Then validate prices for products "<addons>" for "<product category>"
Examples:
|product category|addons|
|Beverages|unsweet_iced_tea_-_med,unsweet_iced_tea_-_lg,unsweet_iced_tea_-_x-lg,unsweet_iced_tea_-_gal,sweet_iced_tea_-_med,sweet_iced_tea_-_lg,sweet_iced_tea_-_x-lg,sweet_iced_tea_-_gal,coke_-_16oz,coke_-_32oz,coke_-_44oz,diet_coke_-_16oz,diet_coke_-_32oz,diet_coke_-_44oz,sprite_-_16oz,sprite_-_32oz,sprite_-_44oz,dr._pepper_-_16oz,dr._pepper_-_32oz,dr._pepper_-_44oz,diet_dr._pepper_-_16oz,diet_dr._pepper_-_32oz,diet_dr._pepper_-_44oz,lemonade_-_16oz,lemonade_-_32oz,lemonade_-_44oz,fruit_punch_-_16oz,fruit_punch_-_32oz,fruit_punch_-_44oz,bottled_water|
|Sides|french_fries_-_sm,fried_okra_-_sm,mash_pot_w/_gravy_-_sm,mash_pot_w/o_gravy_-_sm,cole_slaw_-_sm,macaroni_&_cheese_-_sm,green_beans_-_sm,mini_poppers_(3),corn_on_cob_(1),cheesesticks_(2),corn_nuggets_(8),fried_pickle_slices_(8),apple_pie_(1),cherry_pie_(1),french_fries_-_lg,fried_okra_-_lg,mash_pot_w/_gravy_-_lg,mash_pot_w/o_gravy_-_lg,cole_slaw_-lg,macaroni_&_cheese_-_lg,green_beans_-_lg,mini_poppers_(9),corn_on_cob_(4),cheesesticks_(6),corn_nuggets_(24),fried_pickle_slices_(24),apple_pie_(4),cherry_pie_(4),chocolate_chip_cookie_(1),chocolate_chip_cookies_(6),chocolate_chip_cookies_(12)|


@FFF_1FEFF @FFF
Scenario Outline: Sub items checking under 1 Fillet Express Fish Fillet in Fried Fish Fillets
Given user able to launch browser and select Place of service for "<product category>"
And I click on "Green" color vehicle model "Car" with Lane "Lane3"
When I click the product "1 Fillet Express Fish Fillet"
And I navigate to "<product category>"
Then validate prices for products "<addons>" for "<product category>"
Examples:
|product category|addons|
|Beverages|unsweet_iced_tea_-_med,unsweet_iced_tea_-_lg,unsweet_iced_tea_-_x-lg,unsweet_iced_tea_-_gal,sweet_iced_tea_-_med,sweet_iced_tea_-_lg,sweet_iced_tea_-_x-lg,sweet_iced_tea_-_gal,coke_-_16oz,coke_-_32oz,coke_-_44oz,diet_coke_-_16oz,diet_coke_-_32oz,diet_coke_-_44oz,sprite_-_16oz,sprite_-_32oz,sprite_-_44oz,dr._pepper_-_16oz,dr._pepper_-_32oz,dr._pepper_-_44oz,diet_dr._pepper_-_16oz,diet_dr._pepper_-_32oz,diet_dr._pepper_-_44oz,lemonade_-_16oz,lemonade_-_32oz,lemonade_-_44oz,fruit_punch_-_16oz,fruit_punch_-_32oz,fruit_punch_-_44oz,bottled_water|
|Sides|french_fries_-_sm,fried_okra_-_sm,mash_pot_w/_gravy_-_sm,mash_pot_w/o_gravy_-_sm,cole_slaw_-_sm,macaroni_&_cheese_-_sm,green_beans_-_sm,mini_poppers_(3),corn_on_cob_(1),cheesesticks_(2),corn_nuggets_(8),fried_pickle_slices_(8),apple_pie_(1),cherry_pie_(1),french_fries_-_lg,fried_okra_-_lg,mash_pot_w/_gravy_-_lg,mash_pot_w/o_gravy_-_lg,cole_slaw_-lg,macaroni_&_cheese_-_lg,green_beans_-_lg,mini_poppers_(9),corn_on_cob_(4),cheesesticks_(6),corn_nuggets_(24),fried_pickle_slices_(24),apple_pie_(4),cherry_pie_(4),chocolate_chip_cookie_(1),chocolate_chip_cookies_(6),chocolate_chip_cookies_(12)|


@FFF_2EFF @FFF
Scenario Outline: Sub items checking under 2 Express Fish Fillets in Fried Fish Fillets
Given user able to launch browser and select Place of service for "<product category>"
And I click on "Green" color vehicle model "Car" with Lane "Lane3"
When I click the product "2 Express Fish Fillets"
And I navigate to "<product category>"
Then validate prices for products "<addons>" for "<product category>"
Examples:
|product category|addons|
|Beverages|unsweet_iced_tea_-_med,unsweet_iced_tea_-_lg,unsweet_iced_tea_-_x-lg,unsweet_iced_tea_-_gal,sweet_iced_tea_-_med,sweet_iced_tea_-_lg,sweet_iced_tea_-_x-lg,sweet_iced_tea_-_gal,coke_-_16oz,coke_-_32oz,coke_-_44oz,diet_coke_-_16oz,diet_coke_-_32oz,diet_coke_-_44oz,sprite_-_16oz,sprite_-_32oz,sprite_-_44oz,dr._pepper_-_16oz,dr._pepper_-_32oz,dr._pepper_-_44oz,diet_dr._pepper_-_16oz,diet_dr._pepper_-_32oz,diet_dr._pepper_-_44oz,lemonade_-_16oz,lemonade_-_32oz,lemonade_-_44oz,fruit_punch_-_16oz,fruit_punch_-_32oz,fruit_punch_-_44oz,bottled_water|
|Sides|french_fries_-_sm,fried_okra_-_sm,mash_pot_w/_gravy_-_sm,mash_pot_w/o_gravy_-_sm,cole_slaw_-_sm,macaroni_&_cheese_-_sm,green_beans_-_sm,mini_poppers_(3),corn_on_cob_(1),cheesesticks_(2),corn_nuggets_(8),fried_pickle_slices_(8),apple_pie_(1),cherry_pie_(1),french_fries_-_lg,fried_okra_-_lg,mash_pot_w/_gravy_-_lg,mash_pot_w/o_gravy_-_lg,cole_slaw_-lg,macaroni_&_cheese_-_lg,green_beans_-_lg,mini_poppers_(9),corn_on_cob_(4),cheesesticks_(6),corn_nuggets_(24),fried_pickle_slices_(24),apple_pie_(4),cherry_pie_(4),chocolate_chip_cookie_(1),chocolate_chip_cookies_(6),chocolate_chip_cookies_(12)|


@FFF_3EFF @FFF
Scenario Outline: Sub items checking under 3 Express Fish Fillets in Fried Fish Fillets
Given user able to launch browser and select Place of service for "<product category>"
And I click on "Green" color vehicle model "Car" with Lane "Lane3"
When I click the product 3 Express Fish Fillets in Fried Fish Fillets
And I navigate to "<product category>"
Then validate prices for products "<addons>" for "<product category>"
Examples:
|product category|addons|
#|Beverages|unsweet_iced_tea_-_med,unsweet_iced_tea_-_lg,unsweet_iced_tea_-_x-lg,unsweet_iced_tea_-_gal,sweet_iced_tea_-_med,sweet_iced_tea_-_lg,sweet_iced_tea_-_x-lg,sweet_iced_tea_-_gal,coke_-_16oz,coke_-_32oz,coke_-_44oz,diet_coke_-_16oz,diet_coke_-_32oz,diet_coke_-_44oz,sprite_-_16oz,sprite_-_32oz,sprite_-_44oz,dr._pepper_-_16oz,dr._pepper_-_32oz,dr._pepper_-_44oz,diet_dr._pepper_-_16oz,diet_dr._pepper_-_32oz,diet_dr._pepper_-_44oz,lemonade_-_16oz,lemonade_-_32oz,lemonade_-_44oz,fruit_punch_-_16oz,fruit_punch_-_32oz,fruit_punch_-_44oz,bottled_water|
|Sides|french_fries_-_sm,fried_okra_-_sm,mash_pot_w/_gravy_-_sm,mash_pot_w/o_gravy_-_sm,cole_slaw_-_sm,macaroni_&_cheese_-_sm,green_beans_-_sm,mini_poppers_(3),corn_on_cob_(1),cheesesticks_(2),corn_nuggets_(8),fried_pickle_slices_(8),apple_pie_(1),cherry_pie_(1),french_fries_-_lg,fried_okra_-_lg,mash_pot_w/_gravy_-_lg,mash_pot_w/o_gravy_-_lg,cole_slaw_-lg,macaroni_&_cheese_-_lg,green_beans_-_lg,mini_poppers_(9),corn_on_cob_(4),cheesesticks_(6),corn_nuggets_(24),fried_pickle_slices_(24),apple_pie_(4),cherry_pie_(4),chocolate_chip_cookie_(1),chocolate_chip_cookies_(6),chocolate_chip_cookies_(12)|


@FFF_8EFF @FFF
Scenario Outline: Sub items checking under 8 Express Fish Fillets in Fried Fish Fillets
Given user able to launch browser and select Place of service for "<product category>"
And I click on "Green" color vehicle model "Car" with Lane "Lane3"
When I click the product "8 Express Fish Fillets"
And I navigate to "<product category>"
Then validate prices for products "<addons>" for "<product category>"
Examples:
|product category|addons|
|Beverages|unsweet_iced_tea_-_med,unsweet_iced_tea_-_lg,unsweet_iced_tea_-_x-lg,unsweet_iced_tea_-_gal,sweet_iced_tea_-_med,sweet_iced_tea_-_lg,sweet_iced_tea_-_x-lg,sweet_iced_tea_-_gal,coke_-_16oz,coke_-_32oz,coke_-_44oz,diet_coke_-_16oz,diet_coke_-_32oz,diet_coke_-_44oz,sprite_-_16oz,sprite_-_32oz,sprite_-_44oz,dr._pepper_-_16oz,dr._pepper_-_32oz,dr._pepper_-_44oz,diet_dr._pepper_-_16oz,diet_dr._pepper_-_32oz,diet_dr._pepper_-_44oz,lemonade_-_16oz,lemonade_-_32oz,lemonade_-_44oz,fruit_punch_-_16oz,fruit_punch_-_32oz,fruit_punch_-_44oz,bottled_water|
|Sides|french_fries_-_sm,fried_okra_-_sm,mash_pot_w/_gravy_-_sm,mash_pot_w/o_gravy_-_sm,cole_slaw_-_sm,macaroni_&_cheese_-_sm,green_beans_-_sm,mini_poppers_(3),corn_on_cob_(1),cheesesticks_(2),corn_nuggets_(8),fried_pickle_slices_(8),apple_pie_(1),cherry_pie_(1),french_fries_-_lg,fried_okra_-_lg,mash_pot_w/_gravy_-_lg,mash_pot_w/o_gravy_-_lg,cole_slaw_-lg,macaroni_&_cheese_-_lg,green_beans_-_lg,mini_poppers_(9),corn_on_cob_(4),cheesesticks_(6),corn_nuggets_(24),fried_pickle_slices_(24),apple_pie_(4),cherry_pie_(4),chocolate_chip_cookie_(1),chocolate_chip_cookies_(6),chocolate_chip_cookies_(12)|

