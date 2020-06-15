package com.homework.nix.bookstore.data.listener;

import com.homework.nix.bookstore.data.entity.Book;

import javax.persistence.PostLoad;
import javax.persistence.PostPersist;
import javax.persistence.PostUpdate;

public final class ISBNGenerationListener {


    @PostLoad
    @PostPersist
    @PostUpdate
    public void makeISBN(Book book)
    {
        String laendercode;
        String bandnr;
        String verlagsnr;
        String checksum;

        double L1 = Math.random()*(10);
        double L2 = Math.random()*(10);

        double B1 = Math.random()*(10);
        double B2 = Math.random()*(10);
        double B3 = Math.random()*(10);

        double V1 = Math.random()*(10);
        double V2 = Math.random()*(10);

        if((int)L1 == 0 && (int)L2 == 0) {
            L2++;
        }
        if((int)B1 == 0) {
            B1++;
        }
        if((int)V1 == 0 && (int)V2 == 0) {
            V2++;
        }
        double C = (hashOp((int)L1) +L2 + hashOp((int)B1) +B2 + hashOp((int)B3) +V1 + hashOp((int)V2))%10;

        laendercode = (int)L1 + "" + (int)L2;
        bandnr = (int)B1+"" + (int)B2 + "" + (int)B3;
        verlagsnr = (int)V1 + "" + (int)V2;
        checksum = (int)C + "";

        String isbn = laendercode + "-" + bandnr + "-" + verlagsnr + "-" + checksum;

        book.setIsbn(isbn);
    }

    public static int hashOp(int i)
    {
        int doubled = 2 * i;
        if ( doubled >= 10 ) {
            doubled = doubled - 9;
        }
        return doubled;
    }
}
