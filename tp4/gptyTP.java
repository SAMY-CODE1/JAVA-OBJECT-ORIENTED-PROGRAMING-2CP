package tp4;

public class gptyTP {
    public static class Author {
        String name;
        String nationality;
        String[] bookWritten;
        

        public Author(String name,
                String nationality,
                String[] bookWritten) {
            this.bookWritten = bookWritten;
            this.name = name;
            this.nationality = nationality;
        }

        public void getInfo() {
            System.out.println("Author Name: " + name);
            System.out.println("Nationality: " + nationality);
            System.out.println("Books Written: " + bookWritten);

        }
    }

    public static class Book {
        String name;
        int isBn;
        Author author;
        boolean isValible;

        public Book(String name,
                int isBn,
                Author author,
                boolean isValible) {
            this.author = author;
            this.isBn = isBn;
            this.isValible = isValible;
            this.name = name;
        }

        public void borrow_book() {
            isValible = false;
        }

        public void retun_book() {
            isValible = true;
        }

        public void desplay_Info() {
            System.out.println("the name of teh book is : " + name);
            System.out.println("the author of the book is : " + author);
            System.out.println("the book number is : " + isBn);
            if (isValible == true) {
                System.out.println("the book is valiable");
            } else {
                System.out.println("the book is not valiable");
            }
        }
    }

    public static class Member {
        String name;
        String id;
        Book[] borrowedBooks;
        int borrowCont;
        int maxbook;

        public Member(String name,
                String id,
                int maxbook) {
            this.maxbook = maxbook;
            this.borrowedBooks = new Book[maxbook];
            this.id = id;
            this.name = name;
            this.borrowCont = 0;

        }

        public void displayMemberInfo() {
            System.out.println("the  name of the member is  : " + name);
            System.out.println(" her id is : " + id);
            System.out.println("her birrowedbooks: ");
            for (int i = 0; i < borrowedBooks.length; i++) {
                System.out.println("book " + i + ":" + borrowedBooks[i].name);
            }
        }

        public void borrowBook(Book book) {
            if (book.isValible) {
                if (borrowCont < maxbook) {
                    borrowedBooks[borrowCont] = book;
                    borrowCont++;
                    book.isValible = false;
                    System.out.println(name + "succesfuly borrowed" + book.name);
                    ;
                }
                else{
                    System.out.println("stop borrowing ");
                }
            } else {
                System.out.println("this book is not valiable");
            }
        }

        public void retun_book(Book book) {
            for (int i = 0; i < borrowCont; i++) {
                if (borrowedBooks[i] != null && borrowedBooks[i].name.equals(book.name)) {
                    System.out.println(name + " returned " + borrowedBooks[i].name);
                    borrowedBooks[i].isValible = true;
                    for (int j = i; j < borrowCont - 1; i++) {
                        borrowedBooks[j] = borrowedBooks[j + 1];
                    }
                    borrowedBooks[borrowCont - 1] = null;
                    borrowCont--;
                    break;

                }

            }

        }
    }

    public static void main(String[] args) {
        Author a1 = new Author("Goustafu", "usa", new String[] { "apocalips", "yamosoukri" });
        Book b1 = new Book("apocalips", 1234, a1, true);
        Book b2 = new Book("yamosoukri", 1235, a1, true);

        Member m1 = new Member("Sam", "001", 5);
        

        m1.borrowBook(b1);
        m1.retun_book(b1);
        m1.borrowBook(b2);
        m1.retun_book(b2);

        m1.displayMemberInfo();

    }
}
