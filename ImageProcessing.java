/*Kiet Sam, Febuary 19, 2013
The program creates a character array to represent the ASCII Image
then it displays the image in multiple methods that include
flipping it horrizontally, vertically, both, etc.*/
import java.io.*;
import java.util.*;
public class ImageProcessing {
	/*This is the main method which reads from the file and creates a
	character 2D array called image that will story the characters for
	the ASCII image. It also calls the methods that flip the image in
	various ways.*/
	public static void main (String[]args) throws FileNotFoundException{
		Scanner console = new Scanner (new File("homer.txt"));
		char[][]image = new char [console.nextInt()][console.nextInt()];
		display(console, image);
		displayFlippedVert(image);
		displayFlippedHoriz(image);
		displayFlippedVertHoriz(image);
		displayFlipped90Degrees(image);
	}
	/*This method assigns the character values to the 2D array and then
	prints out the characters, line to line to fully display the image.*/
	public static void display (Scanner console, char[][]image){
		for (int x = 0; x < image.length; x++){
			for (int i = 0; i < image[x].length; i++){
				image[x][i] = (char)console.nextInt();
				System.out.print(image[x][i]);
			}
			System.out.println();
		}
		System.out.println("----------------------------------------");
	}
	/*This method flips the image horrizontally.*/
	public static void displayFlippedHoriz (char[][]image){
		for (int x = 0; x < image.length; x++){
			for (int i = image[x].length-1; i >= 0; i--){
				System.out.print(image[x][i]);
			}
			System.out.println();
		}
		System.out.println("----------------------------------------");
	}
	/*This method flips the image vertically.*/
	public static void displayFlippedVert (char[][]image){
		for (int x = image.length-1; x >= 0; x--){
			for (int i = 0; i < image[x].length; i++){
				System.out.print(image[x][i]);
			}
			System.out.println();
		}
		System.out.println("----------------------------------------");
	}
	/*This method flips the image horrizontally then vertically.*/
	public static void displayFlippedVertHoriz(char[][]image){
		for (int x = image.length-1; x >= 0; x--){
			for (int i = image[x].length-1; i >= 0; i--){
				System.out.print(image[x][i]);
			}
			System.out.println();
		}
		System.out.println("----------------------------------------");
	}
	/*This method flips the image by 90 degrees.*/
	public static void displayFlipped90Degrees(char[][]image){
		for (int x = image[0].length-1; x >= 0; x--){
			for (int i = 0; i < image.length; i++){
				if (image[i][x] == ' '){
					System.out.print("   ");
				}
				else {
					System.out.print(image[i][x]);
				}
			}
			System.out.println();
		} 
		System.out.println("----------------------------------------");
	}
}