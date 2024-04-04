package driver;

import LibItems.book;
import LibItems.Items;
import LibItems.journal;
import LibItems.media;
import LibItems.client.*;

import java.util.Scanner;

public class Driver {

    public static book[] books = new book[3];
    public static journal[] journals = new journal[3];
    public static media[] medias = new media[3];
    public static client[] clients = new client[3];


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
 

        System.out.print("would you like to get the menu or a predefined scenario (Y for menu and P for predefined scenario)");

        String choice = input.nextLine();
   
        if (choice.equalsIgnoreCase("y")) {
        	  while(true) {
            displayMenu();
            int menuOption = input.nextInt();

            switch (menuOption) {
                case 1:
                    System.out.println("Option 1 selected: Add an item");
                    addItem();
                    break;
                case 2:
                    System.out.println("Option 2 selected: Delete an item");
                    deleteItem();
                    break;
                case 3:
                    System.out.println("Option 3 selected: Change information of an item");
                    changeInfo();
                    break;
                case 4:
                    System.out.println("Option 4 selected: List all items in specific order");
                    // Add logic for listing all items in specific order
                    break;
                case 5:
                    System.out.println("Option 5 selected: Print all items from all categories");
                    listItems();                    
                    break;
                case 6:
                    System.out.println("Option 6 selected: Add a client");
                    addClient(); 
                    break;
                case 7:
                    System.out.println("Option 7 selected: Edit a client");
                    editClient();                    
                    break;
                case 8:
                    System.out.println("Option 8 selected: Delete a client");
                    deleteClient();
                    break;
                case 9:
                    System.out.println("Option 9 selected: Lease an item from a client and return an item from a client");
                    LeaseItem();                    
                    break;
                case 10:
                    System.out.println("Option 10 selected: Show all items leased by a client");
                  
                    break;
                case 11:
                    System.out.println("Option 11 selected: Show all leased Items (by all clients)");
                    showAllItemsLeased();                    
                    break;
       
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }

        
        }

        else if (choice.equalsIgnoreCase("p")) {

        	//creating arrays that store all objects of books, items and medias
        	book[]arrayB = new book[3];
        	journal []arrayJ = new journal[3];
        	media [] arrayM = new media[3];
        	client [] arrayC = new client[3];
        	Items [] items = new Items[10];
        	
            books[0] = new book(1234, "Karim Hanna", 1999, "little red riding hood", 500);
            books[1] = new book(1234, "Karim Hanna", 1999, "hamas", 600);
            // books[1] = new book (1234, "Carson Ken", 2023, "Me n My Kup", 300);
            books[2] = new book(1234, "Karim Hanna", 1999, "hamas", 600);
            
            //storing books inside the arrayB and storing books inside the item array
            arrayB[0]=books[0]; arrayB[1]=books[1]; arrayB[2]=books[2];
            items[0]=books[0];items[1]=books[1];items[2]=books[2];
            
            journals[0] = new journal(56789, "john doe", 2005, "who?", "j1");
            journals[1] = new journal(56789, "john doe", 2005, "who?", "j1");
            // trying out different types of journals to compare	journals [1]= new journal (123123, "Michael chandler", 2023, "MMA", "J5");
            journals[2] = new journal(543543, "Sassan", 2005, "sports complex", "J10");
            
            arrayJ[0] = journals[0]; arrayJ[1]=journals[1];arrayJ[2]=journals[2];
            items[3]=journals[0];items[4]=journals[1];items[5]=journals[2];
            
            medias[0] = new media(12736, "Conor Brian", 2021, "Why I hate apples", "audio");
            medias[1] = new media(123123, "Maged", 2020, "The science of computing", "video");
            medias[2] = new media(124124, "yolanda", 2015, "how to efficiently clean your house in under 5 minutes ", "interactive");
            
            arrayM[0] = medias[0];arrayM[1]=medias[1];arrayM[2]=medias[2];
            items[6]=medias[0];items[7]=medias[1];items[8]=medias[2];
            
            clients[0] = new client(40245600, "Adil", 514568500, "Adilconcordia.live@gmail.com");
            clients[1] = new client(12312455, "Austin", 514556778, "Austinconcordia.live@gmail.com");
            clients[2] = new client(123154452, "Caleb", 647889501, "Calebconcordia.live@gmail.com");
            
            arrayC[0]=clients[0];arrayC[1]=clients[1];arrayC[2]=clients[2];


            //iterating through a for loop to print out books
            for (book b : books) {
                System.out.println(b.toString());
            }
            //testing the equality of the books
            boolean booksareEqual = books[1].equals(books[2]);
            boolean bookareEqual2 = books[2].equals(books[0]);


            book biggestBook = getBiggestBook(books);

            System.out.println("displaying the biggestBook method");

            if (biggestBook != null) {
                System.out.println("the book with the most pages is " + biggestBook);
            } else {

                System.out.println("no books");
            }

            //testing equalities
            System.out.println("Are theses books equal? " + booksareEqual);
            System.out.println("Are theses books equal? " + bookareEqual2);

            System.out.println("testing equality of book and a different class...");

            boolean comparewithbooks = books[0].equals(medias[0]);

            System.out.println(comparewithbooks);


            //printing out the attributes of journals using for loop
            for (journal j : journals) {
                System.out.print(j.toString());
            }
            //testing the equality of journals
            boolean journalsareEqual = journals[0].equals(journals[2]);
            boolean journalareEqual2 = journals[1].equals(journals[0]);

            System.out.println("Are theses journals equal? " + journalsareEqual);
            System.out.println("Are theses journals equal? " + journalareEqual2);

            System.out.println("testing equality of journals and a different class...");

            boolean comparewithjournal = journals[1].equals(clients[2]);

            System.out.println(comparewithjournal);


            //printing out media using for loop
            for (media m : medias) {
                System.out.println(m.toString());
            }
            //testing out equality for media
            boolean mediaareEqual = medias[0].equals(medias[1]);
            boolean mediaareEqual2 = medias[1].equals(medias[2]);


            System.out.println("Are theses medias equal? " + mediaareEqual);
            System.out.print("Are theses medias equal? " + mediaareEqual2);


            System.out.println("displaying copyBooks method...");
            //deep copy
            media[] copiedMediaBooks = copyBooks(medias);

            // Verify the copied array
            for (media copiedMediaBook : copiedMediaBooks) {
                System.out.println(copiedMediaBook);
            }


            System.out.println("testing equality of medias and a different class...");

            boolean comparewithmedia = medias[2].equals(books[0]);

            System.out.println(comparewithmedia);


            //printing out the clients using the for loop previously implemented
            for (client c : clients) {

                System.out.println(c.toString());
            }

            boolean clientsareEqual = clients[0].equals(clients[1]);
            boolean clientsareEqual2 = clients[1].equals(clients[2]);

            System.out.println("are these clients equal? " + clientsareEqual);
            System.out.println("are these clients equal? " + clientsareEqual2);

            System.out.println("testing equality of clients and a different class....");

            boolean comparewithclients = clients[1].equals(medias[1]);

            System.out.println(comparewithclients);

        } 
            System.out.println("thank you for using funLibrary program have a good day!");

    }

