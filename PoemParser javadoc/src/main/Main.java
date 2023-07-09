package main;


/**
* The main method that gathers the web info and supplies 
* input to the other classes
*
* @author  Justin Turner
*
*/


import java.io.IOException;


public class Main {

	public static void main(String[] args) throws IOException {

		//get the materials from the web-----------------------------------------------------------------------------------------------------------------
	String Page = "https://www.gutenberg.org/files/1065/1065-h/1065-h.htm";
	String firstDraft = StripSearch.GetPAge(Page);
	
	
	//trim the garbage----------------------------------------------------------------------------------------------------------------------------------------
	String CountME = StripSearch.Strip(firstDraft);
	//count, organize and print
	StringBuilder  allTheWords = WordCount.CountIt(CountME);
	Gui.SetString(allTheWords);
	
	
	
	new Gui ().setVisible(true);
   
}
}
