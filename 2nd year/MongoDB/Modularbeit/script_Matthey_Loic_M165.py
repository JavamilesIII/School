import pymongo
import sys
import os
import time
import rich
from rich.table import Table
from rich.console import Console
from rich import box
from rich import print

try:

    # Connection to MongoDB
    myclient = pymongo.MongoClient("mongodb://localhost:27017/")
    mydb = myclient["spiele"]
    mycol = mydb["pcgames"]

    # Function to clear terminal
    def clear_terminal():
        os.system('cls' if os.name == 'nt' else 'clear')

    # Function to insert a new game
    def einfuegen():
        name = input("Title: ")
        jahr = int(input("Release year: "))
        download = int(input("Downloads: "))
        alter = int(input("Age Restriction: "))
        art = input("Genres (comma-separated): ")
        art1 = art.split(', ')
        bewertung = float(input("Rating: "))
        mydict = { 
            "title": name, 
            "release_year": jahr, 
            "downloads": download, 
            "age_restriction": alter, 
            "genre": art1, 
            "ratings": bewertung,
            "is_deleted": False  # Default to not deleted
        }
        mycol.insert_one(mydict)

    # Function to output games
    def ausgabe():
        documents = list(mycol.find({"is_deleted": {"$ne": True}}))
        
        if not documents:
            print("No documents found.")
            return
        
        index = 0  # Start with the first document
        query = {"is_deleted": {"$ne": True}}
        
        
        while True:
            try:
                document = documents[index]
                table = Table(box=box.SIMPLE,title="[bold red]\nPC-Games Database[/bold red]", style="white")
                table.add_column("\n    ",justify="right", no_wrap=True, style="green")
                table.add_column(f"[magenta]\nGame Details ({index+1}/{len(documents)})  [/magenta] ", style="white")
                table.add_row("Title:", document.get('title', 'N/A'))
                table.add_row("Release year: ", str(document.get('release_year', 'N/A')))
                table.add_row("Downloads: ", str(document.get('downloads', 'N/A')))
                table.add_row("Age restriction: ", str(document.get('age_restriction', 'N/A')))
                table.add_row("Genres: ", ', '.join(document.get('genre', [])))
                table.add_row("Rating: ", str(document.get('ratings', 'N/A')))
                """
                print(f"\nGame Details ({index+1}/{len(documents)}):")
                print(f"Title: {document.get('title', 'N/A')}")
                print(f"Release Year: {document.get('release_year', 'N/A')}")
                print(f"Downloads: {document.get('downloads', 'N/A')}")
                print(f"Age Restriction: {document.get('age_restriction', 'N/A')}")
                print(f"Genre: {', '.join(document.get('genre', []))}")  # Join genres into a string
                print(f"Rating: {document.get('ratings', 'N/A')}")
                """
                console=Console()
                console.print(table)
                print("\n")

                
                # Ask for user input
                user_input = input("Press 'n' for next, 'p' for previous, 's' to search a specific document, \n'r' to reset the search, 'm' to modify, 'd' to delete, 'b' to go back: ").strip().lower()
            except IndexError:
                user_input = input("You have reached the end of the list. Press 'r' to reset the search: ").strip().lower()
            
            if user_input == 'n':
                index += 1
                clear_terminal()
            elif user_input == 'p':
                index -= 1
                clear_terminal()
            elif user_input == 'b':
                clear_terminal()
                break
            elif user_input == 's':
                query = suche()
                clear_terminal()
                documents = list(mycol.find(query))  # Refresh document list based on new query
                index = 0  # Reset index for new document list
            elif user_input == 'r':
                query = {"is_deleted": {"$ne": True}}
                documents = list(mycol.find(query))  # Refresh documents
                index = 0  # Reset index for new document list
                clear_terminal()
            elif user_input == 'm':
                if documents:
                    modify(documents[index])
                    documents = list(mycol.find(query))  # Refresh document list after modification
                    clear_terminal()
            elif user_input == 'd':
                if documents:
                    delete(documents[index])
                    documents = list(mycol.find(query))  # Refresh document list after deletion
                    index = 0  # Reset index for new document list
                    clear_terminal()
            else:
                while True:
                    clear_terminal()
                    console.print(table)
                    print("\n")
                    user_input =input("Invalid input. Please press 'n' for next, 'p' for previous, 's' to search a specific document, \n'r' to reset the search, 'm' to modify, 'd' to delete, 'b' to go back:")
                    if user_input == 'n' or user_input == 'p' or user_input == 's' or user_input == 'r' or user_input == 'm' or user_input == 'd' or user_input == 'b':
                        if user_input == 'n':
                            index += 1
                            clear_terminal()
                        elif user_input == 'p':
                            index -= 1
                            clear_terminal()
                        elif user_input == 'b':
                            clear_terminal()
                            break
                        elif user_input == 's':
                            query = suche()
                            clear_terminal()
                            documents = list(mycol.find(query))  # Refresh document list based on new query
                            index = 0  # Reset index for new document list
                        elif user_input == 'r':
                            query = {"is_deleted": {"$ne": True}}
                            documents = list(mycol.find(query))  # Refresh documents
                            index = 0  # Reset index for new document list
                            clear_terminal()
                        elif user_input == 'm':
                            if documents:
                                modify(documents[index])
                                documents = list(mycol.find(query))  # Refresh document list after modification
                                clear_terminal()
                        elif user_input == 'd':
                            if documents:
                                delete(documents[index])
                                documents = list(mycol.find(query))  # Refresh document list after deletion
                                index = 0  # Reset index for new document list
                                clear_terminal()
                        break
                    
                clear_terminal()
                    

            if index >= len(documents):  # Wrap around if we go past the end
                index = 0
            elif index < 0:  # Prevent negative index
                index = len(documents) - 1

    # Search function
    def suche():
        clear_terminal()
        table = Table(box=box.SIMPLE,title="[bold red]\nPC-Games Database[/bold red]", style="white")
        table.add_column("    ",justify="right", no_wrap=True, style="green")
        table.add_column("[magenta]Options  [/magenta] ", style="white")
        table.add_row("1", "By title")
        table.add_row("2", "By release year")
        table.add_row("3", "By downloads")
        table.add_row("4", "By age restriction")
        table.add_row("5", "By genre")
        table.add_row("6", "By rating")
        table.add_row("7", "Back")
        """options1 = [
            "    1 - By title",
            "    2 - By release year",
            "    3 - By downloads",
            "    4 - By age restriction",
            "    5 - By genre",
            "    6 - By rating",
            "    7 - Back"
        ]
        length = max(len(option) for option in options1) + 3
        start_top = "+" + "-" * (length) + "+\n"
        start_options = ""
        start_title = f"| OPTIONS " + " " * (length - 9) + "|\n"
        for option in options1:
            start_options += "|" + option + " " * (length - len(option)) + "|\n"
        print(start_top + start_title + start_options + start_top)
        """
        console=Console()
        console.print(table)
        
        # Convert choice input to an integer
        wahl = input("Choose an Option: ")

        # Handling each option
        query = {}
        if wahl == "1": 
            name = input("Title: ")
            query = {'title': {'$regex': name, '$options': 'i'}}
        
        elif wahl == "2":  # Search by release year
            jahr = input("Release year (use >, < for range): ")
            if jahr.startswith(">"):
                query = {'release_year': {'$gt': int(jahr[1:])}}
            elif jahr.startswith("<"):
                query = {'release_year': {'$lt': int(jahr[1:])}}
            elif int(jahr):
                query = {'release_year': int(jahr)}
        
        elif wahl == "3":  # Search by downloads
            download = input("Downloads (use >, < for range): ")
            if download.startswith(">"):
                query = {'downloads': {'$gt': int(download[1:])}}
            elif download.startswith("<"):
                query = {'downloads': {'$lt': int(download[1:])}}
            else:
                query = {'downloads': int(download)}
        
        elif wahl == "4":  # Search by age restriction
            alter = input("Age Restriction (use >, < for range): ")
            if alter.startswith(">"):
                query = {'age_restriction': {'$gt': int(alter[1:])}}
            elif alter.startswith("<"):
                query = {'age_restriction': {'$lt': int(alter[1:])}}
            else:
                query = {'age_restriction': int(alter)}
        
        elif wahl == "5":  # Search by genre
            art = input("Genres: ")
            query = {'genre': {'$regex': art, '$options': 'i'}}
        
        elif wahl == "6":  # Search by rating
            bewertung = input("Rating (use >, < for range): ")
            if bewertung.startswith(">"):
                query = {'ratings': {'$gt': float(bewertung[1:])}}
            elif bewertung.startswith("<"):
                query = {'ratings': {'$lt': float(bewertung[1:])}}
            else:
                query = {'ratings': float(bewertung)}

        elif wahl == "7":
            return {}  # Back option returns an empty query

        # Return the constructed query
        return query

    # Modify a document function
    def modify(document):
        clear_terminal()
        
        old_data = {"_id": document["_id"]}  # Use _id to identify the document for update
        print("\nGame Details:")
        
        new_title = input(f"Old title: {document.get('title', 'N/A')} --> New title: ")
        if new_title.strip():  # Update only if user enters something
            document['title'] = new_title
        
        while True:
            try:
                new_year = input(f"Old release Year: {document.get('release_year', 'N/A')} --> New release year: ")
                if new_year.strip():  # Update only if user enters something
                    document['release_year'] = int(new_year)
                break
            except ValueError:
                print("That's not a valid year!") 
        
        while True:
            try:
                new_downloads = input(f"Old number of downloads: {document.get('downloads', 'N/A')} --> New number of downloads: ")
                if new_downloads.strip():  # Update only if user enters something
                    document['downloads'] = int(new_downloads)
                break
            except ValueError:
                print("That's not a valid number!") 
        
        while True:
            try:
                new_age = input(f"Old age restriction: {document.get('age_restriction', 'N/A')} --> New age restriction: ")
                if new_age.strip():  # Update only if user enters something
                    document['age_restriction'] = int(new_age)
                break
            except ValueError:
                print("That's not a valid age restriction!") 
        
        new_genres = input(f"Old genres: {', '.join(document.get('genre', []))} --> New genres (separate with ','): ")
        if new_genres.strip():
            document['genre'] = new_genres.split(', ')  # Update only if user enters something
        
        while True:
            try:
                new_rating = input(f"Old rating: {document.get('ratings', 'N/A')} --> New rating (1.0-10.0): ")
                if new_rating.strip():  # Update only if user enters something
                    document['ratings'] = float(new_rating)
                break
            except ValueError:
                print("That's not a valid rating!") 
        
        print("\nUpdating document...")
        mycol.update_one(old_data, {"$set": document})  # Update the document in the database

    # Delete a document (soft delete)
    def delete(document):
        check = input("Are you sure to delete this (Y/N)? ")
        if check.upper() == 'Y':
            mycol.update_one({"_id": document["_id"]}, {"$set": {"is_deleted": True}})
            mycol.delete_one(document)
            print("Document deleted.")
            time.sleep(2)

    # Start page function
    def startseite():
        table = Table(box=box.SIMPLE,title="[bold red]\nPC-Games Database[/bold red]", style="white")
        table.add_column("\n    ",justify="right", no_wrap=True, style="green")
        table.add_column("[magenta]Options   [/magenta]", style="white")
        table.add_row("1", "Add game")
        table.add_row("2", "Show games")
        table.add_row("3", "Quit")
        """options = [
            "    1 - Add game",
            "    2 - Show every game",
            "    3 - Quit"
        ]
        length = max(len(option) for option in options) + 3
        start_top = "+" + "-" * (length) + "+\n"
        start_options = ""
        start_title = "| OPTIONS " + " " * (length - 9) + "|\n"
        for option in options:
            start_options += "|" + option + " " * (length - len(option)) + "|\n"
        print(start_top + start_title + start_options + start_top)"""
        console = Console()
        console.print(table)
        wahl = input("Choose an Option: ")
        
        return wahl

    # Main loop
    while True:
        clear_terminal()
        wahl = startseite()
        if wahl == "1":
            clear_terminal()
            einfuegen()
        elif wahl == "2":
            clear_terminal()
            ausgabe()
        elif wahl == "3":
            clear_terminal() 
            break
        else:
            clear_terminal()
            print("Invalid option. Please choose again.")

except Exception as error:
    print("\n\nERROR found! Please contact the support!\n")
    print(error)
    sys.exit(0)