    public static book getBiggestBook(book[] books) {

        if (books == null || books.length == 0) {
            return null;
        }

        //assume the first book is the biggest
        book biggestBook = books[0];

        //starting at 1 because we compare the rest of the the books inside the array and book[0] is assumed to be the biggest one
        for (int i = 1; i < books.length; i++) {
            //comparing the page number using the getters in class book
            if (books[i].getNumberofpages() > biggestBook.getNumberofpages()) {

                biggestBook = books[i];
            }
        }

        return biggestBook;


    }

    public static media[] copyBooks(media[] originalMedia) {
        if (originalMedia == null) {
            return null;
        }

        // Create a new array to store the copied media
        media[] copiedMediaBooks = new media[originalMedia.length];

        // Iterate through the original array and copy each media
        for (int i = 0; i < originalMedia.length; i++) {
            media originalMediaItem = originalMedia[i];
            // Create a new media object with the same attributes as the original media
            media copiedMediaItem = new media(originalMediaItem.getID(), originalMediaItem.getMediatype(), originalMediaItem.getYearofpublication(), originalMediaItem.getNameofauthor(), originalMediaItem.getName());
            copiedMediaBooks[i] = copiedMediaItem;
        }

        return copiedMediaBooks;
    }

//    int ID, String nameofauthor, int yearofpublication, String name, int numberofpages
    //methods for switch statement option
    public static void addItem() {
  	  Scanner input = new Scanner(System.in);

  	
    	System.out.println("what Item would you like to add (book, journal, media)");
    	String addItem = input.nextLine();
    	
    	//turns user input to lower case even if user inputs large keys
    	switch (addItem.toLowerCase()) {
    	
    	case "book":
    		
    		System.out.println("enter book details (ID, name of the author, year of publication, name , and number of pages)");
    		System.out.println("ID: ");
    		int addID = input.nextInt();
    		input.nextLine();
    		System.out.println("Author: ");
    		String addAuthor = input.next();
    		System.out.println("year of publication: ");
    		int AddYearOfPublication = input.nextInt();
    		System.out.println("name of the book: ");
    		String AddNameofBook = input.next();
    		System.out.println("Number of pages: ");
    		int AddNumberOfPages = input.nextInt();
    		
    		book newBook = new book(addID,addAuthor,AddYearOfPublication,AddNameofBook,AddNumberOfPages);
    		
    		//checks if array of books is empty and if it is then to add a new book
    		boolean addedbook= false;
    		for (int i =0; i< books.length; i++ ) {
    		  if (books[i] == null) {
    		        books[i] = newBook;
    		        System.out.println("Book added successfully.");
    		        addedbook = true;
    		        break;
    		  }
    		  
    		 
    		}
    		
    		if (!addedbook) {
    			System.out.println("not enough space in the array of books");
    		}
    		break;
    		
    	case "journal":
    		
    		System.out.println("enter journal details (ID, name of the author, year of publication, name of the journal, and journal volume number)");
    		System.out.println("ID: ");
    		int addJournalID = input.nextInt();
    		input.nextLine();
    		System.out.println("Author: ");
    		String addJournalAuthor = input.next();
    		System.out.println("year of publication: ");
    		int AddJournalYearOfPublication = input.nextInt();
    		System.out.println("name of the journal: ");
    		String AddJournalName = input.next();
    		System.out.println("Number of volumes: ");
    		String AddJournalVolumeNumber = input.next();
    		
    		//int ID, String nameofauthor, int yearofpublication, String name, String volumenumber
    		journal newJournal = new journal(addJournalID,addJournalAuthor,AddJournalYearOfPublication,AddJournalName,AddJournalVolumeNumber);
    		
    		boolean addedjournal= false;
    		for (int i =0; i< journals.length; i++ ) {
    		  if (journals[i] == null) {
    		        journals[i] = newJournal;
    		        System.out.println("Journal added successfully.");
    		        addedjournal = true;
    		        break;
    		  }
    		  
    		 
    		}
    		
    		if (!addedjournal) {
    			System.out.println("not enough space in the array of journals");
    		}
    		break;
    		
    		
    	case "media":
    		
    		System.out.println("enter media details (ID, name of the author, year of publication, name of the media, and type of media)");
    		System.out.println("ID: ");
    		int addMediaID = input.nextInt();
    		input.nextLine();
    		System.out.println("Author: ");
    		String addMediaAuthor = input.next();
    		System.out.println("year of publication: ");
    		int AddMediaYearOfPublication = input.nextInt();
    		System.out.println("name of the media: ");
    		String AddMediaName = input.next();
    		System.out.println("Media type: ");
    		String AddMediaType = input.next();
    		
    		//attributes of media
    		//int ID, String nameofauthor, int yearofpublication, String name,String mediatype
    		media newMedia = new media(addMediaID,addMediaAuthor,AddMediaYearOfPublication,AddMediaName,AddMediaType);
    		
    		boolean addedMedia= false;
    		for (int i =0; i< medias.length; i++ ) {
    		  if (medias[i] == null) {
    		        medias[i] = newMedia;
    		        System.out.println("Media added successfully.");
    		        addedMedia = true;
    		        break;
    		  }
    		  
    		 
    		}
    		
    		if (!addedMedia) {
    			System.out.println("not enough space in the array of medias");
    		}
    		break;
    		
    	default:
    		System.out.println("invalid choice please try again");
    		break;
    	
    	}
    	
    	
  	  }

    

