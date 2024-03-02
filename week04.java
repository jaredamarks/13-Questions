package week04;

public class week04 {



public static void main(String[] args) {


//Result A
int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
int resultA = ages[ages.length - 1] - ages[0];
System.out.println("Result A: " + resultA);

//Result B
int[] ages2 = new int[9];
int resultB = ages2[ages2.length - 1] - ages2[0];
System.out.println("Result B: " + resultB);

//Result C
int sum = 0;
for (int age : ages) {
sum += age;
}
double average = (double) sum / ages.length;
System.out.println("Average Age: " + average);



//String Array Operation A:
String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
double averageLetters = 0;
for (String name : names) {
averageLetters += name.length();
}
averageLetters /= names.length;
System.out.println("Average Letters per Name: " + averageLetters);



// String Array Operation B:
String concatenatedNames = "";
for (String name : names) {
concatenatedNames += name + " ";
}
System.out.println("Concatenated Names: " + concatenatedNames.trim());



// Use array.length - 1
int lastElement = ages[ages.length - 1];
System.out.println(lastElement);



// Use array[0]
int firstElement = ages[0];
System.out.println(firstElement);


// Add the length of each name to the nameLengths array

int[] nameLengths = new int[names.length];

for (int i = 0; i < names.length; i++) {

nameLengths[i] = names[i].length();

int sumNameLengths = 0;

for (int length : nameLengths) {

sumNameLengths += length;

}

System.out.println("Sum of Name Lengths: " + sumNameLengths);

}

}



// Calculate the sum of all elements in the array

public static String concatenateWord(String word, int n) {

StringBuilder result = new StringBuilder();

for (int i = 0; i < n; i++) {

result.append(word);

}

return result.toString();

}

public static String getFullName(String firstName, String lastName) {

return firstName + " " + lastName;

}

public static boolean isSumGreaterThan100(int[] numbers) {

int sum = 0;

for (int num : numbers) {

sum += num;

}

return sum > 100;

}

public static double calculateAverage(double[] numbers) {

double sum = 0;

for (double num : numbers) {

sum += num;

}

return sum / numbers.length;

}



public static boolean compareAverages(double[] arr1, double[] arr2) {

return calculateAverage(arr1) > calculateAverage(arr2);

}





public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {

	return isHotOutside = true && moneyInPocket > 10.50;

}



// Count vowels 
public static int countVowels(String inputString) {
int count = 0;

for (char ch : inputString.toLowerCase().toCharArray()) {

if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

count++;

}

}
String say = "hello";
System.out.println(countVowels(say));
return count;

}


}


