package cn.wyx.service.impl;

import cn.wyx.entity.InfoOfFlight;
import cn.wyx.entity.InfoOfTickets;
import cn.wyx.mapper.InfoOfFlightMapper;
import cn.wyx.mapper.InfoOfTicketsMapper;
import cn.wyx.service.InfoOfFlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

/**
 * @Author: czt
 * @Date: 2019/7/3 21:27
 * @Version 1.0
 */
@Service
public class InfoOfFlightServiceIml implements InfoOfFlightService {

    @Autowired
    private InfoOfFlightMapper infoOfFlightMapper;
    @Autowired
    private InfoOfTicketsMapper infoOfTicketsMapper;

    @Override
    public List<InfoOfFlight> findAll() {
        return null;
    }

    @Override
    public InfoOfFlight findById(Long id) {
        return null;
    }

    @Override
    public InfoOfFlight findById(String id) {
        return null;
    }

    @Override
    public void create(InfoOfFlight infoOfFlight) {

    }

    @Override
    public void update(InfoOfFlight infoOfFlight) {

    }

    @Override
    public void delete(Long... ids) {

    }

    @Override
    public void delete(String... ids) {

    }

    /**
     * 航班订票查询
     * @param cityStartName
     * @param cityEndName
     * @param date
     * @return
     */
    @Override
    public List<InfoOfFlight> findFlightByCityDate(String cityStartName, String cityEndName, Date date) {
        return this.infoOfFlightMapper.findByCityDate(cityStartName, cityEndName, date);
    }

    /**
     * 航班订票查询
     * @param flightId
     * @param flightsId
     * @param date
     * @return
     */
    @Override
    public List<InfoOfFlight> findFlightByFlightIdFlightsIdDate(String flightId, String flightsId, Date date) {
        return this.infoOfFlightMapper.findByFlightIdFlightsId(flightId,flightsId,date);
    }

    /**
     *通过售票Id 或 执飞航班号 或 航舱号 查询所有售票信息
     * @param ticketsId
     * @param flightId
     * @param spaceId
     * @return
     */
    @Override
    public List<InfoOfTickets> findInfoOfTickets(String ticketsId, String flightId, String spaceId) {
        return this.infoOfTicketsMapper.findInfoOfTickets(ticketsId,flightId,spaceId);
    }
}
