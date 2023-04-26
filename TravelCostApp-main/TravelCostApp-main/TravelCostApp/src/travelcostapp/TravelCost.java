package travelcostapp;

public class TravelCost {
    
    private double MtoDrive;
    private double MperG;
    private double GasPrice;
    private double ParkingCost;
    private double TollCost;
    private double TotalCost;

    public TravelCost(double MtoDrive, double MperG, double GasPrice, double ParkingCost, double TollCost) {
        this.MtoDrive = MtoDrive;
        this.MperG = MperG;
        this.GasPrice = GasPrice;
        this.ParkingCost = ParkingCost;
        this.TollCost = TollCost;
    } 
    
    public void CalCost(){
       TotalCost = ((MtoDrive/MperG)*GasPrice)+ ParkingCost + TollCost; 
    }

    public double getTotalCost() {
        return TotalCost;
    }
    
     
    
}
