package isp;

public class Vehicle {
        private String vRegNr;
        private String vPrice;
        private String vDriveLic;
        private String vModel;
        private String vType;
        private String vDate;
        
        public Vehicle(String newVRegNr, String newVPrice, String newVDriveLic, String newVModel, String newVType, String newVDate){
                setVRegNr(newVRegNr);
                setVPrice(newVPrice);
                setVDriveLic(newVDriveLic);
                setVModel(newVModel);
                setVType(newVType);
                setVDate(newVDate);
                
        } // end public Vehicle
        
        public void setVRegNr(String vRegNr){
                this.vRegNr = vRegNr;
        }
        
        public String getVRegNr(){
                return vRegNr;
        }
        
        public void setVPrice(String vPrice){
                this.vPrice = vPrice;
        }
        
        public String getVPrice(){
                return vPrice;
        }
        
        public void setVDriveLic(String vDriveLic){
                this.vDriveLic = vDriveLic;
        }
        
        public String getVDriveLic(){
                return vDriveLic;                
        }
        
        public void setVModel(String vModel){
                this.vModel = vModel;
        }
        
        public String getVModel(){
                return vModel;
        }
        
        public void setVType(String vType){
                this.vType = vType;
        }
        
        public String getVType(){
                return vType;
        }
        
        public void setVDate(String vDate){
                this.vDate = vDate;
        }
        
        public String getVDate(){
                return vDate;
        }

}
