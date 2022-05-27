package com.AlbertAbuav.Exhibition.clr;

import com.AlbertAbuav.Exhibition.beans.Booth;
import com.AlbertAbuav.Exhibition.beans.BoothType;
import com.AlbertAbuav.Exhibition.beans.Company;
import com.AlbertAbuav.Exhibition.beans.Credit;
import com.AlbertAbuav.Exhibition.services.BoothService;
import com.AlbertAbuav.Exhibition.services.CompanyService;
import com.AlbertAbuav.Exhibition.utils.UtilsArt;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
@RequiredArgsConstructor
public class UseCaseService implements CommandLineRunner {

    private final CompanyService companyService;
    private final BoothService boothService;

    @Override
    public void run(String... args) throws Exception {

        System.out.println();
        System.out.println(UtilsArt.USE_CASE_SERVICE);
        System.out.println();

        Booth b3 = Booth.builder()
                .type(BoothType.SILVER)
                .wallsDescription("3 walls")
                .number(3)
                .build();

        Booth b4 = Booth.builder()
                .type(BoothType.GOLD_VIP)
                .wallsDescription("1 wall")
                .number(4)
                .build();

        Booth b5 = Booth.builder()
                .type(BoothType.REGULAR)
                .wallsDescription("2 walls")
                .number(5)
                .build();

        Booth b6 = Booth.builder()
                .type(BoothType.GOLD_VIP)
                .wallsDescription("3 wall")
                .number(6)
                .build();

        Company c2 = Company.builder()
                .cashFlow(1500.5f)
                .credit(Credit.VISA)
                .name("Coca-Cola")
                .booth(b3)
                .booth(b4)
                .build();

        Company c3 = Company.builder()
                .cashFlow(1200.5f)
                .credit(Credit.AMERICAN_EXPRESS)
                .name("Pepsi")
                .booth(b5)
                .booth(b6)
                .build();

        companyService.addCompany(c2);
        companyService.addCompany(c3);

        System.out.println("------------------ Getting all Companies from the DB --------");
        companyService.getAllCompanies().forEach(System.out::println);

        System.out.println("------------------ Getting single Company number 2 --------");
        System.out.println(companyService.getSingleCompany(2));

        System.out.println("------------------ Deleting Company number 2 --------");
        companyService.deleteCompany(2);

        System.out.println("------------------ Getting all Companies from the DB --------");
        companyService.getAllCompanies().forEach(System.out::println);



    }
}
