# Android-OS-Bug
Repo to hold code for reproducable android os bug reported at https://issuetracker.google.com/issues/64069975

Current bug is that you can launch an intent without the FLAG_ACTIVITY_NEW_TASK in android versions 7.0+ without crashing while in all previous versions of android you will crash.  This change is not documented anywhere.
