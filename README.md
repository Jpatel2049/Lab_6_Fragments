# CIS 3515 Assignment 6
Instructions: Refactoring your last app to use a single activity along with Fragments instead of 2 activities. You will then generate a signed APK with a new version number.
1. You will allow a user to select a color from an adapter view (the Spinner) in the palette fragment, and once selected, the information should be passed to the second fragment that will set its background to the selected color.
2. Create 2 fragments – PaletteFragment (your ‘master’ fragment), and CanvasFragment (your ‘details’ fragment).
3. When a user selects a color from an Adapter View in the master fragment, the detail fragment should receive the selected color via the parent activity and update its layout background to said color.
4. Once your application has been tested, update the version number and generate a new APK
1. Modify the file build.gradle (Module:app) found under Gradle Scripts in the project view
1. Under default config, change versionCode to 2, and versionName to 1.0.1-spanish
2. Click on Build and select Generate Signed APK
3. On the presented dialog, click on Choose existing and locate the certificate you generated during the previous lab. Select the alias you had created and enter the requested passwords, then click on Next.
Please note: If you are unable to find your previous key store, or are unable to recall one or both passwords, then you can create a new key store and key. Keep in mind however that had this application been previously distributed on Google Play or another distribution platform, you would have lost the ability to update the application currently deployed and would instead have to change the package name (your apps unique identifier), lose your current user base and start all over.
4. Select the destination folder of the APK and set Build Type to release
5. Click on Finish
6. Locate and rename your generated APK to colorchooser-release-1.0.1.apk
7. Update your project on GitHub and submit it along with the signed APK file to Canvas.
NOTE
If it helps, you can start a new project for this lab instead of refactoring your old project.
Ensure that the PaletteFragment enforces the implementation of its interface by its parent activity when its attached. If the parent does not implement the interface the fragment should throw an exception.
