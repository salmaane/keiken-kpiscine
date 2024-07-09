package com.keiken;

import com.keiken.entity.Book;
import com.keiken.entity.Librarian;
import com.keiken.entity.Member;
import com.keiken.entity.Reservation;
import com.keiken.service.BookService;
import com.keiken.service.LibrarianService;
import com.keiken.service.MemberService;
import com.keiken.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class DataInit implements CommandLineRunner {

    @Autowired
    private LibrarianService librarianService;

    @Autowired
    private BookService bookService;

    @Autowired
    private MemberService memberService;

    @Autowired
    private ReservationService reservationService;

    @Override
    public void run(String... args) throws Exception {
        // Create Librarian
        Librarian librarian = new Librarian();
        librarian.setLibrarianId("L1");
        librarian.setName("John Doe");
        librarianService.addLibrarian(librarian);

        // Create Book
        Book book = new Book();
        book.setBookId("B1");
        book.setTitle("Spring Boot in Action");
        book.setAuthor("Craig Walls");
        book.setISBN("978-1617292545");
        book.setAvailable(true);
        book.setLibrarian(librarian);
        bookService.addBook(book);

        // Create Member
        Member member = new Member();
        member.setMemberId("M1");
        member.setName("Jane Smith");
        member.setEmail("jane.smith@example.com");
        member.setLibrarian(librarian);
        memberService.addMember(member);

        // Create Reservation
        Reservation reservation = new Reservation();
        reservation.setTransactionId("R1");
        reservation.setIssueDate(new Date());
        reservation.setReturnDate(new Date(System.currentTimeMillis() + (1000 * 60 * 60 * 24 * 7))); // 1 week later
        reservation.setMember(member);
        reservation.setBook(book);
        reservationService.addReservation(reservation);

        System.out.println("Data initialization complete.");
    }
}