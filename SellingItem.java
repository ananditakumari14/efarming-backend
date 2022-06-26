package com.wipro.velocity.efarming.module;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class SellingItem {
		@Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	    private Long id;
		
		private Long farmerId;
		
		private String cropType;
		
	    private String cropName;
	    
		private String fertilizerType;
		
		private String quantity;
		
		private String soilPhCertificate;
		
		private Long bidderid;
		
		private String bidAmount;
		
		private String status;

		public SellingItem(Long farmerId, String cropType, String cropName, String fertilizerType, String quantity,
				String soilPhCertificate, Long bidderid, String bidAmount, String status) {
			this.farmerId = farmerId;
			this.cropType = cropType;
			this.cropName = cropName;
			this.fertilizerType = fertilizerType;
			this.quantity = quantity;
			this.soilPhCertificate = soilPhCertificate;
			this.bidderid = bidderid;
			this.bidAmount = bidAmount;
			this.status = status;
		}

		public SellingItem() {
			// TODO Auto-generated constructor stub
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Long getFarmerId() {
			return farmerId;
		}

		public void setFarmerId(Long farmerId) {
			this.farmerId = farmerId;
		}

		public String getCropType() {
			return cropType;
		}

		public void setCropType(String cropType) {
			this.cropType = cropType;
		}

		public String getCropName() {
			return cropName;
		}

		public void setCropName(String cropName) {
			this.cropName = cropName;
		}

		public String getFertilizerType() {
			return fertilizerType;
		}

		public void setFertilizerType(String fertilizerType) {
			this.fertilizerType = fertilizerType;
		}

		public String getQuantity() {
			return quantity;
		}

		public void setQuantity(String quantity) {
			this.quantity = quantity;
		}

		public String getSoilPhCertificate() {
			return soilPhCertificate;
		}

		public void setSoilPhCertificate(String soilPhCertificate) {
			this.soilPhCertificate = soilPhCertificate;
		}

		public Long getBidderid() {
			return bidderid;
		}

		public void setBidderid(Long bidderid) {
			this.bidderid = bidderid;
		}

		public String getBidAmount() {
			return bidAmount;
		}

		public void setBidAmount(String bidAmount) {
			this.bidAmount = bidAmount;
		}
		
		public String getStatus() {
			return status;
		}
		
		public void setStatus(String status) {
			this.status = status;
		}


}