    public static void deleteItem() {
    	
  	  Scanner input = new Scanner(System.in);
  
    	System.out.println("which item would you like to delete? (book, media, or jounal)");
    	String deletechoice = input.next();
    	
    	switch(deletechoice.toLowerCase()) {
    	
    	
    	case "book":
    		
    		System.out.println("Enter the ID of the book you wish to delete: ");
    		int DeleteBookID = input.nextInt();
    		
    		//iterate in the array of books and check if it is not empty and that the ID in the array of books matches with the ID that the user has inputed
    		for(int i =0; i<books.length;i++) {
    			if(books[i]!=null && books[i].getID() == DeleteBookID) {
    				books[i]=null;
    				System.out.println("book has been deleted succesfully");
    				break;
	
    			}
    			
    			else {
					System.out.println("no books with the ID inputed has been found");
					
				}
    			
    		}
    		
    		break;
	
    	case "journal":
    		
    		System.out.println("Enter the ID of the journal you wish to delete");
    		int DeleteJournalID = input.nextInt();
    		for(int i = 0; i<journals.length;i++) {
    			if(journals[i]!=null && journals[i].getID()==DeleteJournalID) {
    				journals[i]=null;
    				System.out.println("Journal has been deleted succesfully");
    				break;
    			}
    			
    			else {
    				System.out.println("No journal with the ID inputed has been found");
    				
    			}
    		}

    		break;
    	case "media":
    		
    		System.out.println("Enter the ID of the media you wish to delete");
    		int DeleteMediaID = input.nextInt();
    		
    		for(int i =0; i<medias.length;i++) {
    			if(medias[i]!=null&&medias[i].getID()==DeleteMediaID) {
    				medias[i]=null;
    				System.out.println("Media has been deleted succesfully");
    				break;
    			}
    			
    			else {
    				System.out.println("No medias with the ID inputed has been found");
    			}
    			
    		}
    		
    		break;
    		default:
    			System.out.println("invalid choice please try again");
    		break;
    	}
    		
    	

    }

