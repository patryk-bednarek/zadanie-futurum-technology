package com.campaign.shop.repository;

import com.campaign.shop.model.Campaign;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface CampaignRepository extends JpaRepository<Campaign, Long> {

    //List<Campaign> findCampaignByName(String productName);
    Optional<Campaign> findCampaignById(Long id);
    void deleteCampaignById(Long id);
}
