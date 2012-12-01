package controller;

import models.Listing;
import models.ListingDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class AllListingsController {
    @Autowired
    @Qualifier("listingDAO")
    private ListingDAO dao;

    @RequestMapping(value="/listings", method = RequestMethod.GET)
    public String showAllListings(@ModelAttribute("model") ModelMap modelMap){
        List<Listing> allListings = dao.fetchAll();

        modelMap.addAttribute("allListings", allListings);

        return "listings";
    }

    public void setDao(ListingDAO dao) {
        this.dao = dao;
    }
}