    public static void changeInfo() {
    	
  	  Scanner input = new Scanner(System.in);
  	  
    	System.out.println("which item would you like to change it's information (book, media, or journal)");
    	String changeinformation = input.next();
    	
    	switch(changeinformation.toLowerCase()) {
    	
    	case "book":
    		System.out.println("Enter the ID of the book you wish to change: ");
    		int findbook = input.nextInt();
    		for(int i =0; i<books.length;i++) {
    			if(books[i].getID()==findbook) {
    				System.out.println("Book: "+books[i]);
    				System.out.println("what attribute of the book would you like to change (ID, name of the author, year of publication, name , and number of pages)");
    				String changeAttributes = input.next();
    				
    				switch(changeAttributes.toLowerCase()) {
    				case "ID":
    					System.out.println("Enter the new ID: ");
    					int ChangedID = input.nextInt();
    					
    					books[i].setID(ChangedID);
    					System.out.println("new ID has been succesfully changed ");
    					break;
    				
    				case "name of the author":
    					
    					System.out.println("Enter new name of the author: ");
    					String ChangedAuthorName = input.next();
    					
    					books[i].setNameofauthor(ChangedAuthorName);
    					
    					System.out.println("succesfully changed the name of the author");
    					break;
    					
    				case "year of publication":
    					
    					System.out.println("Enter the new year of publication: ");
    					int changedYearOfPublication = input.nextInt();
    					
    					books[i].setYearofpublication(changedYearOfPublication);
    					
    					System.out.println("succesfully changed the year of publication");

    					break;
    				case "name":
    					System.out.println("Enter the new name of the book: ");
    					String changedNameOfBook = input.next();
    					
    					books[i].setName(changedNameOfBook);
    					
    					System.out.println("succesfully changed the name of the book");

    					
    					break;
    				case "number of pages":
    					
    					System.out.println("Enter the new number of pages: ");
    					int changedNumberOfPages = input.nextInt();
    					
    					books[i].setNumberofpages(changedNumberOfPages);
    					
    					System.out.println("succesfully changed the number of pages");

    					break;
					default:
    						System.out.println("incorrect attribute try again");
    				}
    			}
    			else {
    				System.out.println("book not found");
    			}
    		}
    		break;
    		
    	case "journal":
    		
    		System.out.println("Enter the ID of the journal you wish to edit: ");
    		int findJournal = input.nextInt();
    		
    		for(int i = 0; i< journals.length;i++) {
    			
    			if (journals[i].getID()==findJournal) {
    				System.out.println("journal: "+journals[i]);
    				
    				System.out.println("What attribute in this journal would you like to change?(ID, name of the author, year of publication, name of the journal, and journal volume number) ");
    				String changeJournalAttribute = input.next();
    				
    				switch (changeJournalAttribute) {
    				
    				case "ID":
    					System.out.println("Enter the new ID of the book: ");
    					int ChangedJournalID = input.nextInt();
    					
    					journals[i].setID(ChangedJournalID);
    					
    					System.out.println("Succesfully changed Journal ID");
    					
    					break;
    				case "name of the author":
    					
    					System.out.println("Enter the changed name of the author: ");
    					String ChangedJournalAuthor = input.next();
    					
    					journals[i].setNameofauthor(ChangedJournalAuthor);
    					System.out.println("succesfully changed the name of the author");
    					
    					break;
    				case "year of publication":
    					
    					System.out.println("Enter the changed year of publication: ");
    					int ChangedYearOfPublicationJournal = input.nextInt();
    					journals[i].setYearofpublication(ChangedYearOfPublicationJournal);
    					
    					System.out.println("Succesfully changed the year of publication");
    					break;
    				case "name of the journal":
    					
    					System.out.println("Enter the new name of the journal: ");
    					String ChangedJournalName = input.next();
    					
    					journals[i].setName(ChangedJournalName);
    					
    					System.out.println("Succesfully changed the name of the journal");
    					break;
    				case "journal volume number":
    					
    					System.out.println("Enter the journal volume number: ");
    					String ChangedVolumeNumberJournal = input.nextLine();
    					
    					journals[i].setVolumenumber(ChangedVolumeNumberJournal);
    					
    					System.out.println("Succesfully changed the volume number of the journal");
    					break;
    					
    					default:
    						System.out.println("incorrect attribute please try again");
    				
    				}
    				
    				
    			}
    			
    			else {
    				System.out.println("no journal with this ID has been found");
    			}
    		}
    		break;
    	case "media":
    		
    		System.out.println("Enter the ID of the media you wish to change: ");
    		int findMedia = input.nextInt();
    		for (int i = 0; i< medias.length;i++) {
    			if (medias[i].getID()==findMedia) {
    				System.out.println("Media "+medias[i]);
    				
    				System.out.println("What attribute would you like to change? (ID, name of the author, year of publication, name of the media, and type of media) ");
    				String changedAttributesMedia = input.next();
    				
    				switch (changedAttributesMedia) {
    				
    				case "ID":
    					System.out.println("Enter the new ID of the Media: ");
    					int ChangedIdMedia = input.nextInt();
    					
    					medias[i].setID(ChangedIdMedia);
    					
    					System.out.println("succesfully updated the ID");
    	
    					break;
    					
    				case "name of the author":
    					
    					System.out.println("Enter the new name of the author: ");
    					String ChangedNameAuthorMedia = input.next();
    					
    					medias[i].setNameofauthor(ChangedNameAuthorMedia);
    					
    					System.out.println("Succesfully updated the name of the author");
    					break;
    					
    				case"year of publication":
    					
    					System.out.println("Enter the new year of publication: ");
    					int ChangedYearOfPulication = input.nextInt();
    					
    					medias[i].setYearofpublication(ChangedYearOfPulication);
    					
    					System.out.println("succesfully updated year of publication");
    					break;
    					
    				case "name of the media":
    					
    					System.out.println("Enter the new name of the media: ");
    					
    				
    					break;
    				case"type of media":
    					
    					System.out.println("Enter the new type of media: ");
    					String ChangedMediaType = input.next();
    					
    					medias[i].setMediatype(ChangedMediaType);
    					
    					System.out.println("Succesfully changed the type of media");
    					break;
    				}
    				
    			}
    			
    			else {
    				System.out.println("No media with this ID has been found");
    			}
    		}
    		break;
    		
    		default:
    			System.out.println("invalid input please try again later");
    	}

  	  
    }

