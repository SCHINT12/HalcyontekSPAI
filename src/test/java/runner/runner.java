package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features",glue ={"stepdefinitions"},monochrome = true,tags = "@mainPageValidationCE",
				plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		)	

public class runner {

	// @KidsMealTest :- kids meal ( Beverages , Sides , Side choice )  "working fine" 
	
	
	// @mainPageValidationCE:- Main page all products validate    "working fine"
	
	
	//  @CM "---------" below all Combo meals ( Side choice , Beverages , Sides , Sauce Extra , Drink Choice)
	//  @CM_4ETC   :- 4 Express Tenders Combo ( Side choice , Beverages , Sides , Sauce Extra , Drink Choice) 
	//	@CM_7ETC   :-  7 Express Tenders Combo ( Side choice , Beverages , Sides , Sauce Extra , Drink Choice) 
	//	@CM_3PCM   :-  3 Piece Chicken Combo ( Side choice , Beverages , Sides , Sauce Extra , Drink Choice) 
	//	@CM_2PCC   :-  2 Piece Chicken Combo ( Side choice , Beverages , Sides , Sauce Extra , Drink Choice) 
	//	@CM_6LC    :- 6 Livers Combo ( Side choice , Beverages , Sides , Sauce Extra , Drink Choice)
	//	@CM_8BHWC  :- 8 Boneless Hot Wings Combo ( Side choice , Beverages , Sides , Sauce Extra , Drink Choice)
	//	@CM_9GC    :- 9 Gizzards Combo ( Side choice , Beverages , Sides , Sauce Extra , Drink Choice)
	//	@CM_MLGC   :- Mixed Livers & Gizzards Combo ( Side choice , Beverages , Sides , Sauce Extra , Drink Choice)
	
	
	//  @DCM "---------" below all Dinner Combo Meals (Side choice , Beverages , Sides , Sauce Extra)
	//  @DCM_4ETD  :- 4 Express Tenders Dinner (Side choice , Beverages , Sides , Sauce Extra)
	//  @DCM_7ETD  :- 7 Express Tenders Dinner (Side choice , Beverages , Sides , Sauce Extra)
	//  @DCM_3PCH  :- 3 Piece Chicken Dinner (Side choice , Beverages , Sides , Sauce Extra)
	//  @DCM_2PCD  :- 2 Piece Chicken Dinner (Side choice , Beverages , Sides , Sauce Extra)
	//  @DCM_6LD   :- 6 Livers Dinner (Side choice , Beverages , Sides , Sauce Extra)
	//  @DCM_8BHWD :- 8 Boneless Hot Wings Dinner (Side choice , Beverages , Sides , Sauce Extra)
	//  @DCM_9GD   :- 9 Gizzards Dinner (Side choice , Beverages , Sides , Sauce Extra)
	//  @DCM_MLGD  :- Mixed Livers & Gizzards Dinner (Side choice , Beverages , Sides , Sauce Extra)
	
	
	//  @FM  "---------" below all Family Meals (Beverages , Sides , Sauce Extra)
	//  @FM_8PMCFM  :- 8 Piece Mixed Chicken Family Meal (Beverages , Sides , Sauce Extra)
	//  @FM_12PMCFM :- 12 Piece Mixed Chicken Family Meal (Beverages , Sides , Sauce Extra)
	//  @FM_16PMCFM :- 16 Piece Mixed Chicken Family Meal (Beverages , Sides , Sauce Extra)
	//  @FM_20PMCFM :- 20 Express Tenders Family Meal (Beverages , Sides , Sauce Extra)
	//  @FM_25PMCFM :- 25 Express Tenders Family Meal (Beverages , Sides , Sauce Extra)
	//  @FM_30PMCFM :- 30 Express Tenders Family Meal (Beverages , Sides , Sauce Extra)
	
	
	//  @EE  "---------" below all EXPRESS EXTRAS (Beverages , Sides , Sauce Extra)
	//  @EE_2PC    :- 2 Pieces Chicken (Beverages , Sides , Sauce Extra)
	//  @EE_3PC    :- 3 Pieces Chicken (Beverages , Sides , Sauce Extra)
	//  @EE_2TSP   :- 2 Tenders Snack (Beverages , Sides , Sauce Extra)
	//  @EE_1PCSP  :- 1 Piece Chicken Snack Pack(Beverages , Sides , Sauce Extra)
	//  @EE_4PET   :- 4 Piece Express Tenders (Beverages , Sides , Sauce Extra)
	//  @EE_7PET   :- 7 Piece Express Tenders (Beverages , Sides , Sauce Extra)
	//  @EE_15PET  :- 15 Piece Express Tenders (Beverages , Sides , Sauce Extra)
	//  @EE_8PBHW  :- 8 Piece Boneless Hot Wings (Beverages , Sides , Sauce Extra)
	//  @EE_24PHW  :- 24 Piece Boneless Hot Wings (Beverages , Sides , Sauce Extra)
	//  @EE_6L     :- 6 Livers (Beverages , Sides , Sauce Extra)
	//  @EE_12L    :- 12 Livers (Beverages , Sides , Sauce Extra)
	//  @EE_9G     :- 9 Gizzards (Beverages , Sides , Sauce Extra)
	//  @EE_18G    :- 18 Gizzards (Beverages , Sides , Sauce Extra)
	
	
	//  @FFF "---------" below all FRIED FISH FILLETS 
	//  @FFF_2FC    :- 2 Fillets Combo (Beverages , Sides , Drink Choice, Side Choice)
	//  @FFF_3FC    :- 3 Fillets Combo (Beverages , Sides , Drink Choice, Side Choice)
	//  @FFF_2FD    :- 2 Fillets Dinner (Beverages , Sides)
	//  @FFF_3FC    :- 3 Fillets Dinner (Beverages , Sides)
	//  @FFF_FFD    :- Fillet Family Dinner (Beverages , Sides)
	//  @FFF_1FEFF  :- 1 Fillet Express Fish Fillet (Beverages , Sides)
	//  @FFF_2EFF   :- 2 Express Fish Fillets (Beverages , Sides)
	//  @FFF_3EFF   :- 3 Express Fish Fillets (Beverages , Sides)
	//  @FFF_8EFF   :- 8 Express Fish Fillets (Beverages , Sides)
	
}
