/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		int allBanks = 120;
		int whitePaintForOneClass = 2;
		int brownPaintForOneClass = 4;
		int numberOfClasses = allBanks / (whitePaintForOneClass + brownPaintForOneClass);
		int whitePaintBanksNumber = numberOfClasses * whitePaintForOneClass;
		int brownPaintBanksNumber = numberOfClasses * brownPaintForOneClass;
		System.out.println("В школе, где " + numberOfClasses + " классов, нужно " + whitePaintBanksNumber + " банок белой краски и " + brownPaintBanksNumber + " банок коричневой краски");
		
		int bananas = 5;
		int oneBananaWeight = 80;
		int milk = 2;
		int oneHundredMlOfMilk = 105;
		int iceCream = 200;
		int eggs = 4;
		int oneEggWeight = 70;
		int allBananasWeight = bananas * oneBananaWeight;
		int milkWeight = milk * oneHundredMlOfMilk;
		int allEggsWeight = eggs * oneEggWeight;
		int weightBreakfast = allBananasWeight + milkWeight + iceCream + allEggsWeight;
		System.out.println("Вес спорт-завтрака в граммах равен " + weightBreakfast);
		int oneKg = 1000;
		int oneKgOfBreakfast = weightBreakfast / oneKg;
		System.out.println("Вес спорт-завтрака в килограммах равен " + oneKgOfBreakfast);
		
	}
}