    public static void listItems() {
    	  Scanner input = new Scanner(System.in);
    
    
    	    System.out.println("\nBooks:");
    	    for (int i = 0; i < books.length; i++) {
    	        if (books[i] != null) {
    	            System.out.println(books[i].toString());
    	        }
    	    }

    	    // Print all journals
    	    System.out.println("\nJournals:");
    	    for (int i = 0; i < journals.length; i++) {
    	        if (journals[i] != null) {
    	            System.out.println(journals[i].toString());
    	        }
    	    }

    	    // Print all medias
    	    System.out.println("\nMedias:");
    	    for (int i = 0; i < medias.length; i++) {
    	        if (medias[i] != null) {
    	            System.out.println(medias[i].toString());
    	        }
    	    }
    	  

    }

    public static void addClient() {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter client ID");
        int newID = input.nextInt();

        System.out.println("Enter client Name");
        String newCLientName = input.next();

        System.out.println("Enter client phonenumber");
        int newClientPhonenumber = input.nextInt();


        System.out.println("Enter client email address");
        String newClientEmailAddress = input.next();
        client newClient = new client(newID, newCLientName, newClientPhonenumber, newClientEmailAddress);

        for (int i =0; i<clients.length;i++) {
        	if(clients[i]==null) {
        		clients[i]=newClient;
                System.out.println("new client added with the following attributes: ");
                System.out.println(newClient);
                break;
        	}
        }

        
        
    }
    
   

