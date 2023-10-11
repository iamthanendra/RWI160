//write a Library management program to find the availability of a particular book using encapsulation

class BookDetails
{
     protected int bookId;
     protected String bookName, bookAuthor, publishDate, edition;
     protected int numberOfAvailableBooks = 0; // Early Initialization
    
    //Default Constructor
    BookDetails(){}
    
    BookDetails(int bookId, String bookName, String bookAuthor, String publishDate, String edition, int numberOfAvailableBooks)
    {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.publishDate = publishDate;
        this.edition = edition;
        if (numberOfAvailableBooks > 0)
            this.numberOfAvailableBooks = numberOfAvailableBooks;
    }
}

class Transaction extends BookDetails
{
    void purchaseBook(int quantity, BookDetails obj)
    {
        if (quantity < 0) return;
        if (obj.numberOfAvailableBooks - quantity < 0) return;
        
        obj.numberOfAvailableBooks -= quantity;
    }
    
    int checkBookAvaiability(BookDetails obj)
    {
        return obj.numberOfAvailableBooks;
    }
}

class Test
{
    public static void main(String[] args)  
    {
        BookDetails spirit = new BookDetails(1, "Spirit", "Thanendra", "09-09-2023", "1st", 100);
    
        Transaction tran = new Transaction();
        System.out.println("No of sprit book : "+tran.checkBookAvaiability(spirit));
        System.out.println("purchasing 10 books" );
        tran.purchaseBook(10, spirit);
        System.out.println("No of sprit book : "+tran.checkBookAvaiability(spirit));

        BookDetails maven = new BookDetails(1, "maven", "koi hoga", "09-09-2023", "1st", 70);
        System.out.println("No of maven book : "+tran.checkBookAvaiability(maven));
        System.out.println("purchasing 60 books");
        tran.purchaseBook(60, maven);
        System.out.println("No of maven book : "+tran.checkBookAvaiability(maven));
	
    }
}
