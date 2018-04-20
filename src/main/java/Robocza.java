import java.util.*;
import java.lang.*;
import java.io.*;

class ComputerScienceInHighSchool
{
    public static int indexOfTheLowestGrade(ArrayList<Integer> grades) {
        int smallestGrade = Integer.MAX_VALUE;
        int index = Integer.MIN_VALUE;

        for (int i = 0; i < grades.size(); i++) {
            if (smallestGrade >= grades.get(i)) {
                smallestGrade = grades.get(i);
                index = i;
            }
        }
        return index;
    }

    public static int indexOfTheHighestGrade(ArrayList<Integer> grades) {
        return 5;
    }
}


class Book {

    private String title;
    private int year;

    public Book(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public int getYear(){
        return year;
    }

    public String getTitle(){
        return title;
    }

    @Override
    public String toString(){
        return "Ksiazka pod tytulem: " + title + " zostala wydana w roku " + year;
    }
}


class Application {
    public static void main(String[] args) throws java.lang.Exception {

        double suma = 0;

        ArrayList<Integer> grades = new ArrayList<>(Arrays.asList(3, 4, 4, 5, 2, 1, 4, 5, 3, 3, 3, 5, 4, 2));


        grades.remove(ComputerScienceInHighSchool.indexOfTheLowestGrade(grades));
        grades.remove(ComputerScienceInHighSchool.indexOfTheHighestGrade(grades));

        for(int i=0; i < grades.size(); i++){
            suma+=grades.get(i);
        };

        double srednia = suma/grades.size();
        System.out.println(srednia);



        Book book1 = new Book("Ogniem I Mieczem", 2015);
        Book book2 = new Book("Drżenie", 2007);
        Book book3 = new Book("Nocny Lot", 1987);
        Book book4 = new Book("Inni", 1994);

        LinkedList<Book> listOfBooks = new LinkedList<Book>();
        listOfBooks.add(book1);
        listOfBooks.add(book2);
        listOfBooks.add(book3);
        listOfBooks.add(book4);


        for (Book bookModel : listOfBooks) {
            if (bookModel.getYear() <= 2000) {
                System.out.println(bookModel);

            }
        }
    }
}













