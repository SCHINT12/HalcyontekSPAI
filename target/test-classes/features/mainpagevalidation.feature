@device_windows10 @author_Halcyon-CSN
Feature: Main page products validate

@mainPageValidation 
Scenario Outline: Validate All Items present in Main Page
Given I able to launch browser and select Place of service
And I click on "Green" color vehicle model "Car" with Lane "Lane3"
When after launch browser
Then validate prices for products Main Page Products "<addons>" for "<product category>"
Examples:
|product category|addons|
|MainpageProducts|4_Express_Tenders_Combo,7_Express_Tenders_Combo,3_Piece_Chicken_Combo,2_Piece_Chicken_Combo,6_Livers_Combo,8_Boneless_Hot_Wings_Combo,9_Gizzards_Combo,Mixed_Livers_&_Gizzards_Combo,4_Express_Tenders_Dinner,7_Express_Tenders_Dinner,3_Piece_Chicken_Dinner,2_Piece_Chicken_Dinner,6_Livers_Dinner,8_Boneless_Hot_Wings_Dinner,9_Gizzards_Dinner,Mixed_Livers_&_Gizzards_Dinner,8_Piece_Mixed_Chicken_Family_Meal,12_Piece_Mixed_Chicken_Family_Meal,16_Piece_Mixed_Chicken_Family_Meal,20_Express_Tenders_Family_Meal,25_Express_Tenders_Family_Meal,30_Express_Tenders_Family_Meal,2_Pieces_Chicken,3_Pieces_Chicken,2_Tenders_Snack_Pack,1_Piece_Chicken_Snack_Pack,4_Piece_Express_Tenders,7_Piece_Express_Tenders,15_Piece_Express_Tenders,8_Piece_Boneless_Hot_Wings,24_Piece_Boneless_Hot_Wings,6_Livers,12_Livers,9_Gizzards,18_Gizzards,2_Fillets_Combo,3_Fillets_Combo,2_Fillets_Dinner,3_Fillets_Dinner,Fillet_Family_Dinner,1_Fillet_Express_Fish_Fillet,2_Express_Fish_Fillets,3_Express_Fish_Fillets,8_Express_Fish_Fillets,French_Fries,Fried_Okra,Mashed_Potatoes,Cole_Slaw,Macaroni_&_Cheese,Green_Beans,Mini_Poppers,Corn_on_Cob,Cheesesticks,Corn_Nuggets,Fried_Pickle_Slices,Apple_Pie,Cherry_Pie,Mashed_Potatoes_/_No_Gravy,Chocolate_Chip_Cookies,Kids_Meal,Bottled_Water,Unsweet_Fresh_Brewed_Iced_Tea,Coca-Cola,Diet_Coke,Sprite,Dr._Pepper,Diet_Dr._Pepper,Lemonade,Fruit_Punch,Sweet_Fresh_Brewed_Iced_Tea,5_Pieces_Chicken_/_7_Tenders_/_2_Sides,Mega_Meal,12_Pieces_Chicken_/_2_Family_Sides,15_Tender_Special,Special_2_Pieces,Drink_Upcharge,Breast_Upcharge,Employee_Shirt,Plates|
