package com.campaign.shop.controllers;

import com.campaign.shop.repository.CampaignRepository;
import com.campaign.shop.model.Campaign;
import com.campaign.shop.service.CampaignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@CrossOrigin(origins = "http://localhost:8081")
@RequestMapping("/api")
public class CampaignController {

    private final CampaignService campaignService;

    public CampaignController(CampaignService campaignService) {
        this.campaignService = campaignService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Campaign>> getAllCampaigns() {
        List<Campaign> campaigns = campaignService.findAllCampaigns();
        return new ResponseEntity<>(campaigns, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Campaign> getCampaignById(@PathVariable("id") Long id) {
        Campaign campaign = campaignService.findCampaignById(id);
        return new ResponseEntity<>(campaign, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Campaign> addCampaign(@RequestBody Campaign campaign) {
        Campaign newCampaign = campaignService.addCampaign(campaign);
        return new ResponseEntity<>(campaign, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Campaign> updateCampaign(@RequestBody Campaign campaign) {
        Campaign updateCampaign = campaignService.updateCampaign(campaign);
        return new ResponseEntity<>(updateCampaign, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteCampaign(@PathVariable("id") Long id) {
        campaignService.deleteCampaign(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


//    @Autowired
//    CampaignRepository campaignRepository;
//
//    @GetMapping("/campaigns")
//    public List<Campaign> getCampaign() {
//        return (List<Campaign>) campaignRepository.findAll();
//    }
//
//    @PostMapping("/campaigns")
//    void addCampaign(@RequestBody Campaign campaign) {
//        campaignRepository.save(campaign);
//    }

}
