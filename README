PropEditor program as of the end of week 7 (session (object) saving)

Running the program: 

open the PropEditor.html in FireFox, when the prompt comes up, accept the certificate

I have included an example build.prop in this zip, SuggestionFile.txt is part of the .jar now. 

Main screen: 
Clicking 'Open File' button opens a file dialog, defaulting to the user's home directory (your 'my documents' on Windows, ~/ on Linux); Browse to and open the included build.example.prop file. 
	Opening anything other than a readable *.prop file (based on extension only) will result in an error. 
Clicking 'Open Session' opens a file dialog, , defaulting to the user's home directory (your 'my documents' on Windows, ~/ on Linux); Browse to and open a previously saved session. 
	
Editor screen: 
Clicking on a property will give a Suggestion window of values for the clicked property; the suggestion file is less sparse at this time but many properties have only one suggestion. 
Clicking Add will give a Suggestion screen of new properties to add to the file (all property names are suggested, duplicating an existing property wil overwrite). 
Clicking cancel will return to the Main screen. 
Clicking save saves the file under its current name (no indication is shown unless there's an error saving), saveas opens the file dialog to save. 
	there is no name checking on the save (so you can saveas build.prop.bak). Once 'saveas' is used and a different filename is chosen, 'save' will save to that file. 
Clicking Save Session opens the file dialog to save. There is no name checking on this either. This will write the object containing the Prop File to disk. 

Suggestion screen: 
Clicking cancel will return to the Editor screen; 
Clicking a suggested VALUE will change the selected entry and return to the Editor screen; Selecting "Manual entry" will pop up a manual entry dialog.
Clicking a suggested NAME (from Add in editor) will suggest values per above for the new property. 


Background: 

The Android operating system stores some of its settings in text files known as build.prop, build.[model].prop, etc. 
These files are usually left untouched during normal operation, but those of us that have rooted our phones and installed custom Android mods 
would like to have an easy way to edit such files on the phone. As Android apps are written in Java, this application (now applet) is the start 
of an Android App to make .prop file editing easier. The settings are stored in the file as key=value pairs, one per line. 
