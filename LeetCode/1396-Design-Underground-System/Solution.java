class UndergroundSystem {
    HashMap<Integer,Details> map1;
    HashMap<String,Double[]> map2;
    public UndergroundSystem() {
        map1 = new HashMap<Integer,Details>();
        map2 = new HashMap<String,Double[]>();
    }
    
    public void checkIn(int id, String stationName, int t) {
        Details obj = new Details();
        obj.setSS(stationName);
        obj.setST(t);
        map1.put(id,obj);
    }
    
    public void checkOut(int id, String stationName, int t) {
        Details obj = map1.get(id);
        obj.setES(stationName);
        obj.setET(t);
        int tDiff = obj.getET() - obj.getST();
        String stationPair = (obj.getSS()).concat(obj.getES());
        if(map2.get(stationPair) == null) {
            Double[] temp = {0.0,0.0};
            map2.put(stationPair,temp);
        }
        Double[] temp = map2.get(stationPair);
        temp[0] += tDiff;
        temp[1] += 1;
        map2.put(stationPair,temp);
    }
    
    public double getAverageTime(String startStation, String endStation) {
        String stationPair = startStation.concat(endStation);
        Double[] arr = map2.get(stationPair);
        return (arr[0]/arr[1]);
    }
}

class Details {
    String SS, ES;
    int ST, ET;
    
    public void setSS(String SS) {
        this.SS = SS;
    }
    
    public String getSS() {
        return SS;
    }
    
    public void setES(String ES) {
        this.ES = ES;
    }
    
    public String getES() {
        return ES;
    }
    
    public void setST(int ST) {
        this.ST = ST;
    }
    
    public int getST() {
        return ST;
    }
    
    public void setET(int ET) {
        this.ET = ET;
    }
    
    public int getET() {
        return ET;
    }
}