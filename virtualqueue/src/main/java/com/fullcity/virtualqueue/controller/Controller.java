package com.fullcity.virtualqueue.controller;

import com.fullcity.virtualqueue.data.ReservationDAO;
import com.fullcity.virtualqueue.model.Account;
import com.fullcity.virtualqueue.model.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.sql.DataSource;
import java.util.List;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    DataSource ds;

    @Autowired
    ReservationDAO reservationDAO;

    @GetMapping("/")
    public String dashboard(Model model){
        Account account = new Account();
        account.setAccountId(1L);
        List<Reservation> result = reservationDAO.getAllReservationsByAccount(account);
        model.addAttribute("reservations", result);
        return "home";
    }

    @GetMapping("/notify")
    public String notifyReservation(){
        final String ACCOUNT_SID = System.getenv("ACCOUNT_SID");
        final String AUTH_TOKEN = System.getenv("AUTH_TOKEN");
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(
                new com.twilio.type.PhoneNumber("+16145808483"),
                new com.twilio.type.PhoneNumber("+12013796440"),
                "You may enter the store now")
                .create();

        System.out.println(message.getSid());
        return "redirect:/";
    }


}
