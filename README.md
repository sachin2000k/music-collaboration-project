# music-collaboration-project

Instructions to run 

1. Compile the code

Open your terminal, navigate to the project directory, and compile the Java files:
```
javac Admin.java User.java Musician.java Project.java MusicFile.java Portfolio.java Content.java SystemSettings.java Main.java
```

2. Run the Program

```
java Main
```


Testing Each Feature via the Interactive Interface
Admin Functionalities
# 1. User Management

## Create User:

Steps:
- Select 1 for Admin.
- Select 1 for User Management.
- Select 1 for Create User.
- Enter name and email when prompted.
Expected Output:
```
User [Name] created successfully.
```
## Update User:

Steps:
- While in User Management, select 2 for Update User.
- Enter the User ID to update.
Enter new name and email when prompted.
Expected Output:

```
User [ID] updated successfully.
```
## Delete User:

Steps:
- While in User Management, select 3 for Delete User.
- Enter the User ID to delete.

Expected Output:

```
User [ID] deleted successfully.
```

## List Users:

Steps:
- While in User Management, select 4 for List Users.

Expected Output:
```
Listing users:
[ID]: [Name] ([Role])
```

# 2. Content Moderation

List Pending Content:

Steps:
- From the Admin Dashboard, select 2 for Content Moderation.
- Select 1 for List Pending Content.
Expected Output:
```
Listing pending content:
[ID]: [Details]
```
## Approve Content:

Steps:
- From Content Moderation, select 2 for Approve Content.
- Enter the Content ID to approve.
Expected Output:
```
Content [ID] approved.
```
Reject Content:

Steps:
- From Content Moderation, select 3 for Reject Content.
- Enter the Content ID to reject.
Expected Output:
```
Content [ID] rejected.
```
# 3. System Settings

Update Setting:

Steps:
- From the Admin Dashboard, select 3 for System Settings.
- Select 1 for Update Setting.
- Enter setting name and value when prompted.
Expected Output:
```
System settings updated.
```
View Setting:

Steps:
- From System Settings, select 2 for View Setting.
- Enter the setting name to view its value.
Expected Output:
```
Setting [name] = [value]
```
Musician Functionalities
1. Project Collaboration

Create Project:

Steps:
    Select 2 for Musician.
    Enter your Musician User ID.
    Select 1 for Project Collaboration.
    Select 1 for Create Project.
    Enter project description and deadline.
Expected Output:
```
Project [Description] created.
```

## Add Collaborator to Project:

Steps:
- From Project Collaboration, select 2 for Add Collaborator.
- Enter Project ID and Collaborator User ID.
Expected Output:

```
Collaborator [Name] added to project.
```
## List Projects:

Steps:
- From Project Collaboration, select 3 for List Projects.
Expected Output:
```
Listing projects:
[ID]: [Description]
```
2. Share and Edit Music Files

Upload Music File:

Steps:
- From Musician Dashboard, select 2 for Share and Edit Music Files.
- Select 1 for Upload Music File.
- Enter the music file name.
Expected Output:
```
Music file [FileName] uploaded.
```
## Edit Music File:

Steps:
- From Music Files, select 2 for Edit Music File.
- Enter Music File ID and new content.
Expected Output:
```
Music file [ID] edited.
```
## List Music Files:

Steps:
- From Music Files, select 3 for List Music Files.
Expected Output:
```
Listing music files:
[ID]: [FileName]
Submit Content for Approval:
```

Steps:
- From Music Files, select 4 for Submit Content for Approval.
- Enter Music File ID to submit.
Expected Output:
```
Content submitted for approval.
```
# 3. Manage Music Portfolio

Add Music File to Portfolio:

Steps:
- From Musician Dashboard, select 3 for Manage Music Portfolio.
- Select 1 for Add Music File to Portfolio.
- Enter Music File ID.
Expected Output:
```
Music file [FileName] added to portfolio.
```
## Update Portfolio:

Steps:
- From Music Portfolio, select 2 for Update Portfolio.
Expected Output:
```
Portfolio updated. Current songs:
[ID]: [FileName]
```
Sample Run
Here's a sample interaction to guide you through:

Start the Program

```
Welcome to the Online Music Collaboration Platform!

Select User Type:
1. Admin
2. Musician
3. Exit
Enter choice: 
```
Log in as Admin and Create Users

Enter 1 for Admin.
In User Management, create two musicians.
Log in as Musician and Perform Operations

Enter 2 for Musician.
Enter your Musician User ID (e.g., 2).
Perform operations like creating a project, uploading music files, etc.
Submit Content for Approval

From the Musician's menu, submit a music file for approval.
Switch Back to Admin to Approve Content

Return to the main menu.
Log in as Admin.
In Content Moderation, approve the submitted content.
Notes
User IDs and Music File IDs are auto-incremented starting from 2 and 1, respectively.
Data Persistence: This program does not save data between runs. All data is stored in memory during the execution.
Error Handling: Minimal error handling is included. Ensure you enter valid numbers when prompted for IDs.
Simplification: Authentication is simplified; users are identified by their User IDs.
