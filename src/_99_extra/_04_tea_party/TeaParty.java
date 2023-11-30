package _99_extra._04_tea_party;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TeaParty {

public String welcome(String name, boolean isWoman, boolean isKnighted) {
     
	String returnVal = "Hello ";
	
	if (isWoman && isKnighted) {
		returnVal += "Lady ";
	}else if (isWoman) {
		returnVal += "Ms. ";
	}
	
	if (isKnighted && !isWoman) {
		returnVal += "Sir ";
	} else if (!isWoman) {
		returnVal += "Mr. ";
	}
	
	return returnVal + name;    
    }
}	
		
	

