class Bus {
  private int number;
  private Passenger[] passengers;      //*


  public Bus(int number) {
    this.number = number;
    this.passengers = new Passenger[10];
  }

  public int getNumber() {
    return this.number;
  }

  public int personCount() {
    int count = 0;
    for(Passenger passengers : passengers){
      if(passengers != null){
        count++;
      }
    }
    return count;
  }

  public void add(Passenger passenger) {       //*
    if(isBusFull()){
      return;
    }
    int personCount = personCount();
    passengers[personCount] = passenger;
  }


  public boolean isBusFull() {
    return personCount() == passengers.length;
  }








}
