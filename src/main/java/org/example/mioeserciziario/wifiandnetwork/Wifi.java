package org.example.mioeserciziario.wifiandnetwork;


import java.util.ArrayList;
import java.util.List;

public class Wifi {

    List<Network> listNetwork;
    public Wifi() {
        listNetwork= new ArrayList<Network>();
    }

    public Network addNetwork(String SSID, double intSegnale){
        Network network= new Network(SSID,intSegnale);
        listNetwork.add(network);
        return network;
    }

    public Network strongest(){
        if(listNetwork.size()==0){
            System.out.println("l'oggetto Wifi non ha reti!");
        }else{
            Network retN=listNetwork.get(0);
            double intS=Math.abs(retN.getIntSegnale()),newIntS;
            for (Network n : listNetwork){
                newIntS=Math.abs(n.getIntSegnale());
                if (newIntS<intS){
                    retN=n;
                    intS=newIntS;
                }
            }
            return retN;
        }
        return null;
    }

    public class Network{
        private String SSID;
        private double intSegnale;


        private Network(String SSID, double intSegnale) {
            this.SSID = SSID;
            this.intSegnale = intSegnale;
        }

        public void updateStrenght(double intS){
            intSegnale=intS;
        }

        public double getIntSegnale() {
            return intSegnale;
        }

        @Override
        public String toString(){
            return SSID+" "+intSegnale;
        }
    }


}