    public static void editClient() {
        Scanner input = new Scanner(System.in);
        
       
       
        System.out.print("Enter the ID of the client that you wish to Edit");
        int editID = input.nextInt();

        boolean foundClient = false; //flag used to find where the client is found
        //checking for client ID
        for (int i = 0; i < clients.length; i++) {
//        	System.out.println("test "+i); debugging
            // First, check if the current element is not null
        	if (clients[i] != null && clients[i].getID()==editID) {
        		
        		System.out.println(foundClient);
        	    foundClient = true; //client found
        	    
        	    System.out.print("what client attribute would you like to change : ID, Client name, client phonenumber, or Client email? ");
                String clientChange = input.next();

        	    switch (clientChange.toLowerCase()) {
                case "id":
                    System.out.print("Enter new client ID: ");
                    int newClientID = input.nextInt();
                    clients[i].setID(newClientID); // Update the client's ID
                    System.out.println("Client ID updated successfully.");
                    break;
                case "client name":
                    System.out.print("Enter new client name: ");
                    input.nextLine(); 
                    String newName = input.nextLine();
                    clients[i].setNameClient(newName); // Update the client's name
                    System.out.println("Client name updated successfully.");
                    break;
                case "client phonenumber":
                    System.out.print("Enter new client phonenumber: ");
                    int newPhoneNumber = input.nextInt();
                    clients[i].setPhonenumber(newPhoneNumber); // Update the client's phone number
                    System.out.println("Client phone number updated successfully.");
                    break;
                case "client email":
                    System.out.print("Enter new client email: ");
                    input.nextLine();
                    String newEmail = input.nextLine();
                    clients[i].setEmailAddress(newEmail); // Update the client's email
                    System.out.println("Client email updated successfully.");
                    break;
                default:
                	
                    System.out.println("Invalid input, please try again.");
                    break;
            }
        	    break;
        	}
                    
                
            }
        

        // After the loop, check if a client was found
        if (!foundClient) {
        	//System.out.println(foundClient); //debuging
            System.out.println("Client with ID " + editID + " has not been found");
            return;
        }
 
       
        
    }

