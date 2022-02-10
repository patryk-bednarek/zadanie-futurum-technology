package com.campaign.shop.service;

import com.campaign.shop.exception.CampaignNotFoundException;
import com.campaign.shop.model.Campaign;
import com.campaign.shop.repository.CampaignRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;

@Service
public class CampaignService {
    private final CampaignRepository campaignRepository;

    @Autowired
    public CampaignService(CampaignRepository campaignRepository) {
        this.campaignRepository = campaignRepository;
    }

    public Campaign addCampaign(Campaign campaign) {
        return campaignRepository.save(campaign);
    }

    public List<Campaign> findAllCampaigns() {
        return campaignRepository.findAll();
    }

    public Campaign updateCampaign(Campaign campaign) {
        return campaignRepository.save(campaign);
    }

    public Campaign findCampaignById(Long id) {
        return campaignRepository.findCampaignById(id)
                .orElseThrow(() -> new CampaignNotFoundException("Campaign by id " + " was not found"));
    }

    public void deleteCampaign(Long id) {
        campaignRepository.deleteCampaignById(id);
    }
}
