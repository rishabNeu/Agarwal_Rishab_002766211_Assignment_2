/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Rishab
 */
public class CommunityHistory {
    
    
       private ArrayList<Community> communityHistory;

    public CommunityHistory() {
        this.communityHistory = new ArrayList<>();
    }

    
       public ArrayList<Community> getCommunityDetails() {
        return communityHistory;
    }
    

    public Community addCommunity()
    {
         Community community = new Community();
        communityHistory.add(community);

        return community;

    }

    
      public void deleteCommunity(Community selectedCommunity) {

        communityHistory.remove(selectedCommunity);

    }

    
}

