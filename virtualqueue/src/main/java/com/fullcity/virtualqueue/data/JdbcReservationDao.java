package com.fullcity.virtualqueue.data;

import com.fullcity.virtualqueue.model.Account;
import com.fullcity.virtualqueue.model.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcReservationDao implements ReservationDAO{

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public JdbcReservationDao(DataSource ds){
        this.jdbcTemplate = new JdbcTemplate(ds);
    }

    @Override
    public Reservation createReservation(Reservation reservation) {
        return null;
    }

    @Override
    public Reservation updateReservation(Reservation reservation) {
        return null;
    }

    @Override
    public List<Reservation> getAllReservationsByAccount(Account account) {
        List<Reservation> allReservation = new ArrayList<>();
        String sqlGetAllReservations = "SELECT * from accounts_users " +
                "WHERE account_id = ? AND status = true ORDER BY check_in_time";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sqlGetAllReservations, account.getAccountId());

        while(results.next()){
            Reservation res = new Reservation();
            res.setAccountId(results.getLong("account_id"));
            res.setUserId(results.getLong("user_id"));
            res.setStatus(results.getBoolean("status"));
            res.setCheckInTime(results.getString("check_in_time"));
            allReservation.add(res);
        }
        return allReservation;
    }
}
