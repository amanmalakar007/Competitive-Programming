class UndergroundSystem {
	HashMap<Integer, RouteDetails> RouteDetailsMap;
	HashMap<String, Integer[]> timeTakenMap;

	public UndergroundSystem() {
		RouteDetailsMap = new HashMap<Integer, RouteDetails>();
		timeTakenMap = new HashMap<String, Integer[]>();
	}

	public void checkIn(int id, String stationName, int t) {
		RouteDetails obj = new RouteDetails();
		obj.setStartStation(stationName);
		obj.setStartTime(t);
		RouteDetailsMap.put(id, obj);
	}

	public void checkOut(int id, String stationName, int t) {
		RouteDetails obj = RouteDetailsMap.get(id);
		obj.setEndStation(stationName);
		obj.setEndTime(t);
		int travelTime = obj.getEndTime() - obj.getStartTime();
		String stationPair = obj.getStartStation() + "->" + obj.getEndStation();
		if (timeTakenMap.get(stationPair) == null) {
			Integer[] temp = { 0, 0 };
			timeTakenMap.put(stationPair, temp);
		}
		Integer[] temp = timeTakenMap.get(stationPair);
		temp[0] += travelTime; // store the total travel-time for each station pair
		temp[1] += 1; // store the total number of passengers for that pair
		timeTakenMap.put(stationPair, temp);
	}

	public double getAverageTime(String startStation, String endStation) {
		String stationPair = startStation + "->" + endStation;
		Integer[] arr = timeTakenMap.get(stationPair);
		return ((double) arr[0] / arr[1]);
	}
}

class RouteDetails {
	String startStation, endStation;
	int startTime, endTime;

	public void setStartStation(String startStation) {
		this.startStation = startStation;
	}

	public String getStartStation() {
		return startStation;
	}

	public void setEndStation(String endStation) {
		this.endStation = endStation;
	}

	public String getEndStation() {
		return endStation;
	}

	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}

	public int getStartTime() {
		return startTime;
	}

	public void setEndTime(int endTime) {
		this.endTime = endTime;
	}

	public int getEndTime() {
		return endTime;
	}
}