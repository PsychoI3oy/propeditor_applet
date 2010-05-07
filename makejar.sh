javac net/widgetron/propeditorapplet/*.java
jar -cf PropEditor.jar net/widgetron/propeditorapplet/*.class net/widgetron/propeditorapplet/SuggestionFile.txt
jarsigner PropEditor.jar PropEditor
