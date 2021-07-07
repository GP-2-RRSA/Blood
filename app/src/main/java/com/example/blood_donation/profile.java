package com.example.blood_donation;

public class profile {

    String donorName;
    String donorID;
    String donorPhoneNum;
    String donorBloodType;
    String lastBloodDonationDate;
    String lastPlateletsDonationDate;

   public profile(String donorID, String donorName, String donorPhoneNum,String donorBloodType) {
      this.donorID = donorID;
      this.donorName = donorName;
      this.donorPhoneNum = donorPhoneNum;
      this.donorBloodType = donorBloodType;
   }

   public void setDonorBloodType(String donorBloodType) {
      this.donorBloodType = donorBloodType;
   }

   public void setDonorID(String donorID) {
      this.donorID = donorID;
   }

   public void setDonorName(String donorName) {
      this.donorName = donorName;
   }

   public void setDonorPhoneNum(String donorPhoneNum) {
      this.donorPhoneNum = donorPhoneNum;
   }

   public String getDonorBloodType() {
      return donorBloodType;
   }

   public String getDonorID() {
      return donorID;
   }

   public String getDonorName() {
      return donorName;
   }

   public String getDonorPhoneNum() {
      return donorPhoneNum;
   }
}
