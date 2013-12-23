package isp;

import java.util.ArrayList;

public class VehicleRegister {
        private ArrayList<Vehicle>vehicleArrayList;
        
        //Constructor
        public VehicleRegister(){
                vehicleArrayList = new ArrayList<Vehicle>();
        }
        
        //add vehicle to arraylist
        public void addVehicle(Vehicle newVehicle){
                vehicleArrayList.add(newVehicle);
        }
        
        //find vehicle in arraylist
        public Vehicle findVehicle(String vRegNrFind){
                for(Vehicle tmpVehicle:vehicleArrayList){
                        if(tmpVehicle.getVRegNr().equals(vRegNrFind)){
                                return tmpVehicle;
                        }
                }
                 return null;
        }
        
        // delete vehicle from arraylist
        public void removeVehicle(String vRegNrRemove){
                Vehicle tmpVehicle = null;
                int i = 0;
                boolean found = false;
        
                while (i<vehicleArrayList.size()&& !found){
                        tmpVehicle = vehicleArrayList.get(i);
                        if(tmpVehicle.getVRegNr().equals(vRegNrRemove)){
                                vehicleArrayList.remove(i);
                                found = true;
                        }
                        
                        i++;
                }
        }
        
        // update vehicle price
        public void setVehiclePrice(String vRegNr, String newVPrice){
                Vehicle vehicle = findVehicle(vRegNr);
                if(vehicle !=null){
                        vehicle.setVPrice(newVPrice);
                }
        }
        
        //update vehicle drivers license
        public void setVehicleDriversLicense(String vRegNr, String newVDriveLic){
                Vehicle vehicle = findVehicle(vRegNr);
                if(vehicle !=null){
                        vehicle.setVDriveLic(newVDriveLic);
                }
        }
        
        //update vehicle model
        public void setVehicleModel(String vRegNr, String newVModel){
                Vehicle vehicle = findVehicle(vRegNr);
                if(vehicle !=null){
                        vehicle.setVModel(newVModel);
                }
        }
        
        //update vehicle type
        public void setVehicleType(String vRegNr, String newVType){
                Vehicle vehicle = findVehicle(vRegNr);
                if(vehicle != null){
                        vehicle.setVType(newVType);
                }
        }
        
        //update vehicle date 
        public void setVehicleDate(String vRegNr, String newVDate){
                Vehicle vehicle = findVehicle(vRegNr);
                if(vehicle != null){
                        vehicle.setVDate(newVDate);
                }
        }
}