class Bus {
  private int number;
  private Passenger[] passenger;      //*


  public Bus(int number) {
    this.number = number;
    this.passenger = new Passenger[10];
  }

  public int getNumber() {
    return this.number;
  }

  public int personCount() {
    int count = 0;
    for(Passenger passenger : passenger){
      if(passenger != null){
        count++;
      }
    }
    return count;
  }


  
}
