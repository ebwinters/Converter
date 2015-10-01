import java.awt.*;
import javax.swing.*;

import java.util.Scanner;
public class Converter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//setup scanner
		Scanner input = new Scanner(System.in);

		//make variables for distance
		int inchto;
		int centto;
		int metto;
		int ftto;
		int milto;
		int ydto;
		int inch;
		int cent;
		int meter;
		int foot;
		int mile;
		int yard;
		int distoption;

		//make variables for money
		int monoption;
		int dolto;
		int pesto;
		int euroto;
		float dollar;
		int peso;
		int euro;

		//make variables for weight
		int weightoption;
		int ounceto;
		int poundto;
		int gramto;
		int tonto;
		int ounce;
		int pound;
		int gram;
		int ton;

		//make variables for time
		int timeoption;
		int milito;
		int secto;
		int minto;
		int hrto;
		int dayto;
		int milisecond;
		int second;
		int minute;
		int hour;
		int day;

		//make variables for weather
		int weatheroption;
		int farto;
		int celto;
		int kelto;
		float faren;
		float cel;
		float kelvin;

		//genreal variables
		String name;
		int option;
		int again = 0;
		//ask user for name
		name = JOptionPane.showInputDialog ("Enter Your Name" );


	boolean answer = false;
	
		do{	
						

			//Ask user to pick a thing to convert
			option = Integer.parseInt (JOptionPane.showInputDialog ("What would you like to convert today, " + name + "? " + 
					"\n Press <1> for distance ,\n press <2> for money, \n" + "press <3> for weight ,\n press <4> for time, \n" + "and press <5> for temperature \n"));

			//if statements for distance
			if (option == 1){ 
				distoption = Integer.parseInt (JOptionPane.showInputDialog ("What kind of distance do you want to convert?\n Press <1> to convert from inches.\n Press <2> to convert from centimeters.\n Press <3> to convert from meters.\n Press <4> to convert from feet.\n Press <5> to convert from miles.\n Press <6> to convert from yards.") );

				if (distoption == 1){
					inch = Integer.parseInt (JOptionPane.showInputDialog("How many inches are there?"));

					inchto = Integer.parseInt (JOptionPane.showInputDialog ("What unit would you like to convert inches into? \n Press <1> to convert to centimeters. \n Press <2> to convert to meters. \n Press <3> to convert to feet. \n Press <4> to convert to miles. \n Press <5> to convert to yards."));

					if (inchto == 1) {
						JOptionPane.showMessageDialog(null, inch * 2.54 + "centimeters = " + inch + " inches.");
						again = Integer.parseInt (JOptionPane.showInputDialog("If you want to do another calculation, press <1>. If not, press <2>"));
					}

					if (inchto == 2){
						JOptionPane.showMessageDialog(null, inch + " inches = " + inch * 0.0254 + " meters.");
						again = Integer.parseInt (JOptionPane.showInputDialog("If you want to do another calculation, press <1>. If not, press <2>"));
					}

					if (inchto == 3){
						JOptionPane.showMessageDialog(null, inch + " inches = " + inch * 12 + " feet.");
						again = Integer.parseInt (JOptionPane.showInputDialog("If you want to do another calculation, press <1>. If not, press <2>"));
					}

					if (inchto == 4){
						JOptionPane.showMessageDialog(null, inch + " inches = " + inch * 0.000015783 + " miles.");
						again = Integer.parseInt (JOptionPane.showInputDialog("If you want to do another calculation, press <1>. If not, press <2>"));
					}

					if (inchto == 5){
						JOptionPane.showMessageDialog(null,inch + " inches = " + inch * 0.0277778 + " yards." );
						again = Integer.parseInt (JOptionPane.showInputDialog("If you want to do another calculation, press <1>. If not, press <2>"));
					}
				}

				if (distoption == 2){

					cent = Integer.parseInt (JOptionPane.showInputDialog("How many centimeters are there?"));

					centto = Integer.parseInt (JOptionPane.showInputDialog ("What unit would you like to convert centimeters into? \n Press <1> to convert to inches. \n Press <2> to convert to meters. \n Press <3> to convert to feet. \n Press <4> to convert to miles. \n Press <5> to convert to yards."));


					if (centto == 1){
						JOptionPane.showMessageDialog(null, cent + " centimeters = " + cent * 0.393701 + " inches.");
						again = Integer.parseInt (JOptionPane.showInputDialog("If you want to do another calculation, press <1>. If not, press <2>"));

					}

					if (centto == 2){
						JOptionPane.showMessageDialog(null, cent + " centimeters = " + cent * 0.01 + " meters.");
						again = Integer.parseInt (JOptionPane.showInputDialog("If you want to do another calculation, press <1>. If not, press <2>"));
					}

					if (centto == 3){
						JOptionPane.showMessageDialog(null, cent + " centimeters = " + cent * 0.0328084 + " feet.");
						again = Integer.parseInt (JOptionPane.showInputDialog("If you want to do another calculation, press <1>. If not, press <2>"));
					}

					if (centto == 4){
						JOptionPane.showMessageDialog(null, cent + " centimeters = " + cent * 0.0000062137 + " miles.");
						again = Integer.parseInt (JOptionPane.showInputDialog("If you want to do another calculation, press <1>. If not, press <2>"));

					}

					if (centto == 5){
						JOptionPane.showMessageDialog(null, cent + " centimeters = " + cent * 0.0109361 + " yards.");
						again = Integer.parseInt (JOptionPane.showInputDialog("If you want to do another calculation, press <1>. If not, press <2>"));
					}
				}

				if (distoption == 3){

					meter = Integer.parseInt (JOptionPane.showInputDialog("How many meters are there?"));

					metto = Integer.parseInt (JOptionPane.showInputDialog ("What unit would you like to convert meters into? \n Press <1> to convert to inches. \n Press <2> to convert to centimeters. \n Press <3> to convert to feet. \n Press <4> to convert to miles. \n Press <5> to convert to yards."));

					if (metto == 1){
						JOptionPane.showMessageDialog(null, meter + " meters = " + meter * 39.3701 + " inches.");
						again = Integer.parseInt (JOptionPane.showInputDialog("If you want to do another calculation, press <1>. If not, press <2>"));
					}

					if (metto == 2){
						JOptionPane.showMessageDialog(null,meter + " meters = " + meter * 100 + " centimeters.");
						again = Integer.parseInt (JOptionPane.showInputDialog("If you want to do another calculation, press <1>. If not, press <2>"));
					}

					if (metto == 3){
						JOptionPane.showMessageDialog(null,meter + " meters = " + meter * 3.28084 + " feet.");
						again = Integer.parseInt (JOptionPane.showInputDialog("If you want to do another calculation, press <1>. If not, press <2>"));
					}

					if (metto == 4){
						JOptionPane.showMessageDialog(null,meter + " meters = " + meter * 0.000621371 + " miles.");
						again = Integer.parseInt (JOptionPane.showInputDialog("If you want to do another calculation, press <1>. If not, press <2>"));
					}

					if (metto == 5){
						JOptionPane.showMessageDialog(null,meter + " meters = " + meter * 1.09361 + " yards.");
						again = Integer.parseInt (JOptionPane.showInputDialog("If you want to do another calculation, press <1>. If not, press <2>"));
					}
				}

				if (distoption == 4){
					foot = Integer.parseInt (JOptionPane.showInputDialog("How many feet are there?"));

					ftto = Integer.parseInt (JOptionPane.showInputDialog ("What unit would you like to convert feet into? \n Press <1> to convert to inches. \n Press <2> to convert to centimeters. \n Press <3> to convert to meters. \n Press <4> to convert to miles. \n Press <5> to convert to yards."));



					if (ftto == 1){
						JOptionPane.showMessageDialog(null,foot + " feet = " + foot * 12 + " inches.");
						again = Integer.parseInt (JOptionPane.showInputDialog("If you want to do another calculation, press <1>. If not, press <2>"));
					}
					if (ftto == 2){
						JOptionPane.showMessageDialog(null,foot + " feet = " + foot * 30.48 + " centimeters.");
						again = Integer.parseInt (JOptionPane.showInputDialog("If you want to do another calculation, press <1>. If not, press <2>"));
					}

					if (ftto == 3){
						JOptionPane.showMessageDialog(null,foot + " feet = " + foot * 0.3048 + " meters.");
						again = Integer.parseInt (JOptionPane.showInputDialog("If you want to do another calculation, press <1>. If not, press <2>"));
					}

					if (ftto == 4){
						JOptionPane.showMessageDialog(null,foot + " feet = " + foot * 0.000189394 + " miles.");
						again = Integer.parseInt (JOptionPane.showInputDialog("If you want to do another calculation, press <1>. If not, press <2>"));
					}

					if (ftto == 5){
						JOptionPane.showMessageDialog(null,foot + " feet = " + foot * 0.333333 + " yards.");
						again = Integer.parseInt (JOptionPane.showInputDialog("If you want to do another calculation, press <1>. If not, press <2>"));
					}
				}

				if (distoption == 5){
					mile = Integer.parseInt (JOptionPane.showInputDialog("How many miles are there?"));

					milto = Integer.parseInt (JOptionPane.showInputDialog ("What unit would you like to convert miles into? \n Press <1> to convert to inches. \n Press <2> to convert to centimeters. \n Press <3> to convert to meters. \n Press <4> to convert to feet. \n Press <5> to convert to yards."));

					if (milto == 1){
						JOptionPane.showMessageDialog(null,(mile + " miles = " + mile * 63360 + " inches"));
						again = Integer.parseInt (JOptionPane.showInputDialog("If you want to do another calculation, press <1>. If not, press <2>"));
					}

					if (milto == 2){
						JOptionPane.showMessageDialog(null,mile + " miles = " + mile * 160934 + " centimeters");
						again = Integer.parseInt (JOptionPane.showInputDialog("If you want to do another calculation, press <1>. If not, press <2>"));
					}

					if (milto == 3){
						JOptionPane.showMessageDialog(null,mile + " miles = " + mile * 1609.34 + " meters");
						again = Integer.parseInt (JOptionPane.showInputDialog("If you want to do another calculation, press <1>. If not, press <2>"));
					}

					if (milto == 4){
						JOptionPane.showMessageDialog(null,mile + " miles = " + mile * 5280 + " feet");
						again = Integer.parseInt (JOptionPane.showInputDialog("If you want to do another calculation, press <1>. If not, press <2>"));
					}

					if (milto == 5){
						JOptionPane.showMessageDialog(null,mile + " miles = " + mile * 1760 + " yards");
						again = Integer.parseInt (JOptionPane.showInputDialog("If you want to do another calculation, press <1>. If not, press <2>"));
					}

				}


				if (distoption == 6){
					yard = Integer.parseInt (JOptionPane.showInputDialog("How many yards are there?"));

					ydto = Integer.parseInt (JOptionPane.showInputDialog ("What unit would you like to convert yards into? \n Press <1> to convert to inches. \n Press <2> to convert to centimeters. \n Press <3> to convert to meters. \n Press <4> to convert to feet. \n Press <5> to convert to miles."));


					if (ydto == 1){
						JOptionPane.showMessageDialog(null,yard + " yards = " + yard * 36 + " inches");
						again = Integer.parseInt (JOptionPane.showInputDialog("If you want to do another calculation, press <1>. If not, press <2>"));
					}

					if (ydto == 2){
						JOptionPane.showMessageDialog(null,yard + " yards = " + yard * 91.44 + " centimeters");
						again = Integer.parseInt (JOptionPane.showInputDialog("If you want to do another calculation, press <1>. If not, press <2>"));
					}

					if (ydto == 3){
						JOptionPane.showMessageDialog(null,yard + " yards = " + yard * 0.9144 + " meters");
						again = Integer.parseInt (JOptionPane.showInputDialog("If you want to do another calculation, press <1>. If not, press <2>"));
					}

					if (ydto == 4){
						JOptionPane.showMessageDialog(null,yard + " yards = " + yard * 3 + " feet");
						again = Integer.parseInt (JOptionPane.showInputDialog("If you want to do another calculation, press <1>. If not, press <2>"));
					}

					if (ydto == 5){
						JOptionPane.showMessageDialog(null,yard + " yards = " + yard * 0.000568182 + " miles");
						again = Integer.parseInt (JOptionPane.showInputDialog("If you want to do another calculation, press <1>. If not, press <2>"));
					}
				}//end 6	





			}//end distance
			// start money
			else if (option == 2){ 
				monoption = Integer.parseInt (JOptionPane.showInputDialog ("What kind of money do you want to convert?\n Press <1> to convert from dollars.\n Press <2> to convert from pesos.\n Press <3> to convert from euros.") );


				if (monoption == 1){
					dollar = Integer.parseInt (JOptionPane.showInputDialog("How many dollars are there?"));
					dolto = Integer.parseInt (JOptionPane.showInputDialog ("What unit would you like to convert dollars into? \n Press <1> to convert to pesos. \n Press <2> to convert to euros."));


					if (dolto == 1){
						JOptionPane.showMessageDialog(null,dollar + " dollars = " + dollar * 13.22 + " pesos.");
						again = Integer.parseInt (JOptionPane.showInputDialog("If you want to do another calculation, press <1>. If not, press <2>"));
					}

					if (dolto == 2){
						JOptionPane.showMessageDialog(null,dollar + " dollars = " + dollar * 0.77 + " euros.");
						again = Integer.parseInt (JOptionPane.showInputDialog("If you want to do another calculation, press <1>. If not, press <2>"));
					}
				}//end dollar

				if (monoption == 2){
					peso = Integer.parseInt (JOptionPane.showInputDialog("How many dollars are there?"));
					pesto = Integer.parseInt (JOptionPane.showInputDialog ("What unit would you like to convert pesos into? \n Press <1> to convert to dollars. \n Press <2> to convert to euros."));


					if (pesto == 1){
						JOptionPane.showMessageDialog(null,peso + " pesos = " + peso * 0.076 + " dollars.");
						again = Integer.parseInt (JOptionPane.showInputDialog("If you want to do another calculation, press <1>. If not, press <2>"));

					}

					if (pesto == 2){
						JOptionPane.showMessageDialog(null,peso + " pesos = " + peso * 0.058 + " euros.");
						again = Integer.parseInt (JOptionPane.showInputDialog("If you want to do another calculation, press <1>. If not, press <2>"));
					}

				}//end peso

				if (monoption == 3){
					euro = Integer.parseInt (JOptionPane.showInputDialog("How many euros are there?"));
					euroto = Integer.parseInt (JOptionPane.showInputDialog ("What unit would you like to convert euros into? \n Press <1> to convert to dollars. \n Press <2> to convert to pesos."));


					if (euroto == 1){
						JOptionPane.showMessageDialog(null,euro + " euros = " + euro * 1.30 + " dollars.");
						again = Integer.parseInt (JOptionPane.showInputDialog("If you want to do another calculation, press <1>. If not, press <2>"));
					}

					if (euroto == 2){
						JOptionPane.showMessageDialog(null,euro + " euros = " + euro * 17.13 + " pesos.");
						again = Integer.parseInt (JOptionPane.showInputDialog("If you want to do another calculation, press <1>. If not, press <2>"));
					}



				}//end euro



			}//endmoney 
			//start weight
			else if (option == 3){

				weightoption = Integer.parseInt (JOptionPane.showInputDialog ("What kind of weight do you want to convert?\n Press <1> to convert from pounds.\n Press <2> to convert from ounces.\n Press <3> to convert from grams. \n Press <4> to convert from tons.") );


				if (weightoption == 1){
					pound = Integer.parseInt (JOptionPane.showInputDialog("How many pounds are there?"));
					poundto = Integer.parseInt (JOptionPane.showInputDialog ("What unit would you like to convert pounds into? \n Press <1> to convert to ounces. \n Press <2> to convert to grams. \n Press <3> to convert to tons."));


					if (poundto == 1){
						JOptionPane.showMessageDialog(null,pound + " pounds = " + pound * 16 + " ounces.");
						again = Integer.parseInt (JOptionPane.showInputDialog("If you want to do another calculation, press <1>. If not, press <2>"));
					}

					if (poundto == 2){
						JOptionPane.showMessageDialog(null,pound + " pounds = " + pound * 453.592 + " grams.");
						again = Integer.parseInt (JOptionPane.showInputDialog("If you want to do another calculation, press <1>. If not, press <2>"));
					}

					if (poundto == 3){
						JOptionPane.showMessageDialog(null,pound + " pounds = " + pound * 0.0005 + " tons.");
						again = Integer.parseInt (JOptionPane.showInputDialog("If you want to do another calculation, press <1>. If not, press <2>"));
					}
				}//end from pounds

				if (weightoption == 2){
					ounce = Integer.parseInt (JOptionPane.showInputDialog("How many ounces are there?"));
					ounceto = Integer.parseInt (JOptionPane.showInputDialog ("What unit would you like to convert ounces into? \n Press <1> to convert to pounds. \n Press <2> to convert to grams. \n Press <3> to convert to tons."));


					if (ounceto == 1){
						JOptionPane.showMessageDialog(null,ounce + " ounces = " + ounce * 0.0625 + " pounds.");
						again = Integer.parseInt (JOptionPane.showInputDialog("If you want to do another calculation, press <1>. If not, press <2>"));
					}

					if (ounceto == 2){
						JOptionPane.showMessageDialog(null,ounce + " ounces = " + ounce * 28.3495 + " grams.");
						again = Integer.parseInt (JOptionPane.showInputDialog("If you want to do another calculation, press <1>. If not, press <2>"));
					}

					if (ounceto == 3){
						JOptionPane.showMessageDialog(null,ounce + " ounces = " + ounce * 3.125e-5  + " tons.");
						again = Integer.parseInt (JOptionPane.showInputDialog("If you want to do another calculation, press <1>. If not, press <2>"));
					}



				}//end from ounces

				if (weightoption == 3){
					gram = Integer.parseInt (JOptionPane.showInputDialog("How many grams are there?"));
					gramto = Integer.parseInt (JOptionPane.showInputDialog ("What unit would you like to convert grams into? \n Press <1> to convert to pounds. \n Press <2> to convert to ounces. \n Press <3> to convert to tons."));

					if (gramto == 1){
						JOptionPane.showMessageDialog(null,gram + " grams = " + gram * 0.00220462 + " pounds.");
						again = Integer.parseInt (JOptionPane.showInputDialog("If you want to do another calculation, press <1>. If not, press <2>"));
					}

					if (gramto == 2){
						JOptionPane.showMessageDialog(null,gram + " grams = " + gram * 0.035274 + " ounces.");
						again = Integer.parseInt (JOptionPane.showInputDialog("If you want to do another calculation, press <1>. If not, press <2>"));
					}

					if (gramto == 3){
						JOptionPane.showMessageDialog(null,gram + " grams = " + gram * 1.1023e-6 + " tons.");
						again = Integer.parseInt (JOptionPane.showInputDialog("If you want to do another calculation, press <1>. If not, press <2>"));
					}




				}//end from grams

				if (weightoption == 4){
					ton = Integer.parseInt (JOptionPane.showInputDialog("How many tons are there?"));
					tonto = Integer.parseInt (JOptionPane.showInputDialog ("What unit would you like to convert tons into? \n Press <1> to convert to pounds. \n Press <2> to convert to ounces. \n Press <3> to convert to grams."));

					if (tonto == 1){
						JOptionPane.showMessageDialog(null,ton + " tons = " + ton * 2000 + " pounds");
						again = Integer.parseInt (JOptionPane.showInputDialog("If you want to do another calculation, press <1>. If not, press <2>"));
					}

					if (tonto == 2){
						System.out.println(ton + " tons = " + ton * 32000 + " ounces");
						System.out.println("If you want to do another calculation, press <1>. If not, press <2>");
						JOptionPane.showMessageDialog(null,ton + " tons = " + ton * 32000 + " ounces");
						again = Integer.parseInt (JOptionPane.showInputDialog("If you want to do another calculation, press <1>. If not, press <2>"));
					}

					if (tonto == 3){
						JOptionPane.showMessageDialog(null,ton + " tons = " + ton * 907185 + " grams");
						again = Integer.parseInt (JOptionPane.showInputDialog("If you want to do another calculation, press <1>. If not, press <2>"));
					}
				}//end from tons

			}//end weight


			else if (option == 4){
				timeoption = Integer.parseInt (JOptionPane.showInputDialog ("What kind of time do you want to convert?\n Press <1> to convert from miliseconds.\n Press <2> to convert from seconds.\n Press <3> to convert from minutes. \n Press <4> to convert from hours. \n Press <5> to convert from days.") );


				if (timeoption == 1){
					milisecond = Integer.parseInt (JOptionPane.showInputDialog("How many miliseconds are there?"));
					milito = Integer.parseInt (JOptionPane.showInputDialog ("What unit would you like to convert miliseconds into? \n Press <1> to convert to seconds. \n Press <2> to convert to minutes. \n Press <3> to convert to hours. \n Press <4> to convert to days."));


					if (milito == 1){
						JOptionPane.showMessageDialog(null,milisecond + " miliseconds = " + milisecond * 0.001 + " seconds");
						again = Integer.parseInt (JOptionPane.showInputDialog("If you want to do another calculation, press <1>. If not, press <2>"));
					}

					if (milito == 2){
						JOptionPane.showMessageDialog(null,milisecond + " miliseconds = " + milisecond * 1.6667e-5 + " minutes");
						again = Integer.parseInt (JOptionPane.showInputDialog("If you want to do another calculation, press <1>. If not, press <2>"));
					}

					if (milito == 3){
						JOptionPane.showMessageDialog(null,milisecond + " miliseconds = " + milisecond * 2.7778e-7 + " hours");
						again = Integer.parseInt (JOptionPane.showInputDialog("If you want to do another calculation, press <1>. If not, press <2>"));
					}

					if (milito == 4){
						JOptionPane.showMessageDialog(null,milisecond + " miliseconds = " + milisecond * 1.1574e-8 + " days");
						again = Integer.parseInt (JOptionPane.showInputDialog("If you want to do another calculation, press <1>. If not, press <2>"));
					}


				}//end from miliseconds

				if (timeoption == 2){
					second = Integer.parseInt (JOptionPane.showInputDialog("How many seconds are there?"));
					secto = Integer.parseInt (JOptionPane.showInputDialog ("What unit would you like to convert seconds into? \n Press <1> to convert to miliseconds. \n Press <2> to convert to minutes. \n Press <3> to convert to hours. \n Press <4> to convert to days."));


					if (secto == 1){
						JOptionPane.showMessageDialog(null,second + " seconds = " + second * 1000 + " miliseconds");
						again = Integer.parseInt (JOptionPane.showInputDialog("If you want to do another calculation, press <1>. If not, press <2>"));
					}

					if (secto == 2){
						JOptionPane.showMessageDialog(null,second + " seconds = " + second * 0.0166667 + " minutes");
						again = Integer.parseInt (JOptionPane.showInputDialog("If you want to do another calculation, press <1>. If not, press <2>"));
					}

					if (secto == 3){
						JOptionPane.showMessageDialog(null,second + " seconds = " + second * 0.000277778 + " hours");
						again = Integer.parseInt (JOptionPane.showInputDialog("If you want to do another calculation, press <1>. If not, press <2>"));
					}

					if (secto == 4){
						JOptionPane.showMessageDialog(null,second + " seconds = " + second * 1.1574e-5 + " days");
						again = Integer.parseInt (JOptionPane.showInputDialog("If you want to do another calculation, press <1>. If not, press <2>"));
					}


				}//end from seconds

				if (timeoption == 3){
					minute = Integer.parseInt (JOptionPane.showInputDialog("How many minutes are there?"));
					minto = Integer.parseInt (JOptionPane.showInputDialog ("What unit would you like to convert minutes into? \n Press <1> to convert to miliseconds. \n Press <2> to convert to seconds. \n Press <3> to convert to hours. \n Press <4> to convert to days."));


					if (minto == 1){
						JOptionPane.showMessageDialog(null,minute + " minutes = " + minute * 60000 + " miliseconds");
						again = Integer.parseInt (JOptionPane.showInputDialog("If you want to do another calculation, press <1>. If not, press <2>"));
					}

					if (minto == 2){
						JOptionPane.showMessageDialog(null,minute + " minutes = " + minute * 60 + " seconds");
						again = Integer.parseInt (JOptionPane.showInputDialog("If you want to do another calculation, press <1>. If not, press <2>"));
					}

					if (minto == 3){
						JOptionPane.showMessageDialog(null,minute + " minutes = " + minute * 0.0166667 + " hours");
						again = Integer.parseInt (JOptionPane.showInputDialog("If you want to do another calculation, press <1>. If not, press <2>"));
					}

					if (minto == 4){
						JOptionPane.showMessageDialog(null,minute + " minutes = " + minute * 0.000694444 + " days");
						again = Integer.parseInt (JOptionPane.showInputDialog("If you want to do another calculation, press <1>. If not, press <2>"));
					}

				}//end from minutes

				if (timeoption == 4){
					hour = Integer.parseInt (JOptionPane.showInputDialog("How many hours are there?"));
					hrto = Integer.parseInt (JOptionPane.showInputDialog ("What unit would you like to convert hours into? \n Press <1> to convert to miliseconds. \n Press <2> to convert to seconds. \n Press <3> to convert to minutes. \n Press <4> to convert to days."));

					if (hrto == 1){
						JOptionPane.showMessageDialog(null,hour + " hours = " + hour * 3.6e+6 + "miliseconds");
						again = Integer.parseInt (JOptionPane.showInputDialog("If you want to do another calculation, press <1>. If not, press <2>"));
					}

					if (hrto == 2){
						JOptionPane.showMessageDialog(null,hour + " hours = " + hour * 3600 + "seconds");
						again = Integer.parseInt (JOptionPane.showInputDialog("If you want to do another calculation, press <1>. If not, press <2>"));
					}

					if (hrto == 3){
						JOptionPane.showMessageDialog(null,hour + " hours = " + hour * 60 + "minutes");
						again = Integer.parseInt (JOptionPane.showInputDialog("If you want to do another calculation, press <1>. If not, press <2>"));
					}

					if (hrto == 4){
						JOptionPane.showMessageDialog(null,hour + " hours = " + hour * 0.0416667 + "days");
						again = Integer.parseInt (JOptionPane.showInputDialog("If you want to do another calculation, press <1>. If not, press <2>"));
					}
				}//end from hours

				if (timeoption == 5){
					day = Integer.parseInt (JOptionPane.showInputDialog("How many days are there?"));
					dayto = Integer.parseInt (JOptionPane.showInputDialog ("What unit would you like to convert days into? \n Press <1> to convert to miliseconds. \n Press <2> to convert to seconds. \n Press <3> to convert to minutes. \n Press <4> to convert to hours."));

					if (dayto == 1){
						JOptionPane.showMessageDialog(null,day + " days = " + day * 3.6e+6 + "miliseconds");
						again = Integer.parseInt (JOptionPane.showInputDialog("If you want to do another calculation, press <1>. If not, press <2>"));

					}

					if (dayto == 2){
						JOptionPane.showMessageDialog(null,day + " days = " + day * 86400 + " seconds");
						again = Integer.parseInt (JOptionPane.showInputDialog("If you want to do another calculation, press <1>. If not, press <2>"));
					}

					if (dayto == 3){
						JOptionPane.showMessageDialog(null,day + " days = " + day * 1440 + " minutes");
						again = Integer.parseInt (JOptionPane.showInputDialog("If you want to do another calculation, press <1>. If not, press <2>"));
					}

					if (dayto == 4){
						JOptionPane.showMessageDialog(null,day + " days = " + day * 24 + " hours");
						again = Integer.parseInt (JOptionPane.showInputDialog("If you want to do another calculation, press <1>. If not, press <2>"));
					}

				}// end from days
			}//end time

			else if (option == 5){
				weatheroption = Integer.parseInt (JOptionPane.showInputDialog ("What kind of temperature do you want to convert?\n Press <1> to convert from fahrenheit.\n Press <2> to convert from celsius.\n Press <3> to convert from kelvins.") );


				if (weatheroption == 1){
					faren = Integer.parseInt (JOptionPane.showInputDialog("What is the temperature in fahrenheit?"));
					farto = Integer.parseInt (JOptionPane.showInputDialog ("What unit would you like to convert fahrenheit into? \n Press <1> to convert to celsius. \n Press <2> to convert to kelvins."));

					if (farto == 1){
						JOptionPane.showMessageDialog(null,faren + " fahrenheit = " + (faren - 32) * 0.55555555555 + " celsius");
						again = Integer.parseInt (JOptionPane.showInputDialog("If you want to do another calculation, press <1>. If not, press <2>"));
					}

					if (farto == 2){
						JOptionPane.showMessageDialog(null,faren + " fahrenheit = " + (((faren - 32) * 0.55555555555) + 273) + " kelvins");
						again = Integer.parseInt (JOptionPane.showInputDialog("If you want to do another calculation, press <1>. If not, press <2>"));
					}


				}//end from fahrenhiet

				if (weatheroption == 2){
					cel = Integer.parseInt (JOptionPane.showInputDialog("What is the temperature in celsius?"));
					celto = Integer.parseInt (JOptionPane.showInputDialog ("What unit would you like to convert celsius into? \n Press <1> to convert to fahrenheit. \n Press <2> to convert to kelvins."));


					if (celto == 1){
						JOptionPane.showMessageDialog(null,cel + " celsius = " + ((cel * 1.8) + 32) + " fahrenheit");
						again = Integer.parseInt (JOptionPane.showInputDialog("If you want to do another calculation, press <1>. If not, press <2>"));
					}

					if (celto == 2){
						JOptionPane.showMessageDialog(null,cel + " celsius = " + (cel + 273.15) + " kelvins");
						again = Integer.parseInt (JOptionPane.showInputDialog("If you want to do another calculation, press <1>. If not, press <2>"));
					}


				}//end from celsius

				if(weatheroption == 3){
					kelvin = Integer.parseInt (JOptionPane.showInputDialog("What is the temperature in kelvins?"));
					kelto = Integer.parseInt (JOptionPane.showInputDialog ("What unit would you like to convert kelvins into? \n Press <1> to convert to fahrenheit. \n Press <2> to convert to celsius."));


					if (kelto == 1){
						JOptionPane.showMessageDialog(null,kelvin + " kelvins = " + (((kelvin - 273.15) * 1.8) + 32) + " fahrenheit");
						again = Integer.parseInt (JOptionPane.showInputDialog("If you want to do another calculation, press <1>. If not, press <2>"));
					}

					if (kelto == 2){
						JOptionPane.showMessageDialog(null,kelvin + " kelvins = " + (kelvin - 273.15) + " celsius");
						again = Integer.parseInt (JOptionPane.showInputDialog("If you want to do another calculation, press <1>. If not, press <2>"));
					}



				}//end from kelvins


			}//end weather

			else{
				JOptionPane.showMessageDialog(null, "That is not a valid number, please choose a valid number.");		
			}


			if (again == 2){

				JOptionPane.showMessageDialog(null,"Thank you for using Converter Pro, " + name + ".");
			}

			if (again == 1){
				answer = true;
			}
			}
		
		while(answer);{
			 
	
			
		}
	}

}