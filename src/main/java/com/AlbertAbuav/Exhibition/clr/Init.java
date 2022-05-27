package com.AlbertAbuav.Exhibition.clr;

import com.AlbertAbuav.Exhibition.beans.Booth;
import com.AlbertAbuav.Exhibition.beans.BoothType;
import com.AlbertAbuav.Exhibition.beans.Company;
import com.AlbertAbuav.Exhibition.beans.Credit;
import com.AlbertAbuav.Exhibition.repositories.BoothRepository;
import com.AlbertAbuav.Exhibition.repositories.CompanyRepository;
import com.AlbertAbuav.Exhibition.utils.UtilsArt;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
@RequiredArgsConstructor
public class Init implements CommandLineRunner {


    private final BoothRepository boothRepository;
    private final CompanyRepository companyRepository;

    @Override
    public void run(String... args) throws Exception {

        System.out.println();
        System.out.println(UtilsArt.INIT);
        System.out.println("==================================================================================");

        Booth b1 = Booth.builder()
                .type(BoothType.REGULAR)
                .wallsDescription("2 walls")
                .number(1)
                .build();

        Booth b2 = Booth.builder()
                .type(BoothType.SILVER)
                .wallsDescription("3 walls")
                .number(2)
                .build();

//        boothRepository.save(b1);
//        boothRepository.save(b2);
//
//        Company c1 = Company.builder()
//                .cashFlow(1500.5f)
//                .credit(Credit.VISA)
//                .name("Coca-Cola")
//                .booth(boothRepository.getReferenceById(1))
//                .booth(boothRepository.getReferenceById(2))
//                .build();

        Company c1 = Company.builder()
                .cashFlow(1500.5f)
                .credit(Credit.VISA)
                .name("Coca-Cola")
                .booth(b1)
                .booth(b2)
                .build();

        companyRepository.save(c1);
        companyRepository.findAll().forEach(System.out::println);

    }

}