    public static void deleteClient() {
        Scanner input = new Scanner(System.in);
        

    	System.out.println("Enter the ID of the client you wish to delete: ");
    	int deleteClient = input.nextInt();
        
        boolean foundClient2 = false;

        //check if client that has indeed the same ID that the user has inputed
        
  
    	 for (int i =0; i< clients.length;i++) {
             if (clients[i]!=null&&clients[i].getID()==deleteClient) {
             	foundClient2 = true;
             	break;
         
             	}
             //shifts element to remove the client
          	for(int j = 0; j< clients.length-1;j++) {
         		clients[j] = clients [j+1];
             }

          	
          	System.out.println("clients with ID "+ deleteClient+ " has been deleted");
          	break;
         }
         
         if (!foundClient2) {
         	System.out.println("Client with ID "+ deleteClient + " has not been found please try again");
         	return;
         }
         
    

    }

    public static void LeaseItem() {
    	
    	Scanner input = new Scanner(System.in);
    	 System.out.println("Enter client ID:");
    	    int clientId = input.nextInt();
    	    input.nextLine(); // Consume newline

    	    System.out.println("Enter item ID to lease:");
    	    String itemId = input.nextLine();

    	    boolean clientFound = false;
    	    for (client c : clients) {
    	        if (c != null && c.getID() == clientId) {
    	            c.setLeasedItemId(itemId); // Lease the item to the client
    	            System.out.println("Item " + itemId + " leased to client " + clientId);
    	            clientFound = true;
    	            break;
    	        }
    	    }

    	    if (!clientFound) {
    	        System.out.println("Client with ID " + clientId + " not found.");
    	    }

    }

    public static void showAllItemsLeased() {
    	
    	System.out.println("Displaying all leased items:");
        boolean itemFound = false;
        
        for (client c : clients) {
            if (c != null && c.getLeasedItemId() != null) {
                // Assuming leasedItemId stores a unique identifier that can be used to find the item across all item types
                System.out.println("Client ID: " + c.getID() + " has leased item ID: " + c.getLeasedItemId());
                itemFound = true;
                // If you need to display more details about the item, you would add logic here to find the item in your items arrays and display its details
            }
        }
        
        if (!itemFound) {
            System.out.println("No items are currently leased.");
        }
    }

    public static void displayMenu() {

        System.out.println("---------------------------------------------------------");
        System.out.println("1.add an item ");
        System.out.println("2. Delete an item");
        System.out.println("3. Change information of an item");
        System.out.println("4. List all items in specific order (book, journal, or media)");
        System.out.println("5. Print all items ");
        System.out.println("6. Add a client");
        System.out.println("7. edit a client");
        System.out.println("8. delete a client");
        System.out.println("9. lease an item from a client and return an item from a client");
        System.out.println("10. Show all items leased by a client");
        System.out.println("11. Show all leased Items (by all clients)");
        System.out.println("---------------------------------------------------------");


    }


}
