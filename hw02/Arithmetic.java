// Noah Tucker
// CSE2 HW02
// 10/9/14

// The program is called Arithmetic. 
//This program should calculate the price before sales tax, 
//the sales tax, and the cost of socks, drinking glasses and envelopes. 

public class Arithmetic{
    public static void main(String[] args){

double taxPercent=0.06; // Sales tax in PA     
int nSocks=3; //Number of pairs of socks
double sockCost$=2.58; //Cost per pair of socks
//(‘$’ is part of the variable name)

//Here is where the total cost of socks is being calculated.
System.out.println("I am buying 3 pairs of socks.");
System.out.println("A pair of socks cost $2.58 per pair.");
double priceOfSocks=sockCost$*nSocks; //Calculates the total costs of socks before tax
System.out.println("$"+ priceOfSocks+ " is the cost of socks before tax.");
double taxForSocks= priceOfSocks* taxPercent; // Calculates the sales tax on the socks
int taxForSocks$ = (int) (taxForSocks*100); // Converting to 2 digits after the decimal place
taxForSocks = (double) taxForSocks$/100.0; // Converting to 2 digits after the decimal place
System.out.println("$"+ taxForSocks+ " is the sales tax of the socks.");
double totalCostOfSocks=priceOfSocks + taxForSocks; //Calculates the total cost of socks including sales tax
int totalCostOfSocks$ = (int) (totalCostOfSocks*100); // Converting to 2 digits after the decimal place
totalCostOfSocks = (double) totalCostOfSocks$/100.0; // Converting to 2 digits after the decimal place
System.out.println("$"+ totalCostOfSocks+ "0 is the total amount the socks cost including the sales tax.");

//Here is where the total cost of drinking glasses is being calculated.
int nGlasses=6; //Number of drinking glasses
double glassCost$=2.29; //Cost per glass
System.out.println("I am buying 6 drinking glasses.");
System.out.println("Drinking glasses cost $2.29 per glass.");
double priceOfGlasses = nGlasses*glassCost$; //Calculates the cost of Glasses before tax
System.out.println("$"+ priceOfGlasses+ " is the cost of glasses before tax.");
double taxForGlasses= priceOfGlasses*taxPercent; //Calculates the sales tax on the glasses
int taxForGlasses$ = (int) (taxForGlasses*100); // Converting to 2 digits after the decimal place
taxForGlasses = (double) taxForGlasses$/100.0; // Converting to 2 digits after the decimal place
System.out.println("$"+ taxForGlasses+ " is the sales tax of the glasses.");
double totalCostOfGlasses= taxForGlasses+priceOfGlasses; //Calculates the total cost of the glasses including the sales tax
System.out.println("$"+ totalCostOfGlasses+ " is the total amount the glasses cost including the sales tax.");

//Here is where the total cost of envelopes is being calculated.
int nEnvelopes=1; //Number of boxes of envelopes
double envelopeCost$=3.25; //cost per box of envelopes
System.out.println("I am buying 1 box of envelopes.");
System.out.println("A box of envelopes cost $3.25 per box.");
double priceOfEnvelopes= nEnvelopes*envelopeCost$; //Calculates the cost of envelopes before tax
System.out.println("$"+ priceOfEnvelopes+ " is the cost of envelopes before tax.");
double taxForEnvelopes= taxPercent*priceOfEnvelopes; //Calculates the sales tax on the envelopes
int taxForEnvelopes$ = (int) (taxForEnvelopes*100); // Converting to 2 digits after the decimal place
taxForEnvelopes = (double) taxForEnvelopes$/100.0; // Converting to 2 digits after the decimal place
System.out.println("$"+ taxForEnvelopes+ " is the sales tax of the envelopes.");
double totalCostOfEnvelopes= taxForEnvelopes+priceOfEnvelopes; //Calulates the total cost of the envelopes including tax
System.out.println("$"+ totalCostOfEnvelopes+ " is the total amount the envelopes cost including the sales tax.");

//Here the total cost of the purchase (including all 3 items) is calculated 
double totalBeforeTax= priceOfEnvelopes+priceOfGlasses+priceOfSocks; //Calculates the total of the purchase before tax
int totalBeforeTax$ = (int) (totalBeforeTax*100); // Converting to 2 digits after the decimal place
totalBeforeTax = (double) totalBeforeTax$/100.0; // Converting to 2 digits after the decimal place
System.out.println("$"+ totalBeforeTax+ " is the total cost of the purchase before sales tax.");
double totalCostOfPurchase= totalCostOfSocks+totalCostOfEnvelopes+totalCostOfGlasses; //Calculates the total of the purchase including tax
System.out.println("$"+ totalCostOfPurchase+ "0 is the total cost of the purchase including sales tax.");
    }
}